package com.atcost.qa.testcases;

import static org.testng.Assert.assertEquals;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.atcost.qa.base.TestBase;
import com.atcost.qa.util.Xls_Reader;

public class LandingPageTest extends TestBase
{
	Xls_Reader reader;
	public LandingPageTest() throws IOException 
	{
		super();
		// TODO Auto-generated constructor stub
	}
	@BeforeMethod
	  public void setUp() throws InterruptedException
	  {
		  intialization();
	  }
	@Test(priority=1)
	public void searchFieldItem() throws InterruptedException
	{
    String data = System.getProperty("user.dir")+"\\src\\main\\resources\\ExcellSheet\\ExcellTestData.xlsx";
    reader = new Xls_Reader(data);
	String item = reader.getCellData("Sheet1", "item", 2);
	System.out.println(item);
	
	String quantity = reader.getCellData("Sheet1", "quantity", 2);
	System.out.println(quantity);
	Thread.sleep(5000);
	driver.findElement(By.xpath("//input[@class='search_input']")).sendKeys(item);
	Thread.sleep(5000);
	WebElement quatdouble = driver.findElement(By.xpath("//input[@class='quantity 2130']"));
	Actions act = new Actions(driver);
	act.doubleClick(quatdouble).perform();
	driver.findElement(By.xpath("//input[@class='quantity 2130']")).sendKeys(quantity);
	driver.findElement(By.xpath("//button[@productid='2130']")).click();
	/*//Assertion
	 String priceAmount = driver.findElement(By.xpath("//td[contains(@class,'unit_price')]")).getText();
	 System.out.println(priceAmount);
     assertEquals(priceAmount, 49 ,"Wrong Price Amount");*/
	}

	
	@Test(priority=2)
	public void description() throws InterruptedException
	{
		 String item = reader.getCellData("Sheet1", "item", 2);
		  Thread.sleep(5000);
		 driver.findElement(By.xpath("//input[@class='search_input']")).sendKeys(item);
		 Thread.sleep(5000);
		 driver.findElement(By.xpath("//span[contains(text(),'Amul Garlic')]")).click();
		String des = driver.findElement(By.xpath("//td[contains(text(),'Buttery Spread')]")).getText();
		System.out.println(des);
		 String description = reader.getCellData("Sheet1", "description", 2);
		 System.out.println(description);
		Assert.assertEquals(des, description);
		
	}
	@AfterMethod
	public void tearDown()
	{ 
		driver.quit();
	}
	}
	
	
	
	
	
	
	
	
