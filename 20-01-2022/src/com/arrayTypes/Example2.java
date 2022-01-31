package com.arrayTypes;

public class Example2 {

		//single dimensional array in multiple lines
		public static void main(String[] args)
		{

			//declaration and instantiation(An array object creation)
			int customerIds[] = new int[5];
			
			//initialization
			customerIds[0] = 2020;
			customerIds[1] = 3983;
			customerIds[2] = 2010;
			customerIds[3] = 4589;
			customerIds[4] = 3920;

			for(int i = 0; i < customerIds.length; i++)
			{
				System.out.println(customerIds[i]);
			}
		}
	}