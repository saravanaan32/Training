package week3.day1.assignments.methodoverride;

public class AxisBank extends BankInfo
{
	//You have to override the method deposit in AxisBank.
	//Methods :deposit()
	public void deposit()
	{
		System.out.println("AxisBank - deposit");
	}
	public static void main(String[] args) 
	{
		AxisBank myBank = new AxisBank();
		myBank.savings();
		myBank.fixed();
		myBank.deposit();
	}

}
