package week2.day2.assignments;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RadioButton {

	public static void main(String[] args)  
	{
		// TODO Auto-generated method stub
		//*********************Initialization - Application Block Code******************//
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leafground.com/pages/radio.html");
		/*
		 * when i am using thread.sleep i got this exception - Unhandled exception type InterruptedException
		 * It asked me to add Throws Declaration (or) sorround with Try/Catch 
		 * 
		 */
		//******************** Select the Radio Button ********************//
		driver.findElementByXPath("//input[@id='yes']").click();
		//******************** Find default selected radio button ********************//
		//List<WebElement> radioLists = driver.findElements(By.name("news");
		//boolean selected = driver.findElementByXPath("//input[@name='news' and @value='0']").isSelected();
		
		if ((driver.findElementByXPath("//input[@name='news' and @value='1']").isSelected())==true) 
		{
			System.out.println("The Checked Radio Button is Checked !!!");
		}
		else if ((driver.findElementByXPath("//input[@name='news' and @value='0']").isSelected())==true) 
		{
			System.out.println("The UnChecked Radio Button is Checked !!!");
		}
		
		//******************** Select your age group (Only if choice wasn't selected) ********************//
		if ((driver.findElementByXPath("(//input[@name='age'])[2]").isSelected())==true) 
		{
			System.out.println("The 21 - 40 years Radio Button is Already Checked !!!");
		}
		else 
		{
			driver.findElementByXPath("(//input[@name='age'])[2]").click();
		}


	}

}
