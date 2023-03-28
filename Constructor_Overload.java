package Constructor;

public class Constructor_Overload {
	int age;
	String name;
	String address;
	Constructor_Overload(int a,String n)
	{
		age = a;
		name = n;
	}
	Constructor_Overload(int a,String n,String add)
	{
		age = a;
		name = n;
		address = add;
	}
public void show()
{
	System.out.println("Name : "+name+" Age :"+age+" Address :"+address);
}
public static void main(String args[])
{
	Constructor_Overload o = new Constructor_Overload(1,"Vivek");
	Constructor_Overload ob = new Constructor_Overload(2,"Vinod","Pune");
	o.show();
	ob.show();
}
}
