package com.codility;
import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import com.codility.L2OddOccurrencesInArray;

public class L2OddOccurrencesInArrayTest {

	L2OddOccurrencesInArray service;
	
	int A[] = {9,3,9,3,9,7,9}; 
	int last[] = {9,3,9,3,7}; 
	int start[] = {1,2,2,3,3}; 
	int three[] = {3,2,2,3,3,2,2}; 
	int middle[] = {9,3,9,4,3};
	int one[] = {1}; 
	
	@Before
	public void setup() {
		service = new L2OddOccurrencesInArray();
	}
	
	@Test
	public void test_OneElelement() {		
		assertEquals(1,service.solution(one));
	}		

	@Test
	public void test_ThreeElelement() {		
		assertEquals(3,service.solution(three));
	}	
	
	@Test
	public void test_lastElelementNotPairedCallOk() {
		assertEquals(7,service.solution(last));
	}
	
	@Test
	public void test_middleElelementNotPairedCallOk() {
		assertEquals(4,service.solution(middle));
	}	
	@Test
	public void test_firstElelementNotPairedCallOk() {
		assertEquals(1,service.solution(start));
	}
	

}
