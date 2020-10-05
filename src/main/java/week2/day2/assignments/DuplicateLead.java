package week2.day2.assignments;

import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DuplicateLead 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		//******************** Launch the browser ********************//
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();;
		driver.get("http://leaftaps.com/opentaps/control/main");
		//******************** Enter the username ********************//
		driver.findElementById("username").sendKeys("demosalesmanager");
		//******************** Enter the password ********************//
		driver.findElementById("password").sendKeys("crmsfa");
		//******************** Click Login ********************//
		driver.findElementByClassName("decorativeSubmit").click();
		//******************** Click crm/sfa link ********************//
		driver.findElementByLinkText("CRM/SFA").click();
		//******************** Click Leads link ********************//
		driver.findElementByLinkText("Leads").click();
		//******************** Click Find leads ********************//
		driver.findElementByXPath("//a[text()='Find Leads']").click();
		//******************** Click on Email ********************//
		driver.findElementByXPath("//span[text()='Email']").click();
		//******************** Enter Email ********************//
		driver.findElementByXPath("//input[@name='emailAddress']").sendKeys("sai@gmail.com");
		//******************** Click find leads button ********************//
		driver.findElementByXPath("//button[text()='Find Leads']").click();
		//Thread.sleep(2000);
		try 
		{
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//******************** Capture name of First Resulting lead ********************//
		String leadID = driver.findElementByXPath("(//a[contains(@href, 'control/viewLead?')])[8]").getText();
		System.out.println("The Lead ID is:- " +leadID);
		//******************** Click First Resulting lead ********************//
		driver.findElementByXPath("(//a[contains(@href, 'control/viewLead?')])[8]").click();
		String firstNameCreateLead = driver.findElementByXPath("//span[@id='viewLead_firstName_sp']").getText();
		System.out.println(firstNameCreateLead);
		String surnameCreateLead = driver.findElementByXPath("//span[@id='viewLead_lastName_sp']").getText();
		System.out.println(surnameCreateLead);
		//******************** Click Duplicate Lead ********************//
		driver.findElementByXPath("//a[text()='Duplicate Lead']").click();
		//******************** Verify the title as 'Duplicate Lead' ********************//
		try 
		{
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		String pageTitle = driver.getTitle();
		if (pageTitle.contains("Duplicate Lead")) 
		{
			System.out.println("Passed - The Page Title is Matched!!!");
		}
		else 
		{
			System.out.println("Failed - The Page Title is Not Matched!!!");
		}
		//******************** Click Create Lead ********************//
		driver.findElementByXPath("//input[@type='submit']").click();
		//******************** Confirm the duplicated lead name is same as captured name ********************//
		try 
		{
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String firstNameDuplicateLead = driver.findElementByXPath("//span[@id='viewLead_firstName_sp']").getText();
		System.out.println(firstNameDuplicateLead);
		String surnameDuplicateLead = driver.findElementByXPath("//span[@id='viewLead_lastName_sp']").getText();
		System.out.println(surnameDuplicateLead);
		if (firstNameCreateLead.equals(firstNameDuplicateLead) && surnameCreateLead.equals(surnameDuplicateLead)) 
		{
			System.out.println("Passed - Duplicate Lead is Created Successfully !!!");
		}
		else 
		{
			System.out.println("Failed - Duplicate Lead !!!");
		}
		
		//******************** Close the browser (Do not log out) ********************//
		driver.close();

	}

}
