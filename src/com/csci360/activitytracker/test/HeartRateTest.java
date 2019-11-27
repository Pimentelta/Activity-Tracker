package com.csci360.activitytracker.test;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.jupiter.api.Test;

import com.csci360.activitytracker.model.HeartRate;




class HeartRateTest {
	//private HeartRate JohnDoe;
	
	@Before
	void setUp() {
		//JohnDoe = new HeartRate();
	}

	@Test
	void averageTest() {
		boolean withinRange = false;
		for (int i = 0; i<5; i++) {
			withinRange = false;
			int x = HeartRate.average();
			
			if ((x<=120)&&(x>=45)) {
				withinRange = true;
			}
			assertTrue(withinRange);
		}
	}
	
	
	@Test
	void hrLogTest() {
		int[] temp = HeartRate.hrLog(500);
		boolean allInRange = true;
		for (int i = 0; i < temp.length; i++) {
			if((temp[i]<50)||(temp[i]>120)) {
				allInRange = false;
			}
		}
		assertEquals(allInRange, true);
		}
	
	@Test
	void rngTest() {
		boolean[] tester = new boolean[50];
		for (int i = 0; i <50; i++) {
			if ((HeartRate.rng()>=45)&&(HeartRate.rng()<=120)) {
				tester[i]=true;
			}
			else {
				tester[i] = false;
			}
		}
		for(int i =0 ; i < tester.length; i++) {
			assertEquals(true, tester[i]);
			
		}
		
	}
}
