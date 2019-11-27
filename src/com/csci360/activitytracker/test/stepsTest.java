package com.csci360.activitytracker.test;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.jupiter.api.Test;

import com.csci360.activitytracker.model.steps;

class stepsTest {
	@Before
	public void setUp() {
	}
	
	//this tests to make sure that rng is generating numbers
	//less than or equal to 100
	@Test
	void rngTest() {
		boolean[] tester = new boolean[50];
		for (int i = 0; i <50; i++) {
			if (steps.rng()<=100) {
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
	//this test ensures that addSteps successfully sums and stores the steps passed to it
	@Test
	void addStepsTest() {
		
		int[] tempSteps = steps.addSteps(50);
		assertTrue((tempSteps[49]<5000)&&(tempSteps[49]>0));
	}

}
