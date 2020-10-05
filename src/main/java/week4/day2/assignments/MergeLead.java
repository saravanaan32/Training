package week4.day2.assignments;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MergeLead 
{
	/*
	 * MergeLead: Application : http://leaftaps.com/opentaps/control/main
		================================================================
		1. Launch the browser
		2. Enter the username
		3. Enter the password
		4. Click Login
		5. Click crm/sfa link
		6. Click Leads link
		7. Click Merge leads
		8. Click on Icon near From Lead
		9. Move to new window
		10. Enter Lead ID
		11. Click Find Leads button
		12. Click First Resulting lead
		13. Switch back to primary window
		14. Click on Icon near To Lead
		15. Move to new window
		16. Enter Lead ID
		17. Click Find Leads button
		18. Click First Resulting lead
		19. Switch back to primary window
		20. Click Merge
		21. Accept Alert
		22. Click Find Leads link
		23. Enter From Lead ID
		24. Click Find Leads button
		25. Verify message "No records to display" in the Lead List. This message confirms that the successful merge of leads
		26. Close the browser (Do not log out)
	 */

	public static void main(String[] args) throws InterruptedException 
	{

		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/control/main");
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	
		driver.findElementById("username").sendKeys("demosalesmanager");
		driver.findElementById("password").sendKeys("crmsfa");
	
		driver.findElementByClassName("decorativeSubmit").click();
	
		driver.findElementByLinkText("CRM/SFA").click();
	
		driver.findElementByLinkText("Leads").click();
		
		driver.findElementByXPath("//a[text()='Merge Leads']").click();
		
		driver.findElementByXPath("(//*[@alt='Lookup'])[1]").click();
		
		Set<String> windowHandlesFromLead = driver.getWindowHandles();
		
		for (String windowListFromLead : windowHandlesFromLead) //********Just to print the window ID******//
		{
			System.out.println(windowListFromLead);
		}
		List<String> windowIDFromLead=new ArrayList<String>(windowHandlesFromLead);
		
		driver.switchTo().window(windowIDFromLead.get(1));
		
		driver.findElementByXPath("//input[@name='id']").sendKeys("10086");
		
		driver.findElementByXPath("//button[text()='Find Leads']").click();
		
		Thread.sleep(8000);
		
		driver.findElementByXPath("(//a[@class='linktext'])[1]").click();
		
		driver.switchTo().window(windowIDFromLead.get(0));
		
		driver.findElementByXPath("(//*[@alt='Lookup'])[2]").click();
		
		Set<String> windowHandlesToLead=driver.getWindowHandles();
		for (String windowListToLead : windowHandlesToLead) //********Just to print the window ID******//
		{
			System.out.println(windowListToLead);
		}
		List<String> windowIDToLead=new ArrayList<String>(windowHandlesToLead);
		driver.switchTo().window(windowIDToLead.get(1));
		
		driver.findElementByXPath("//input[@name='id']").sendKeys("10087");
		
		driver.findElementByXPath("//button[text()='Find Leads']").click();
		
		Thread.sleep(8000);
		
		driver.findElementByXPath("(//a[@class='linktext'])[1]").click();
		
		driver.switchTo().window(windowIDToLead.get(0));
		
		driver.findElementByXPath("//a[text()='Merge']").click();
		
		Thread.sleep(8000);
		
		Alert alert=driver.switchTo().alert();
		alert.accept();
		
		Thread.sleep(8000);
		
		driver.findElementByXPath("//a[text()='Find Leads']").click();
		
		driver.findElementByXPath("//input[@name='id']").sendKeys("10086");
		
		driver.findElementByXPath("//button[text()='Find Leads']").click();
		
		Thread.sleep(8000);
		
		String leadVerification = driver.findElementByXPath("//div[contains(text(), 'No records to display')]").getText();
		
		System.out.println("Lead Verification Message:- " +leadVerification);
		
		if (leadVerification.contains("No records to display")) 
		{
			System.out.println("The Leads are Merged Successfully !!!");
		}
		else
		{
			System.out.println("The Leads are Not Merged !!!");
		}
		
		Thread.sleep(8000);
		
		driver.close();			
	
	}

}
