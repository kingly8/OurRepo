package com.atcost.qa.base;

	import java.io.FileInputStream;
	import java.io.FileNotFoundException;
	import java.io.IOException;
	import java.util.Properties;
	import java.util.concurrent.TimeUnit;

	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.firefox.FirefoxDriver;
	import org.testng.annotations.Parameters;

import com.atcost.qa.util.Xls_Reader;

	

	import io.github.bonigarcia.wdm.WebDriverManager;

	public class TestBase 
	{
	    public static Properties properties;
		FileInputStream file;
		public static WebDriver driver;

		public TestBase() throws IOException
		{
			String configPath = System.getProperty("user.dir")+ "//src//main//java//com//atcost//qa//config//config.Properties";
			file = new FileInputStream(configPath);
		    properties = new Properties();
		    properties.load(file);
		}

		public static void intialization() throws InterruptedException
		{
			
	  		 String browserName = properties.getProperty("browser");
			 if(browserName.equalsIgnoreCase("chrome"))
			 {
				 WebDriverManager.chromedriver().setup();
				 driver = new ChromeDriver(); 
			 }
			 else if(browserName.equals("firefox"))
			 {
				 WebDriverManager.firefoxdriver().setup();
				 driver= new FirefoxDriver();
			 }
			 driver.manage().window().maximize();
			 driver.manage().timeouts().pageLoadTimeout(Xls_Reader.PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);
			 driver.manage().timeouts().implicitlyWait(Xls_Reader.IMPLICIT_WAIT, TimeUnit.SECONDS);
			 driver.get(properties.getProperty("url"));
			 Thread.sleep(5000);
		}


			
		}



