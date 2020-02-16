import java.util.Scanner;
import java.lang.Math;
public class inputExamples2
{
	public static void main (String[] args)
	{
		Scanner input = new Scanner(System.in);
		System.out.print("Please give an integer value: ");
		int val = input.nextInt();
		System.out.println("The value is : " + val);
		
		//finding the square and root of the number
		//use the math class
		double squareVal = Math.pow(val, 2);
		System.out.println("The square of the value is: " + squareVal);
		System.out.println("The square root of the value is: " + Math.sqrt(val));
	}
}
