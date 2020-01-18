package com.landq.cricketdrs.main;

import java.util.Scanner;

import org.springframework.boot.SpringApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

import com.landq.cricketdrs.config.*;
import com.landq.cricketdrs.roles.Bowler;
import com.landq.cricketdrs.tools.*;


public class Main {

	public static void main(String[] args) {
	ConfigurableApplicationContext context=SpringApplication.run(Config.class);
	
	Bowler bowling=context.getBean(Bowler.class);
	SnickoMeterTool s_tool=context.getBean(SnickoMeterTool.class);
	LegBeforeWicketTool lbw_tool=context.getBean(LegBeforeWicketTool.class);
	
	System.out.println("Checking for LBW");
	lbw_tool.setLegBeforeWicket(true);
	bowling.isLBW();
	
	flush(bowling,s_tool,lbw_tool);
	//affects current result, if not flushed
	/*s_tool.setSound(true);
	bowling.isCatch(); 
	
	flush(bowling,s_tool,lbw_tool);
	lbw_tool.setLegBeforeWicket(true);
	bowling.isLBW();*/
	
	Scanner s=new Scanner(System.in);
	String opt="YES";
	do{
		System.out.println("choose any of following option");
		System.out.println("1. Check LBW ");
		System.out.println("2. Check Catch");
		int a=s.nextInt();
		switch(a){
		case 1:System.out.println("is leg before wicket? yes or No");
				lbw_tool.setLegBeforeWicket(s.next().equalsIgnoreCase("yes"));
				System.out.println("SnickoMeter reading is true ? yes or No");
				s_tool.setSound(s.next().equalsIgnoreCase("yes"));
				bowling.isLBW();
				flush(bowling,s_tool,lbw_tool);
				System.out.println("Do you want to continiue? yes or no?");
				opt=s.next();
				break;
		case 2: System.out.println("SnickoMeter reading is true ? Yes or No");
				s.nextLine();
				s_tool.setSound(s.next().equalsIgnoreCase("yes"));
				bowling.isCatch();
				flush(bowling,s_tool,lbw_tool);
				System.out.println("Do you want to continiue ? yes or no?");
				opt=s.next();
				break;
		default : System.out.println("Invalid input ! Exiting..........");
				System.exit(0);
		}
		
	}while(opt.equalsIgnoreCase("yes"));
		s.close();
		System.out.println("Thanks !");
	
	

	}
	static void flush(Bowler bowling,SnickoMeterTool s_tool,LegBeforeWicketTool lbw_Tool){
		s_tool.setSound(false);
		lbw_Tool.setLegBeforeWicket(false);
	}
}
