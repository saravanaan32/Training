package week4.day2;

import org.openqa.selenium.Alert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnAlerts {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		//*********************Initialization - Application Block Code******************//
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leafground.com/pages/Alert.html");
		//**************** Simple Alert**************************//
		/*
		driver.findElementByXPath("//button[text()='Alert Box']").click();
		Alert alert = driver.switchTo().alert();
		String simpleAlert = alert.getText();
		System.out.println(simpleAlert);
		alert.accept();
		*/
		//**************** Confirm Alert**************************//
		//driver.findElementByXPath("//button[text()='Confirm Box']").click();
		Thread.sleep(5000);
		//driver.switchTo().alert().accept();
		//driver.switchTo().alert().dismiss();
		//**************** Confirm Alert**************************//
		driver.findElementByXPath("//button[text()='Prompt Box']").click();
		Alert alert = driver.switchTo().alert();
		alert.sendKeys("Saravanan");
		Thread.sleep(5000);
		alert.accept();	
	}

}
