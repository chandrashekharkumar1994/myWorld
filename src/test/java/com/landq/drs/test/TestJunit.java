package com.landq.drs.test;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.springframework.context.annotation.Bean;

import com.landq.cricketdrs.roles.OnFieldUmpire;
import com.landq.cricketdrs.roles.ThirdUmpire;

public class TestJunit {

	@Mock
	ThirdUmpire third_umpire;

	@InjectMocks
	OnFieldUmpire fieldUmpire= new OnFieldUmpire();
	
	@Before
	public void init() {
		MockitoAnnotations.initMocks(this);
	}
	
	@Test
	public void test() {
		
		Mockito.when(this.third_umpire.isLBW()).thenReturn(true);
		try{
			String res = fieldUmpire.isCatch();
			
			Assert.assertNotNull(res);
			Assert.assertEquals("Out", res);
		} catch (Exception e) {
			Assert.fail("Exception is not expected");
		}
		
	}
}
