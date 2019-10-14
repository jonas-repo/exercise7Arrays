package com.exercise7arrays.app;

public class Arrays1D {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Constant declaration
		final int ELEMENTS_ARRAY = 10;
		
		
		//arrays declaration
		//first way
		int[] intArray = new int[ELEMENTS_ARRAY];
		char[] charArray = new char[ELEMENTS_ARRAY];
		boolean[] boolArray = new boolean[ELEMENTS_ARRAY];
		double[] doubleArray = new double[ELEMENTS_ARRAY];
		String[] stringArray = new String[ELEMENTS_ARRAY];
		
		//arrays declaration
		//second way
		int[] intArrays2 = {10,20,30,40,50,60};
		char[] charArray2 = {'a','b','c','d','e','f'};
		boolean[] boolArray2 = {true,false,true,false,true};
		double[] doubleArray2 = {1.0,2.0,3.0,4.0,5.0};
		String[] stringArray2 = {"first","second","third","fourth","fifth"};
		
		for(int i = 0; i<intArrays2.length; i++)
		{
			System.out.println(intArrays2[i]);
		}
		for(int i = 0; i<charArray2.length; i++)
		{
			System.out.println(charArray2[i]);
		}
		for(int i = 0; i<boolArray2.length; i++)
		{
			System.out.println(boolArray2[i]);
		}
		for(int i = 0; i<doubleArray2.length; i++)
		{
			System.out.println(doubleArray2[i]);
		}
		for(int i = 0; i<stringArray2.length; i++)
		{
			System.out.println(stringArray2[i]);
		}
		
	}

}
