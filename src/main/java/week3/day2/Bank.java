package week3.day2;

public class Bank 
{

	public static void main(String[] args) 
	{
		//Scope Restriction, restricted to the scope to RBi
		
		Rbi bank = new IndianBank();//The methods available in RBI, which will be implemented in IndianBank can able to access
		
		/*Interface is to have the common Design
		 * 
		 * if you take WebDriver(interface) --> RemoteWebDriver --> ChromiumDriver --> ChromeDriver
		 * 
		 * ChromeDriver driver = new ChromeDriver();
		 * 
		 * WebDriver driver = new ChromeDriver(); - WebDriver will have all the methods in it such as get, findElements...
		 * 
		 * Scope will be moved from ChromeDriver to WebDriver - This is the use of Scope Restrictions
		 * 
		 */
		
		bank.minimumBalance();
		bank.maximumBalance();
		//bank.loanFarmers(); //Scope is Restricted to RBI, but this method is specific and implement in IndianBank.	

	}

}
