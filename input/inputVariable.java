import java.util.Scanner;
import java.lang.Math;

public class inputVariable
{
	public static void main(String args[])
	{
		double radius = System.in.println("What is the radius? ");
		double pi = 3.14159;
		double area;
		
		area = pi * Math.pow(radius, 2);
		System.out.println("The area of a circle of radius " + radius + " is " + area + "/n");
}
	}