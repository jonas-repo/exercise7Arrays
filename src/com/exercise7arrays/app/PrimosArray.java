package com.exercise7arrays.app;
import java.util.Random;

public class PrimosArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Constant declaration
		final int ELEMENTS_ARRAY = 100;
		
		//Variable declaration
		byte primeNumbers=0;
		boolean isPrime = true;
		
		//array declaration
		byte[] vector1 = new byte[ELEMENTS_ARRAY];
		
		//Objects declaration
		Random random = new Random(System.nanoTime());
		
		//initialize
		for (int i = 0; i < ELEMENTS_ARRAY; i++) {
			vector1[i] =(byte) random.nextInt(101);
		}
		
		for (int i = 0; i < ELEMENTS_ARRAY; i++) {
			isPrime = true;
			for (int j = 2; j < vector1[i]; j++) {
				if(vector1[i] % j == 0)
				{
					isPrime =false;
					break;
				}
			}
			if(isPrime)
			{
				primeNumbers++;
			}
		}
		
		System.out.println("The number of prime numbers is: " + primeNumbers );
	}
	
	

}
