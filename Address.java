// Concrete Class
// A Class Association (HAS-A) relationship exists
// ...between Student and Address
// It's 'Aggregation' if classes are independent of each other
// It's 'Composition' if classes are dependent of each other
public class Address
{
	// instance variables (member fields)
	private String streetNum, streetName, city, zip;

	// static (class-wide) variable (member field)
	// add 'final' keyword to prevent overriding
	private static String state = "CA";
	
	// No-Arg Constructor
	public Address()
	{
		// 'this' is optional here
		this.streetNum = "11356";
		this.streetName = "Leffingwell Road";
		this.city = "Norwalk";
		this.zip = "90650";
	}

	// 4 Parameter Constructor
	public Address(String streetNum, String streetName, String city, String zip)
	{
		// 'this' is required here
		this.streetNum = streetNum;
		this.streetName = streetName;
		this.city = city;
		this.zip = zip;
	}

	// Getter (Accessor) Instance Method
	public String getStreetNum()
	{
		// 'this' is optional here
		return this.streetNum; 
	}
	// Getter (Accessor) Instance Method
	public String getStreetName()
	{
		// 'this' is optional here
		return this.streetName; 
	}
	// Getter (Accessor) Instance Method
	public String getCity()
	{
		// 'this' is optional here
		return this.city; 
	}
	// Getter (Accessor) Instance Method
	public String getZip()
	{
		// 'this' is optional here
		return this.zip;
	}
	// Getter (Accessor) STATIC method
	// 'static' is required for 'static' variables
	public static String getState()
	{
		// 'static' variables can't use 'this'
		return state; 
	}
	// Setter (Mutator) INSTANCE Method
	public void setStreetNum(String streetNum)
	{
		// 'this' is required here
		this.streetNum = streetNum;
	}
	// Setter (Mutator) INSTANCE Method
	public void setStreetName(String streetName)
	{
		// 'this' is required here
		this.streetName = streetName;
	}
	// Setter (Mutator) INSTANCE Method
	public void setCity(String city)
	{
		// 'this' is required here
		this.city = city; 
	}
	// Setter (Mutator) INSTANCE Method
	public void setZip(String zip)
	{
		// 'this' is required here
		this.zip = zip; 
	}
	// Setter (Mutator) STATIC Method
	public static void setState(String changeState)
	{
		// STATIC can't use 'this' keyword, 
		// ...requires two variables, state = changeState
		state = changeState; 
	}
	// The Address toString() is optional, but is defined
	// ...here and used in the Student toString()
	public String toString()
	{
		// 'this' is optional here
		return "-------- ADDRESS ---------" +
			   "\nStreet Number: " + this.streetNum + 
			   "\nStreet Name: " + this.streetName +
			   "\nCity: " + this.city +
			   "\nState: " + this.state +
			   "\nZip: " + this.zip;
			   
		
		// 'this' is optional in toString()
		// return "Street Number: " + this.getStreetNum() + 
		// 	   "\nStreet Name: " + this.getStreetName() +
		// 	   "\nCity: " + this.getCity() +
		// 	   "\nZip: " + this.getZip() +
		// 	   "\nState: " + this.getState();
	}
}