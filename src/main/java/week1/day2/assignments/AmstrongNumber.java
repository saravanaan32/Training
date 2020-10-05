package week1.day2.assignments;

public class AmstrongNumber 
{

	/*
	 * Goal: To find whether a number is an Armstrong number or not
	 * inputs: 153
	 * output: (1*1*1)+(5*5*5)+(3*3*3) = 153
	 */

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		int input=222, quo=0, rem=0, amstrong=0, inputVerification=0;
		inputVerification=input;
		while (input>0) 
		{
			quo=input/10;		//Gives you the Quotient
			rem=input%10;		//Gives you the Remainder
			input=quo;
			if (rem!=0) 
			{
					rem = rem*rem*rem;
					amstrong=amstrong+rem;
					
			}
		}
		if (amstrong == inputVerification) 
		{
			System.out.println("The given Number is an Amstrong Number!!!:- " +amstrong);
		}
		else 
		{
			System.out.println("The given Number is not an Amstrong Numner!!!:- ");
			System.out.println("Input:- " +inputVerification+ " Amstrong:- " +amstrong);
		}

	}

}
