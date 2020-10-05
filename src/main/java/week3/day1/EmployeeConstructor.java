package week3.day1;

public class EmployeeConstructor extends CompanyConstructor
{
	public String empName;
	public int empId;
	
	//Default Constructor
	EmployeeConstructor() 
	{
		this(300);
		System.out.println("EmployeeConstructor Class - Default Constructor");
	}
	
	//Parameterized Constructor
	EmployeeConstructor(String empName, int empId) 
	{
		this();//To Execute the Default Constructor...To call once constructor from another constructor then this should be used and it should be the first line of the code
		System.out.println("EmployeeConstructor Class - Parameterized Constructor:-  " +empName+", " +empId);
		this.empName = empName;// The purpose of this is to differentiate with global and local variable
		this.empId = empId;
	}
	
	EmployeeConstructor(int empId)
	{
		System.out.println("Constructor with one Argument");
		this.empId=empId;
	}
	
	public static void main(String[] args) 
	{
		//ClassName object = new Constructor()
		//EmployeeConstructor emp = new EmployeeConstructor(); //until you call the parameterized constructor it will not be executed
		EmployeeConstructor emp = new EmployeeConstructor("Saravanan Jeganathan", 003);//Constructor Overloading
		System.out.println("calling the constructor via Object:-" +emp.empName+", " +emp.empId);
		
	}

}
