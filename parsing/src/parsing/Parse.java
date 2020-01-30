package parsing;
import java.util.*;
public class Parse 
{
	public static void main(String[] args)
	{
		Scanner scnObj=new Scanner(System.in);
		System.out.println("Enter two numbers");
		String a = scnObj.next();
		String b = scnObj.next();
		double i= Double.parseDouble(a);
		double j = Double.parseDouble(b);
		System.out.println("The Output is : " +(i*j));
		


	}

}
