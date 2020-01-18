package com.landq.drs.test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.mockito.runners.MockitoJUnitRunner;

import com.landq.cricketdrs.roles.ThirdUmpire;
import com.landq.cricketdrs.tools.*;

import org.junit.Assert;

@RunWith(MockitoJUnitRunner.class)
public class ThirdUmpireTest {
	@Mock
	SnickoMeterTool snicko_meter_tool;
	@Mock
	LegBeforeWicketTool lbw_tool;
	@InjectMocks
	ThirdUmpire ThirdUmpireMock;
	
	@Before
	public void setUp(){
		System.out.println("ThirdUmpire Test Starts here..");
		System.out.println("___________________________________________");
		MockitoAnnotations.initMocks(this);
		
	}
	
	@Test //For snicko_meter_tool=true;
	public void is_catch_taken_for_edged(){
		Mockito.when(snicko_meter_tool.isEdge()).thenReturn(true);
		Assert.assertEquals(true,ThirdUmpireMock.isEdged());
	}
	
	@Test //For snicko_meter_tool=false;
	public void is_catch_taken_for_not_edged(){
		Mockito.when(snicko_meter_tool.isEdge()).thenReturn(false);
		//Mockito.when(lbw_tool.isLBW()).thenReturn(false);
		Assert.assertEquals(false,ThirdUmpireMock.isEdged());
	}
	
	@Test //For LBW TOOL=false;
	public void ThirdUmpireIsLBWFalse(){
		Mockito.when(lbw_tool.isLBW()).thenReturn(true);
		Mockito.when(snicko_meter_tool.isEdge()).thenReturn(true);
		Assert.assertEquals(false,ThirdUmpireMock.isLBW());
		System.out.println("1 passed");
		Mockito.when(lbw_tool.isLBW()).thenReturn(false);
		//Mockito.when(snicko_meter_tool.isEdge()).thenReturn(false);
		Assert.assertEquals(false,ThirdUmpireMock.isLBW());
		System.out.println("2 passed");
		Mockito.when(lbw_tool.isLBW()).thenReturn(false);
		//Mockito.when(snicko_meter_tool.isEdge()).thenReturn(true);
		Assert.assertEquals(false,ThirdUmpireMock.isLBW());
		System.out.println("3 passed");
	}
	@Test //For LBW TOOL=true;
	public void ThirdUmpireIsLBWTrue(){
		Mockito.when(lbw_tool.isLBW()).thenReturn(true);
		Mockito.when(snicko_meter_tool.isEdge()).thenReturn(false);
		Assert.assertEquals(true,ThirdUmpireMock.isLBW());
		
		
	}
	@After
	public void testEnds(){
		System.out.println("ThirdUmpire Test Ends here..");
		System.out.println("___________________________________________");
		
		
	}

}



