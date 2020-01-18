package com.landq.cricketdrs.roles;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Bowler {
	@Autowired
	public OnFieldUmpire on_field_umpire;
	
	public void isLBW(){
		System.out.println(on_field_umpire.isLBW());
	}
	public void isCatch(){
		System.out.println(on_field_umpire.isCatch());
	}
	
}
