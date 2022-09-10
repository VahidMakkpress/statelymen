package com.base;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
//import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
//import org.testng.annotations.BeforeTest;

public class BaseTest {
	
	public static WebDriver driver;
	public static Properties prop = new Properties();
	public static Properties loc = new Properties();
	public static FileReader fr;
	public static FileReader fr1;
	
	
	//@BeforeTest
	@BeforeMethod
	public void setup() throws IOException {
		
		if(driver==null) {
			//System.out.println("The Path is:"+ System.getProperty("user.dir"));
			//FileReader fr = new FileReader("D:\\Automstion_testing\\Statelymen\\src\\test\\resources\\ConfigFiles\\config.properties");
			
			 fr = new FileReader(System.getProperty("user.dir")+"\\src\\test\\resources\\ConfigFiles\\config.properties");
			 fr1 = new FileReader(System.getProperty("user.dir")+"\\src\\test\\resources\\ConfigFiles\\locators.properties");
			
			prop.load(fr);
			loc.load(fr1);
			
		}
		if(prop.getProperty("browser").equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver",
					"D:\\Automstion_testing\\Framework_Struture\\Browsers_Drivers\\chromedriver.exe");//base
			 driver = new ChromeDriver();// base
			driver.manage().window().maximize(); // base
			driver.get(prop.getProperty("testurl"));
			System.out.println("Successfully land on HomePage");
		}
		else if(prop.getProperty("browser").equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver",
					"D:\\Automstion_testing\\Framework_Struture\\Browsers_Drivers\\geckodriver.exe");//base
			 driver = new FirefoxDriver();// base
			driver.manage().window().maximize(); // base
			driver.get(prop.getProperty("testurl"));
			System.out.println("Successfully land on HomePage");
		}
		else if(prop.getProperty("browser").equalsIgnoreCase("edge")) {
			System.setProperty("webdriver.edge.driver",
					"D:\\Automstion_testing\\Framework_Struture\\Browsers_Drivers\\msedgedriver.exe");//base
			 driver = new EdgeDriver();// base
			driver.manage().window().maximize(); // base
			driver.get(prop.getProperty("testurl"));
			System.out.println("Successfully land on HomePage");
		}
		
	}
	
	
	//@AfterTest
	@AfterMethod
	public void tearDown() {
		
		driver.close();
		System.out.println("TearDown Successfully!");
		
	}

}
