package week3.day1.assignments.multilevelinheritance;

public class Student extends Department
{
	//Methods   :studentName(),studentDept(),studentId()
	public void studentName()
	{
		System.out.println("Student - Saravanan Jeganathan");
	}
	public void studentDept()
	{
		System.out.println("Student - Operations");
	}
	public void studentId()
	{
		System.out.println("Student - PGPEX-0003");
	}
	public static void main(String[] args) 
	{
		Student objStud=new Student();
		objStud.collegeName();
		objStud.collegeCode();
		objStud.collegeRank();
		objStud.deptName();
		objStud.studentName();
		objStud.studentId();
		objStud.studentDept();
	}

}
