package week4.day1.assignments;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ToyTables 
{
	/*
	 * Assignment 1: Complete all the 4 tasks in http://leafground.com/pages/table.html
	 */

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leafground.com/pages/table.html");
		List<WebElement> rows = driver.findElementsByXPath("//table[@id='table_id']//tr");
		System.out.println("The No of Rows in Table:- " +rows.size());
		List<WebElement> columns = driver.findElementsByXPath("//table[@id='table_id']//th");
		System.out.println("The No of Columns in Table:- " +columns.size());
		String learnToInteract = driver.findElementByXPath("//table[@id='table_id']//tr[3]/td").getText();
		String progress = driver.findElementByXPath("//table[@id='table_id']//tr[3]/td[2]").getText();
		System.out.println(learnToInteract+"  "+progress);
		List<WebElement> tableList = driver.findElementsByXPath("//table[@id='table_id']//tr/td[2]");
		System.out.println(tableList.size());
		List<String> tableValues=new ArrayList<String>();
		for (int i = 0; i <= tableList.size()-1; i++) 
		{
			tableValues.add(tableList.get(i).getText());
		}
		System.out.println("Unordered List:- " +tableValues);
		Collections.sort(tableValues);
		System.out.println("Asscending Order List:- " +tableValues);
		Collections.reverse(tableValues);
		System.out.println("Descending Order List:- " +tableValues);
		

	}

}
