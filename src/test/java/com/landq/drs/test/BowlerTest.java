package com.landq.drs.test;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;

import com.landq.cricketdrs.roles.Bowler;
import com.landq.cricketdrs.roles.OnFieldUmpire;

public class BowlerTest {
	@Mock
	OnFieldUmpire on_field_umpire;
	@InjectMocks
	Bowler bowler;
	static int i=1;
	@Before
	public void testStart(){
		System.out.println("Bowler Test"+i+" satrts here..");
		System.out.println("_________________________________________________________");
	}
	@Test
	public void Bowler_isLBW_func_true() {
		final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
		System.setOut(new PrintStream(outContent));
		//Mockito.when(on_field_umpire.isLBW()).thenReturn("Out");
		//bowler.isLBW();
		//Assert.assertEquals("Out",outContent.toString());
		
	}
	@After
	public void testEnd(){
		System.out.println("Bowler Test"+i+" Ends here..");
		System.out.println("_________________________________________________________");
		i++;
	}

}
