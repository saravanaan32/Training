package week2.day2.assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DeleteLead 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		/******************Launch Application***************************/
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();;
		driver.get("http://leaftaps.com/opentaps/control/main");
		//Enter the Username and password
		driver.findElementById("username").sendKeys("demosalesmanager");
		driver.findElementById("password").sendKeys("crmsfa");
		//Click Login
		driver.findElementByClassName("decorativeSubmit").click();
		//Click on CRM/SFA Link
		driver.findElementByLinkText("CRM/SFA").click();
		//Click on Leads Button
		driver.findElementByLinkText("Leads").click();		
		//Click Find leads
		driver.findElementByXPath("//a[text()='Find Leads']").click();
		//Click on Phone
		//driver.findElementByXPath("//span[text()='Phone']").click();
		//Enter phone number 99
		//driver.findElementByXPath("//input[@name='phoneNumber']").sendKeys("99");
		driver.findElementByXPath("//input[@name='id']/following::input[@name='firstName']").sendKeys("saravanan");
		//Click Find leads button
		driver.findElementByXPath("//button[text()='Find Leads']").click();
		//Thread.sleep(2000);
		try 
		{
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//Capture lead ID of First Resulting lead
		String leadID = driver.findElementByXPath("//div[text()='Lead ID']/following::a[@class='linktext']").getText();
		System.out.println("The Lead ID is:- " +leadID);
		//Click on first resulting lead
		driver.findElementByXPath("//div[text()='Lead ID']/following::a[@class='linktext']").click();
		//Click Delete
		driver.findElementByXPath("//a[text()='Delete']").click();
		//Click Find leads
		driver.findElementByXPath("//a[text()='Find Leads']").click();
		//Enter captured lead ID
		driver.findElement(By.xpath("//input[@name='id']")).sendKeys(leadID);
		//Click find leads button
		driver.findElementByXPath("//button[text()='Find Leads']").click();
		//Verify message "No records to display" in the Lead List. This message confirms the successful deletion
		try 
		{
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String records = driver.findElementByXPath("//div[contains(text(),'No records to display')]").getText();
		//System.out.println(records);
		if (records.contains("No records to display"))
		{
			System.out.println("The given ID:- " +leadID+ " is Not Available in System and its Deleted !!!");
		}
		else 
		{
			System.out.println("The given ID:- " +leadID+ " is Available in System and its Not Deleted !!!");
		}
		//Close the browser (Do not log out)
		driver.close();
	}

}
