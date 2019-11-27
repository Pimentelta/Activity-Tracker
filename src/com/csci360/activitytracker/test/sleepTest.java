package com.csci360.activitytracker.test;

import static org.junit.Assert.*;
import java.util.Arrays;
import org.junit.Before;
import org.junit.jupiter.api.Test;

import com.csci360.activitytracker.model.sleep;

public class sleepTest {
	@Before
	public void setUp() {
		//sleep sleep = new sleep();
	}
	
	
	@Test
	void isAsleepTest() {
		assertEquals(false, sleep.isAsleep(99999));
		assertEquals(false, sleep.isAsleep(80));
		assertEquals(false, sleep.isAsleep(75));
		assertEquals(false, sleep.isAsleep(74));
		assertEquals(false, sleep.isAsleep(64));
		assertEquals(true, sleep.isAsleep(63));
		assertEquals(true, sleep.isAsleep(50));
		assertEquals(true, sleep.isAsleep(40));	
	}
	@Test
	void makeSleepLogTest() {

		//make 5 arrays of integers to store heart rates
		int[] false1 = new int[10];
		int[] false2 = new int[10];
		int[] true1 = new int[10];
		int[] true2 = new int[10];
		int[] true3 = new int[10];
		
		//populate arrays with heart rates
		Arrays.fill(false1, 74);
		Arrays.fill(false2, 75);
		Arrays.fill(true1, 63);
		Arrays.fill(true2, 62);
		Arrays.fill(true3, 48);
		
		//pass arrays and store boolean array (true= asleep, false= awake)
		boolean[] testArray1 = sleep.makeSleepLog(false1);
		boolean[] testArray2 = sleep.makeSleepLog(false2);
		boolean[] testArray3 = sleep.makeSleepLog(true1);
		boolean[] testArray4 = sleep.makeSleepLog(true2);
		boolean[] testArray5 = sleep.makeSleepLog(true3);
		
		//loop through boolean arrays to test makesleeplog() is working
		for(int i = 0; i < false1.length; i++) {
			assertEquals(false, testArray1[i]);
		}
		for(int i = 0; i < false2.length; i++) {
			assertEquals(false, testArray2[i]);
		}
		for(int i = 0; i < true1.length; i++) {
			assertEquals(true, testArray3[i]);
		}
		for(int i = 0; i < true2.length; i++) {
			assertEquals(true, testArray4[i]);
		}
		for(int i = 0; i < true3.length; i++) {
			assertEquals(true, testArray5[i]);
		}
		
		
	}

}
