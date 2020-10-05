package week3.day1;

public class Calculator 
{
	//Constructor will not have any return types
	public Calculator() //Constructor - No parameterized Constructor
	{
		System.out.println("Calculator is Running...");
	}
	public Calculator(int a, int b) //Constructor Overloading - Parameterized Constructor
	{
		System.out.println("Overloaded Constructor - Parameterized Constructor:- " +a+", "+b);
	}
	public static void addTwoNumbers()
	{
		int a=2, b=3, c=0;
		c=a+b;
		System.out.println("The Sum is:- " +c);
	}
	public void addTwoNumbers(int a, int b)
	{
		int c=0;
		c=a+b;
		System.out.println("The Sum is:- " +c);
		//return c;
	}
	public void addTwoNumbers(int a, int b, int c)
	{
		c=a+b+c;
		System.out.println("The Sum is:- " +c);
		//return c;
	}
	public double addTwoNumbers(double a, double b)
	{
		return a+b;
	}
	public void addTwoNumbers(double a, double b, double c)
	{
		c=a+b+c;
		System.out.println("The Sum is:- " +c);
		//return c;
	}
	public static void main(String[] args) 
	{
		Calculator objCal=new Calculator();
		objCal.addTwoNumbers();
		objCal.addTwoNumbers(120, 200);
		//System.out.println(objCal.c);
		objCal.addTwoNumbers(120, 200, 1000);
		System.out.println("The return of the Double 2 args:- "+(objCal.addTwoNumbers(120.20, 200.30)));
		objCal.addTwoNumbers(120.20, 200.30, 320.59);
	}

}
