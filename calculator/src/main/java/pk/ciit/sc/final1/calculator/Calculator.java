package pk.ciit.sc.final1.calculator;

public class Calculator 
{
	/**
	 * You have to provide three integer numbers
	 * @param num1 is number1
	 * @param num2 is number2
	 * @param num3 is number-3
	 * @return returns the maximum number
	 */
	
	public int findMax(int num1, int num2, int num3) 
	{
		int[] arr = { num1, num2, num3 };
		int max = 0;
		for (int i = 1; i < arr.length; i++) 
		{
			if (arr[i] > max)
				max = arr[i];
		}
		
		return max;
	}
	
	/**
	 * Finds the square of a number
	 * @param num is the number you want to find square of
	 * @return returns the square of number
	 * @throws IllegalArgumentException in case if you enter any thing other than integer
	 */
	
	
	public int square(int num) throws IllegalArgumentException 
	{
		int result = 0;
		
		if (num > 0 && num < 10) 
		{
		result = num * num;
		}
		
		else
			throw new IllegalArgumentException();
		
		return result;
	}
	
	/**
	 * Finds the cube of a number
	 * @param num is the number you want to find cube of
	 * @return returns the cube of a number
	 * @throws IllegalArgumentException in case if you enter any thing other than integer
	 */
	
	public int cube(int num) throws IllegalArgumentException 
	{
		 if (num > 0 && num < 10) 
		{
		return num * num * num;
		}
		else
			throw new IllegalArgumentException();
		
	}
}
