package week4.day2;

import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnAlertsandFrames {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		//*********************Initialization - Application Block Code******************//
		WebDriverManager.chromedriver().setup();
		//To disable browser Notifications
		ChromeOptions option=new ChromeOptions();
		option.addArguments("--disable-notifications");
		
		ChromeDriver driver=new ChromeDriver(option);
		driver.manage().window().maximize();
		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_prompt");
		WebElement frame = driver.findElementById("iframeResult");
		driver.switchTo().frame(frame);
		driver.findElementByXPath("//button[text()='Try it']").click();
		Alert alert = driver.switchTo().alert();
		alert.sendKeys("Saravanan");
		alert.accept();
		String text = driver.findElementById("demo").getText();
		if (text.contains("Saravanan")) 
		{
			System.out.println("The text contains Name");
			
		}
		else
		{
			System.out.println("Doesnt Match");
		}

	}

}
