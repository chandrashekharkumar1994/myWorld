package com.landq.drs.test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import com.landq.cricketdrs.tools.*;

public class SnickoMeterTest {
	static int i=1;
	@Before
	public void testStart(){
		System.out.println("SnickoMeterTool Test"+i+" satrts here..");
		System.out.println("_________________________________________________________");
	}
	@Test
	public void SnickoMeterTestForTrue() {
		SnickoMeterTool snicko_tool=new SnickoMeterTool();
		snicko_tool.setSound(true);
		Assert.assertEquals(true,snicko_tool.isEdge());
	}
	
	@Test
	public void SnickoMeterTestForFalse(){
		SnickoMeterTool snicko_tool=new SnickoMeterTool();
		snicko_tool.setSound(false);
		Assert.assertEquals(false, snicko_tool.isEdge());
	}
	@After
	public void testEnd(){
		System.out.println("SnickoMeterTool Test"+i+" Ends here..");
		System.out.println("_________________________________________________________");
		i++;
	}

}
