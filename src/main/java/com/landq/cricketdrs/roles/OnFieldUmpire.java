package com.landq.cricketdrs.roles;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class OnFieldUmpire {
	@Autowired
	ThirdUmpire third_umpire;
	
	public String isLBW(){
		if(third_umpire.isLBW()){
			return "Out";
		}
		else{
			return "Not Out";
		}
		
	}
	public String isCatch(){
		if(third_umpire.isEdged()){
			return "Out";
		}
		else{
			return "Not Out";
		}
	}
}
