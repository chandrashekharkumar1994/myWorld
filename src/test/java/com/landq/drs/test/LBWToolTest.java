package com.landq.drs.test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.landq.cricketdrs.tools.LegBeforeWicketTool;

public class LBWToolTest {
	static int i=1;
	
	@Before
	public void testStart(){
		System.out.println("LBWTool Test"+i+" satrts here..");
		System.out.println("_________________________________________________________");
	}
	@Test
	public void LBWTestForTrue() {
		LegBeforeWicketTool lbw_tool=new LegBeforeWicketTool();
		lbw_tool.setLegBeforeWicket(true);
		assertEquals(true, lbw_tool.isLBW());
		
	}
	@Test
	public void LBWTestForFalse() {
		LegBeforeWicketTool lbw_tool=new LegBeforeWicketTool();
		lbw_tool.setLegBeforeWicket(false);
		assertEquals(false, lbw_tool.isLBW());
		
	}
	@After
	public void testEnd(){
		System.out.println("LBWTool Test"+i+" Ends here..");
		System.out.println("_________________________________________________________");
		i++;
	}
}
