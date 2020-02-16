import java.util.Scanner;
public class inputExamples
{
	public static void main(String[] args)
	{
		//create object to scan the cmd
		Scanner input = new Scanner(System.in);
		//scanf reading either the whole line or just a single word
		System.out.print("Please give your name: ");
		//System.out.println("Please give your name");
		String name = input.nextLine();
		//String name = input.nextLine();
		System.out.println("Welcome to cmpg " + name);
		System.out.printf("I hope you enjoy the module, %s\n", name);
	}
	
}