package week2.day2.assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByXPath;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ButtonPage 
{
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		/******************Launch Application***************************/
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leafground.com/pages/Button.html");
		//*****************Button Click**************//
		driver.findElementByXPath("//button[@id='home']").click();
		WebDriverWait seleniumWait = new WebDriverWait(driver, 8000);
		//*****************Home Page To Button Page***//
		seleniumWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h5[text()='Button']")));
		System.out.println("Waited for the Element");
		driver.findElementByXPath("//h5[text()='Button']").click();
		//*****************Get Position of a WebElement************//
		Point buttonCoordinates = driver.findElementByXPath("//button[@id='position']").getLocation();
		System.out.println("The position of the Button is:- " +buttonCoordinates);
		System.out.println("The X-Coordinate for the Button is:- "+buttonCoordinates.getX());
		System.out.println("The X-Coordinate for the Button is:- "+buttonCoordinates.getY());
		//*****************Get Color of the Web Element***********//
		String buttonColor = driver.findElementByXPath("//button[@id='color']").getCssValue("background-color");
		System.out.println("The Button Color is:- " +buttonColor);
		//*****************Get Size of a WebElement************//
		Dimension buttonSize = driver.findElementByXPath("//button[@id='size']").getSize();
		System.out.println("The Button Size is:- " +buttonSize);
		System.out.println("The Height for the Button is:- "+buttonSize.getHeight());
		System.out.println("The Width for the Button is:- "+buttonSize.getWidth());
	}
}