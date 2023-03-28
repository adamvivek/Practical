package Method;

public class User_Defined {
		public int add(int a, int b)
		{
		
			return a+b;
		}
public static void main(String args[])
{
	User_Defined o = new User_Defined();
	System.out.println(o.add(20, 3));
}
}
