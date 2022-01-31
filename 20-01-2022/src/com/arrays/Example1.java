package com.arrays;

public class Example1 {

	public static void main(String[] args) 
	{
		/**
		 * Write a java program to print employee ages using java array.
		 */
		
		//int employeeAge = 24, 25, 26;
		
		int employeeAges[] = {23, 24, 25, 26, 27};
		
		System.out.println("Elements count in an array: "+employeeAges.length);
		
		System.out.println("===================");
		
		//how to print values of an array
		
				/**
				 * Note: In java an array works based index concept, so array index starts from
				 *       zero(0) and ends with length-1 or size-1.
				 */
				
				for(int i = 0; i < employeeAges.length; i++)
				{
					System.out.println(employeeAges[i]);
				}
				
                System.out.println("===================");
				
				System.out.println(employeeAges[4]);
				
	}

}
