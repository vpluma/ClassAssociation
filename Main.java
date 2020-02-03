// DRIVER (Tester) Class
// Repl.it uses 'Main.java' for all DRIVER classes
public class Main 
{
  // Main method -- starts all Java programs
  public static void main(String[] args) 
  {
	// Create Address instance with No-Arg Constructor
	// An Address object is an instance variable in Student objects
    Address address1 = new Address();
	// Create Student instance with No-Arg Constructor
	Student student1 = new Student();
	// Print Student instance with Student toString()
	System.out.println(student1.toString());
	// ----------------------------------------
	// Create Address instance with No-Arg Constructor
	// An Address object is an instance variable in Student objects
	Address address2 = new Address();
	// Create Student instance with Parameterized Constructor
	Student student2 = new Student("Joe Jonas", "392810", "4.125", "2017", address2);
	// Print Student instance with Student toString()
	System.out.println(student2);
	// ----------------------------------------
	// Create Address instance with Parameterized Constructor
	Address address3 = new Address("674", "Main St.", "Denver", "70210");
	// Change/Set the 'state' static variable in Address
	Address.setState("CO");
	// Create Student instance with 4 No-Arg and 1 Parameter Constructor
	Student student3 = new Student(address3);
	// Print Student instance with Student toString()
	System.out.println(student3);
	// ----------------------------------------
	// Create Address instance with Parameterized Constructor
	Address address4 = new Address("3928", "Broadway", "New York", "21010");
	// Change/Set the 'state' static variable in Address
	Address.setState("NY");
	// Create Student instance with Parameterized Constructor
	Student student4 = new Student("Taylor Swift", "288221","3.667", "2016", address4);
	// Print Student instance with Student toString()
	System.out.println(student4);
	// ----------------------------------------
	// Create Address instance with Parameterized Constructor
	Address address5 = new Address("9211", "Calle Ocho", "Miami", "20210");
	// Change/Set the 'state' static variable in Address
	Address.setState("FL");
	// Create Student instance with Parameterized Constructor
	Teacher teacher1 = new Teacher("Selina Gomez", "Math",true, address5);
	// Print Student instance with Student toString()
	System.out.println(teacher1);
	
  } // end of main method
}  // end of Main class