package Access_Mod;

class Test {
	private int a = 10;
	private void display () {
		System.out.println("Private Method");
	}
}

public class Private_AM {
	public static void main(String[] args)
	{
		Test o = new Test ();
		System.out.println(o.a);
		o.display();
	}

}
