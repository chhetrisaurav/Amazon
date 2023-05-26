package com.amazon.testscripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;

public class BaseTest {
	
	WebDriver driver;
	
	@BeforeClass
	public void lunchApplication() {
	//	1) Open the browser
		driver = new ChromeDriver();
		
	//	2) Maximize it
		driver.manage().window().maximize();
		
	//	3) Navigate to application
		driver.get("https://amazon.in");
	}
	@AfterClass
	public void closeBrowser() {
		//9) Close the browser
		driver.quit();
		
	}

}
