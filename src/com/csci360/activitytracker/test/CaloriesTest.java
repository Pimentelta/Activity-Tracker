package notjava;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CaloriesTest {
	Calories cal = new Calories();


	
	@Test
	void caloriesBurnedTest() {
		assertEquals(90.49, cal.caloriesBurned(2308));
		assertEquals(0.03, cal.caloriesBurned(1));
		assertEquals(0, cal.caloriesBurned(0));
		assertEquals(392.07, cal.caloriesBurned(10000));
	}

}
