package week2.day2.assignments;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class EditLead 
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
		//Enter first name
		try 
		{
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
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
		//Click on first resulting lead
		driver.findElementByXPath("(//a[contains(@href, 'control/viewLead?')])[6]").click();
		//Verify title of the page
		String title = driver.getTitle();
		if (title.contains("View Lead")) 
		{
			System.out.println("The Title of the Page is Matched !!!");
		}
		else 
		{
			System.out.println("The Title of the Page is Not Matched !!!");
		}
		//Click Edit
		driver.findElementByXPath("//*[text()='Edit']").click();
		//Change the company name
		try 
		{
			Thread.sleep(2000);
		} catch (InterruptedException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		WebElement companyName = driver.findElementByXPath("//input[@name='companyName'and@class='inputBox']");
		companyName.clear();
		companyName.sendKeys("Sai Software Services Ltd");
		//Click Update
		driver.findElementByXPath("//*[@name='importantNote']/following::input[@value='Update']").click();
		//Confirm the changed name appears
		WebElement companyNameVerification = driver.findElementByXPath("//*[@id='viewLead_companyName_sp']");
		String companyNameText = companyNameVerification.getText();
		if (companyNameText.contains("Sai Software Services Ltd")) 
		{
			System.out.println("The Company Name is Matched");
		}
		//Close the browser (Do not log out)
		driver.close();
	}

}
