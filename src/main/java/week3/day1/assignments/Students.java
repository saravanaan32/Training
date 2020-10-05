package week3.day1.assignments;

public class Students 
{
	//Create multiple getStudentInfo() method by passing id argument alone, by id & name, by email & phoneNumber
	// Methods: getStudentInfo()
	public void getStudentInfo()
	{
		String id = "PGPEX-00003";
		System.out.println("The Student Information:- " +id);		
	}
	public void getStudentInfo(String id)
	{
		System.out.println("The Student Id:- " +id);		
	}
	public void getStudentInfo(String id, String Name)
	{
		System.out.println("The Student ID:- " +id+ " & Name:- " +Name);		
	}
	public void getStudentInfo(String email, int phoneNumber)
	{
		System.out.println("The Student Email Address:- " +email+ " & phoneNumber:- " +phoneNumber);		
	}
	public static void main(String[] args) 
	{
		Students myStudent=new Students();
		myStudent.getStudentInfo();
		myStudent.getStudentInfo("PGPEX-0003");
		myStudent.getStudentInfo("PGPEX-0003", "Saravanan Jeganathan");
		myStudent.getStudentInfo("saravanaan@gmail.com", "9962303232");
	}

}
