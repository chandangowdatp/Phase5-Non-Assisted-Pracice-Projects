package com.authentication;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.Assert;

public class Login {
	String driverPath="C:\\Users\\Chandan\\OneDrive\\Desktop\\phase5classes/chromedriver.exe";
	public WebDriver driver;
	
  @Test
  public void f() {
	  driver.manage().window().maximize();
		driver.get("https://www.browserstack.com/users/sign_in");
		
		WebElement username = driver.findElement(By.id("user_email_login"));
		WebElement password = driver.findElement(By.id("user_password"));
		WebElement login = driver.findElement(By.name("commit"));
		
		username.clear();
		username.click();
		username.sendKeys("ravi1998@gmail.com");
		
		password.clear();
		password.click();
		password.sendKeys("Ravi@123");
		login.click();
		
		
	
  }
  @BeforeTest
  public void beforeTest() {
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\Chandan\\OneDrive\\Desktop\\phase5classes/chromedriver.exe");
	  
	  driver = new ChromeDriver();
  
  }
	
	 @AfterTest
	  public void afterTest() {
		 String actualUrl = "https://www.browserstack.com/users/dashborad";
			String expectedUrl = driver.getCurrentUrl();
			Assert.assertEquals(expectedUrl, actualUrl);
	  }
}