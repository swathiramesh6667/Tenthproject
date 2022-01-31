package com.arrayTypes;

	/**
	 * 2. MultiDimensional Array: 
	 *
	 */
	public class Example4 
	{


		//MultiDimensional Array in multiple lines
		public static void main(String[] args)
		{

			//declaration and instantiation(An array object creation)
			int customerIds[][] = new int[3][3];
			
			//initialization
			customerIds[0][0] = 2020;
			customerIds[0][1] = 3983;
			customerIds[0][2] = 2010;
			
			customerIds[1][0] = 4589;
			customerIds[1][1] = 3920;
			customerIds[1][2] = 4577;
			
			customerIds[2][0] = 3920;
			customerIds[2][1] = 3999;
			customerIds[2][2] = 6610;

			for(int i = 0; i < customerIds.length; i++)
			{
				for(int j = 0; j < customerIds.length; j++)
				{
					System.out.println(customerIds[i][j]);
				}
			}
			
			System.out.println("===================");
			
			for(int i = 0; i < customerIds.length; i++)
			{
				for(int j = 0; j < customerIds.length; j++)
				{
					System.out.print(customerIds[i][j]+"\t");
				}
				System.out.println("\n\n\n");
			}
			
		}

	}
