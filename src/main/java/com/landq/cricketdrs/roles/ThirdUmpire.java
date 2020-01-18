package com.landq.cricketdrs.roles;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Import;
import org.springframework.stereotype.Component;

import com.landq.cricketdrs.tools.*;

@Component
public class ThirdUmpire {
			@Autowired
			private SnickoMeterTool snickoObj;
			@Autowired
			private LegBeforeWicketTool lbwObj;
	
			public boolean isLBW(){
				if(lbwObj.isLBW() && !snickoObj.isEdge()){
					//System.out.println(snickoObj.isEdge());
					return true;
				}
				else{
					return false;
				}
				
			}
			public boolean isEdged(){
				if(snickoObj.isEdge()){
					return true;
				}
				else{
					return false;
				}
			}
}
