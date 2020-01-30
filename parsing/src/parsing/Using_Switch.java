package parsing;
import java.util.*;
public class Using_Switch 
{
public static void main(String[] args)
{
	Scanner s = new Scanner(System.in);
	System.out.println("Enter a number from 1 to 7");
	//String a = s.next();
	int d = s.nextInt();
	//int d = Integer.parseInt(a);
	switch (d) 
	{
	case 1: System.out.println("SUNDAY");break;
	case 2: System.out.println("MONDAY"); break;
	case 3: System.out.println("TUESDAY");break;
	case 4: System.out.println("WEDNESDAY");break;
	case 5: System.out.println("THURSDAY");break;
	case 6: System.out.println("FRIDAY");break;
	case 7: System.out.println("SATURDAY");break;
			

	default:System.out.println("Error.... Please Check...........");
		break;
	}
}
}
