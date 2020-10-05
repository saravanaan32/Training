package week3.day2;

public class Sbi implements Rbi
{
	public void loanITEngineers()
	{
		System.out.println("IT Engineers loan Sanctioned");
	}
	public void minimumBalance() 
	{
		// TODO Auto-generated method stub
		System.out.println(3000);
		
	}

	public void maximumBalance() 
	{
		// TODO Auto-generated method stub
		System.out.println(300000000);
		
	}

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Sbi bank=new Sbi();
		bank.minimumBalance();
		bank.maximumBalance();
		bank.loanITEngineers();

	}

}
