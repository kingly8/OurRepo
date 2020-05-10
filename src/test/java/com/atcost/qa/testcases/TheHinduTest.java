package com.atcost.qa.testcases;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.atcost.qa.base.TestBase;

public class TheHinduTest extends TestBase
{

	public TheHinduTest() throws IOException
	{
		super();
		}
	@BeforeMethod
	  public void setUp() throws InterruptedException
	  {
		  intialization();
	  }
	
	/*@Test
	public void hinduLandingPageTest1() throws InterruptedException
	{
	 driver.findElement(By.partialLinkText("Rishi Kapoor, veteran Hindi actor")).click();
	 Thread.sleep(5000);
	 JavascriptExecutor jse = (JavascriptExecutor)driver;
     jse.executeScript("window.scrollBy(0,950)", "");
     System.out.println("Scroll Down The Page");
     Thread.sleep(5000);
     JavascriptExecutor js = (JavascriptExecutor) driver;
     WebElement text = driver.findElement(By.xpath("(//*[@id='content-body-14269002-31469211']//P[contains(text(),'8.45')])[1]"));
     Actions select = new Actions(driver);
     select.doubleClick(text).build().perform();
     Thread.sleep(3000);
     Actions search = new Actions(driver);
     search .sendKeys(Keys.chord(Keys.CONTROL,"+f")).sendKeys("Thursday").build().perform();
     WebElement element=driver.findElement(By.xpath("//*[@id='content-body-14269002-31469211']/*[1]"));
     js.executeScript("arguments[0].setAttribute('style', arguments[1]);",element, "color: blue; border: 2px solid Magenta;");
     
     
		
	
		 JavascriptExecutor js = (JavascriptExecutor) driver;
	   js.executeScript("arguments[0].scrollIntoView();", paragraph); //scrolled up to a particular element.
	  Point loca = paragraph.getLocation();
	  System.out.println(loca);
	}*/
	@Test
	public void hinduLandingPageTest() throws InterruptedException, FindFailed
	{
	 //driver.findElement(By.xpath("//div[contains(@class,'closexcube')]")).click();
	  driver.findElement(By.partialLinkText("Karnataka govt. announces free transportation")).click();
	 Thread.sleep(5000);
	 
	 JavascriptExecutor jse = (JavascriptExecutor)driver;
	 jse.executeScript("window.scrollBy(0,950)", "");
	 System.out.println("Scroll Down The Page");
	 Thread.sleep(5000);
	 driver.findElement(By.xpath("//div[contains(@class,'closexcube')]")).click();
	 /*JavascriptExecutor js = (JavascriptExecutor) driver;*/
	 /*WebElement text = driver.findElement(By.xpath("(//*[@id='content-body-14269002-31469211']//P[3][contains(text(),'passed')])"));
	 Actions select = new Actions(driver);
	 select.doubleClick(text).build().perform();*/
	// WebElement para = driver.findElement(By.xpath("//div[contains(@id,'content-body')]/*[1]//div[contains(@id,'content-body')]/*[1][contains(text(),'transport')]"));
	 Screen s = new Screen();
	
	 Pattern p = new Pattern("D:\\Eclipse-Oxygen\\AtCostProject\\para.png");
	 s.wait(p,2000);
	 s.doubleClick(p);
	 
	 /*Actions act = new Actions(driver);
	  act.doubleClick(para).build().perform();
	  act.contextClick(para).build().perform();
	 */
	
	}
   
}
