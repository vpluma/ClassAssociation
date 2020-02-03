// Concrete Class
// A Class Association (HAS-A) relationship exists
// ...between Student and Address
// It's 'Aggregation' if classes are independent of each other
// It's 'Composition' if classes are dependent of each other
public class Student
{
	// instance variable(s) - reference data type 
	private String name, id, gpa, gradYear;
	// instance variable - user-defined reference data type
	private Address addr;

	// static (class) variables - reference data type(s)
	private static String school = "Norwalk High";

	// (1) In Java, the 'default' (NULL) constructor is overriden
	// ...when you create one or more constructors
	// (2) 'Overloading' constructors occurs when you create 
	// ... more than one constructor

	// No-Arg Constructor
	public Student()
	{
		// 'this' is optional here
		this.name = "Keyser Söze";  // no-arg
		this.id = "254265";  // no-arg
		this.gpa = "3.0";  // no-arg
		this.gradYear = "2020"; // no-arg
		// new Address() calls No-Arg constructor
		this.addr = new Address(); 
	}
	// 1 Parameter & 4 No-Arg Constructor
	public Student(Address addr)
	{
		// 'this' is optional for name, id, gpa, gradYear
		// 'this' is required for addr
		this.name = "Keyser Söze";  // no-arg
		this.id = "254265";  // no-arg
		this.gpa = "3.0";  // no-arg
		this.gradYear = "2020"; // no-arg
		// Address object passed in with addr
		this.addr = addr;  
	}
	// 5 Parameter Constructor
	public Student(String name, String id, String gpa, String gradYear, Address addr)
	{
		// 'this' is required here
		this.name = name;
		this.id = id;
		this.gpa = gpa;
		this.gradYear = gradYear;
		// Address object passed in
		this.addr = addr; 
	}
	
	// Getter (Accessor) Instance Method
	public String getName()
	{
		// 'this' is optional here
		return this.name;
	}
	// Getter (Accessor) Instance Method
	public String getID()
	{
		// 'this' is optional here
		return this.id;
	}
	// Getter (Accessor) Instance Method
	public String getGPA()
	{
		// 'this' is optional here
		return this.gpa;
	}
	// Getter (Accessor) Instance Method
	public String getGradYear()
	{
		// 'this' is optional here
		return this.gradYear;
	}
	// Getter (Accessor) STATIC method
	// 'static' is required for 'static' variables
	public static String getSchool()
	{
		// 'static' variables can't use 'this'
		return school; 
	}
	// Setter (Mutator) INSTANCE Method
	public void setName(String name)
	{
		// 'this' is required here
		this.name = name;
	}
	// Setter (Mutator) INSTANCE Method
	public void setID(String id)
	{
		// 'this' is required here
		this.id = id;
	}
	// Setter (Mutator) INSTANCE Method
	public void setGPA(String gpa)
	{
		// 'this' is required here
		this.gpa = gpa;
	}
	// Setter (Mutator) INSTANCE Method
	public void setGradYear(String gradYear)
	{
		// 'this' is required here
		this.gradYear = gradYear;
	}
	// Setter (Mutator) STATIC Method
	public static void setSchool(String changeSchool)
	{
		// STATIC variables can't use 'this' 
		// STATIC variables require two variables
		school = changeSchool; 
	}

	@Override
	public String toString()
	{
		// 'this' is optional here
		return "========= STUDENT ==========" +
			   "\nName: " + this.name +
			   "\nID: " + this.id +
			   "\nGPA: " + this.gpa +
			   "\nGrad Year: " + this.gradYear +
			   "\nSchool: " + this.school +
			   "\n" + this.addr; // works if Address has a toString()

			// How to access Address' instance variables
			// ... from outside the Address class
			// ---------------------------------------------   
			//    "\nStreet Number: " + addr.getStreetNum() +
			//    "\nStreet Name: " + addr.getStreetName() +
			//    "\nCity: " + addr.getCity() +
			//    "\nZip: " + addr.getZip() +
			//    "\nState: " + addr.getState();
	}
}