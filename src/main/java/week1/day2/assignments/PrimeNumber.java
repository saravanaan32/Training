package week1.day2.assignments;

public class PrimeNumber 
{
	/*
	 * Goal: To find whether a number is a Prime number or not
	 * Input = 13
	 * Output=13 is a Prime Number.
	 */
	public static void main(String[] args) 
	{
		int input=13, rem=0, flag=0;
		int x = input/2;
		if (input==0||input==1)
		{
			System.out.println("The inputed Number " +input+ " is not a Prime Number!!!");
		}
		else
		{
			for (int i = 2; i < x; i++) 
			{
				if(input%i==0);
				 
				{
					System.out.println("The inputed Number " +input+ " is not a Prime Number!!!");
					flag=1;
				}
			}
		}
		 if(flag==0)  { System.out.println(input+" is prime number"); }  
		
				
	}

}
