package week3.day1;

public class MyCalculator 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Calculator objCal=new Calculator(3,2);
		//Calculator class -  addTwoNumbers() is a static Method i can directly call - objCal.addTwoNumbers();
		Calculator.addTwoNumbers();
		objCal.addTwoNumbers(120, 200);
		//System.out.println(objCal.c);
		objCal.addTwoNumbers(120, 200, 1000);
		System.out.println("The return of the Double 2 args:- "+(objCal.addTwoNumbers(120.20, 200.30)));
		objCal.addTwoNumbers(120.20, 200.30, 320.59);
	}

}
