package Method;

import java.util.Scanner;

public class User_DefinedEx2
{
public static void pn(int n) 
{
	if (n>0)
	{
		System.out.println("P");
	}
	else
	{
		System.out.println("N");
	}
}
	public static void main(String args[])
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enetr N :");
		int n = s.nextInt();
		pn(n);
	}
}
