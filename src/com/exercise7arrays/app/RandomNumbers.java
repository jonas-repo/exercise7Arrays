package com.exercise7arrays.app;
import java.util.Random;

public class RandomNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//constants
		final int ELEMENTS_ARRAY = 100;
		
		//variable declaration
		double generatedNumber = 0;
		int generatedNumberInt = 0;
		byte generatedArrayByte = 0;
		byte evenValues = 0;
		byte oddvalues = 0;
		byte zeroValues = 0;
		byte positiveValues = 0;
		byte negativeValues = 0;
		
		
		byte[] miArray = new byte[ELEMENTS_ARRAY];
		
		//array random numbers class
		Random randomNumbers = new Random(System.currentTimeMillis());
		for(int i=0; i<ELEMENTS_ARRAY; i++)
		{
			generatedNumber = randomNumbers.nextDouble();
			System.out.println(generatedNumber);
		}
		
		for(int i=0; i<ELEMENTS_ARRAY; i++)
		{
			generatedNumberInt = randomNumbers.nextInt(51)+50; //numbers from 51 to 100 random
			System.out.println(generatedNumberInt);
		}
		//way 2 by math class
		for(int i =0; i< ELEMENTS_ARRAY; i++)
		{
			generatedNumberInt =(int) (Math.random()*51+50);
			System.out.println(generatedNumberInt);
		}
		
		// pass to initialize
		for(int i = 0; i < miArray.length; i++)
		{
			generatedArrayByte =(byte) randomNumbers.nextInt(101);
			miArray[i] = generatedArrayByte;
											
		}
		
		//pass to process
		for (int i = 0; i < ELEMENTS_ARRAY; i++) {
			if(miArray[i] == 0)
			{
				zeroValues++;
			}
			else if(miArray[i] % 2 == 0)
			{
				evenValues++;
			}
			else if(miArray[i] % 2 == 1)
			{
				oddvalues++;
			}
			if(miArray[i] >0)
			{
				positiveValues++;
			}
			if(miArray[i] < 0)
			{
				negativeValues++;
			}
		}
		System.out.println("Zeros quantity: " + zeroValues);
		System.out.println("Even quantity: " + evenValues);
		System.out.println("Odd quantity: " + oddvalues);
		System.out.println("Positive quantity: " + positiveValues);
		System.out.println("Negative quantity: " + negativeValues);
	
		
	}

}
