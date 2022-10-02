package com.authentication;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Registration {
	String driverPath="C:\\Users\\Chandan\\OneDrive\\Desktop\\phase5classes/chromedriver.exe";
	public WebDriver driver;
	
  @Test
  public void f() {
	  driver.manage().window().maximize();
		driver.get("https://www.browserstack.com/users/sign_up");
		
		driver.findElement(By.id("user_full_name")).sendKeys("Ravi");
		
		driver.findElement(By.id("user_email_login")).sendKeys("ravi1998@gmail.com");
		
		driver.findElement(By.id("user_password")).sendKeys("Ravi@123");
		
		driver.findElement(By.id("tnc_checkbox")).click();
		
		driver.findElement(By.name("commit")).click();
		
		driver.findElement(By.name("commit")).click();
		
//		driver.findElement(By.id("user_submit")).click();
			
		
	
  }
  @BeforeTest
  public void beforeTest() {
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\Chandan\\OneDrive\\Desktop\\phase5classes/chromedriver.exe");
	  
	  driver = new ChromeDriver();
  
  }
	
	 @AfterTest
	  public void afterTest() {
		 System.out.println("After test is running");
	  }
}

