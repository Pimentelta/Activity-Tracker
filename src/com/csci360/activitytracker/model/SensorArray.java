package com.csci360.activitytracker.model;
import java.util.Random;
import java.util.UUID;
//need to simulate a sensor
public class SensorArray {

	void beginSession() {
		
	}
	void sessionInitialized() {
		
	}
	void stopRecordingData() {
		
	}
	void dataNotBeingRecorded() {
		
	}
	void display( String notRecordingIcon) {
		
	}
//}

//This is a sample program to generate a random numbers using rand() and srand()
//rand() gives long random numbers
//srand() provides unique numbers
// public class Rand_and_Sand{
  public static void main(String args[])
  {
      System.out.println("The numbers using rand");
      for(int i=0; i<5; i++)
      {
          Random rand = new Random();
          System.out.println(Math.abs(rand.nextInt()));
      }

      System.out.println("The numbers using srand");
      for(int i=0; i<5; i++)
      {
          System.out.println(Math.abs(UUID.randomUUID().getMostSignificantBits()));
      }
  }
}