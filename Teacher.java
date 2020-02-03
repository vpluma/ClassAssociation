
// Concrete Class
// A Class Association (HAS-A) relationship exists
// ...between Student and Address
// It's 'Aggregation' if classes are independent of each other
// It's 'Composition' if classes are dependent of each other
public class Teacher
{
	// instance variable(s) - reference data type 
	private String name, subject;
	private boolean hasDegree;
	// instance variable - user-defined reference data type
	private Address addr;

	// static or class variables - reference data type(s)
	private static String district = "NLMUSD";

	// (1) In Java, the 'default' (NULL) constructor is overriden
	// ...when you create one or more constructors
	// (2) 'Overloading' constructors occurs when you create 
	// ... more than one constructor

	// No-Arg Constructor
	public Teacher()
	{
		// 'this' is optional here
		this.name = "Clark Kent";  // no-arg
		this.subject = "Computer Science";  // no-arg
		this.hasDegree = true;  // no-arg
		// new Address() calls No-Arg constructor
		addr = new Address(); 
	}
	// 1 Parameter & 4 No-Arg Constructor
	public Teacher(Address addr)
	{
		// 'this' is optional for name, id, gpa, gradYear
		// 'this' is required for addr
		this.name = "Clark Kent";  // no-arg
		this.subject = "Computer Science";  // no-arg
		this.hasDegree = true;  // no-arg
		// Address object is passed in with addr
		this.addr = addr;  
	}
	// 5 Parameter Constructor
	public Teacher(String name, String subject, boolean hasDegree, Address addr)
	{
		// 'this' is required here
		this.name = name;
		this.subject = subject;
		this.hasDegree = hasDegree;
		// Address object passed in with addr
		this.addr = addr;
	}

	// Getter (Accessor) Instance Method
	public String getName()
	{
		// 'this' is optional here
		return this.name;
	}
	// Getter (Accessor) Instance Method
	public String getSubject()
	{
		// 'this' is optional here
		return this.subject;
	}
	// Getter (Accessor) Instance Method
	public boolean getHasDegree()
	{
		// 'this' is optional here
		return this.hasDegree;
	}

	// Getter (Accessor) STATIC method
	// 'static' is required for 'static' variables
	public static String getDistrict()
	{
		// 'static' variables can't use 'this'
		return district; 
	}
	// Setter (Mutator) INSTANCE Method
	public void setName(String name)
	{
		// 'this' is required here
		this.name = name;
	}
	// Setter (Mutator) INSTANCE Method
	public void setSubject(String subject)
	{
		// 'this' is required here
		this.subject = subject;
	}
	// Setter (Mutator) INSTANCE Method
	public void setHasDegree(boolean hasDegree)
	{
		// 'this' is required here
		this.hasDegree = hasDegree;
	}
	
	// Setter (Mutator) STATIC Method
	public static void setDistrict(String changeDistrict)
	{
		// STATIC variables can't use 'this' 
		// STATIC variables require two variables
		district = changeDistrict; 
	}
	 
	@Override
	public String toString()
	{
		// 'this' is optional here
		return "========= TEACHER ===========" +
			   "\nName: " + this.name +
			   "\nSubject: " + this.subject +
			   "\nHas Degree: " + this.hasDegree +
			   "\nDistrict: " + this.district +
			   // prints with Address' toString()
			   "\n" + this.addr; 

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
