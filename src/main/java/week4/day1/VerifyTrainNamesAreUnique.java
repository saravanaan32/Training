package week4.day1;

import java.util.List;

import javax.swing.text.TabableView;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class VerifyTrainNamesAreUnique 
{

	public static void main(String[] args) throws InterruptedException {
		
//		Set the system property and Launch the URL
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://erail.in");

//		Click the 'sort on date' checkbox
		driver.findElementByXPath("//input[@id='chkSelectDateOnly']").click();
		
//		clear the existing text from station text field
		driver.findElementById("txtStationFrom").clear();
//		type "ms"in the from station text field
		driver.findElementById("txtStationFrom").sendKeys("ms");
//		tab in the from station text field
		driver.findElementById("txtStationFrom").sendKeys(Keys.TAB);
//		clear the existing text in the to station text field
		driver.findElementById("txtStationTo").clear();
//		type "mdu" in the to station text field
		driver.findElementById("txtStationTo").sendKeys("mdu");
//		tab in the to station text field
		driver.findElementById("txtStationTo").sendKeys(Keys.TAB);
//		Add a java sleep for 2 seconds
		Thread.sleep(8000);
//		Store all the train names in a list
		int size = driver.findElementsByXPath("//table[@id='myTable']//tr").size();
		System.out.println(size);
//		Get the size of list
		
//		Add the list into a new Set
		
//		Get the size of set

//		Compare the Size of list and Set to verify the names are unique

	}

}