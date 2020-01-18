package com.landq.cricketdrs.tools;

import org.springframework.stereotype.Component;

@Component
public class LegBeforeWicketTool {
	private boolean leg_before_wicket;
	
	public void setLegBeforeWicket(boolean leg_before_wicket){
		this.leg_before_wicket=leg_before_wicket;
		//System.out.println(leg_before_wicket);
	}
	public boolean getLegBeforeWicket(){
		
		return leg_before_wicket;
	}
	public boolean isLBW(){
		if(leg_before_wicket){
			return true;
		}
		else{
		return false;
		}
	}
}
