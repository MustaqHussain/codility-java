package com.codility;
import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class TemplateTest {

	TDDTemplate service;
	
	@Before
	public void setup() {
		service = new TDDTemplate();
	}

	@Test
	public void givenABCWhenPQRThenXYZ() {
		assertEquals(0,service.solution(""));
	}
	
		
	@Test(expected = RuntimeException.class)
	public void givenABCWhenPQRThenXYZExceptio() {
		service.solution("");
	}	
}
