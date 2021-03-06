/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package com.landq.drs.test;

import org.junit.Test;
import org.junit.After;
import org.junit.Assert;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.mockito.runners.MockitoJUnitRunner;

import com.landq.cricketdrs.roles.OnFieldUmpire;
import com.landq.cricketdrs.roles.ThirdUmpire;

import org.junit.Before;

@RunWith(MockitoJUnitRunner.class)
public class OnFieldUmpireTest {
	static int i=1;
	@Mock
	ThirdUmpire ThirdUmpireMockObj;
    @InjectMocks
    OnFieldUmpire OnFieldUmpireMock;
    
    @Before
   public void startTest(){
    	System.out.println("OnFieldUmpire Test Starts"+i+" here.");
    	System.out.println("______________________________________________");
    	MockitoAnnotations.initMocks(this);
    }
    
  
    @Test//Testing OnFieldUmpire.isLBW() for ThirdUmpire.isLBW=true;
    public void OnFieldUmpireForLBWTrue(){
    	System.out.println("Testing OnFieldUmpire.isLBW() for ThirdUmpire.isLBW=true;");
    	
    	Mockito.when(ThirdUmpireMockObj.isLBW()).thenReturn(true);
    	Assert.assertEquals("Out",OnFieldUmpireMock.isLBW());
    	
    }
    @Test//Testing OnFieldUmpire.isLBW() for ThirdUmpire.isLBW=False;
    public void OnFieldUmpireForLBWFalse(){
    	System.out.println("Testing OnFieldUmpire.isLBW() for ThirdUmpire.isLBW=true;");
    	
    	Mockito.when(ThirdUmpireMockObj.isLBW()).thenReturn(false);
    	Assert.assertEquals("Not Out",OnFieldUmpireMock.isLBW());
    	
    }
    
    @Test//Testing OnFieldUmpire.isCatch() For ThirdUmpire.isLBW=true;
    public void OnFieldUmpireForCatchTrue(){
    	System.out.println("Testing OnFieldUmpire.isCatch() For ThirdUmpire.isCatch=true;");
    	
    	Mockito.when(ThirdUmpireMockObj.isEdged()).thenReturn(true);
    	Assert.assertEquals("Out",OnFieldUmpireMock.isCatch());
    }
    
    @Test//Testing OnFieldUmpire.isCatch() For ThirdUmpire.isLBW=true;
    public void OnFieldUmpireForCatchFalse(){
    	System.out.println("Testing OnFieldUmpire.isCatch() For ThirdUmpire.isCatch=false;");
    	
    	Mockito.when(ThirdUmpireMockObj.isEdged()).thenReturn(false);
    	Assert.assertEquals("Not Out",OnFieldUmpireMock.isCatch());
    }
    @After
	public void testEnd(){
		System.out.println("OnFieldUmpire Test"+i+" Ends here");
		System.out.println("_________________________________________________________");
		i++;
	}
    
}
