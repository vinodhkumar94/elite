package parsing;

public class Recursive_addnumbers 
{
	public static void main(String[] args)
	{
		m1(1);
				}
	static void m1(int i)
	{
		if(i==4) return;
		System.out.println("i = " +i);
		m1(i+1);
		System.out.println("i+1 = " +i);
		return;
	}

}
