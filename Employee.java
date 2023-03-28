package Method;

class Employee {
	  private String name1,name2,name3,name4,name5;

	  // constructor
	  Employee() {
	    System.out.println("Constructor Called:");
	    name1 = "A";
	    name2 = "B";
	    name3 = "C";
	    name4 = "D";
	    name5 = "E";
	  }

	  public static void main(String[] args) {

	    // constructor is invoked while
	    // creating an object of the Main class
		Employee obj = new Employee();
	    System.out.println("1st Employee name is " + obj.name1);
	    System.out.println("2nd Employee name is " + obj.name2);
	    System.out.println("3rd Employee name is " + obj.name3);
	    System.out.println("4th Employee name is " + obj.name4);
	    System.out.println("5th Employee name is " + obj.name5);
	  }
	}