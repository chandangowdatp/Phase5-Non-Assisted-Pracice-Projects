package com.authentication;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;



public class LoginTest {
	
	String driverPath = "C:\\Users\\Chandan\\OneDrive\\Desktop\\phase5classes/chromedriver.exe";
	WebDriver driver;
	
	@BeforeTest
	public void beforeTest() {
		System.setProperty("webdriver.chrome.driver", driverPath);
		driver = new ChromeDriver();
		
		System.out.println("Driver initialized Successfully...");
		
		driver.get("https://www.saucedemo.com");
		driver.manage().window().fullscreen();
	}
	
	@Test
	public void testLogin() {
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		driver.findElement(By.id("password")).sendKeys("secret_sauc");
		driver.findElement(By.id("login-button")).click();
		
		try {
			System.out.println("Thread going to sleep for 5 sec...");
			Thread.sleep(5000);
			System.out.println("Thread resumed...");
		}
		catch (InterruptedException e){
			e.printStackTrace();
		}
		
		driver.findElement(By.id("password")).clear();
		
		try {
			System.out.println("Thread going to sleep for 5 sec...");
			Thread.sleep(5000);
			System.out.println("Thread resumed...");
		}
		catch (InterruptedException e){
			e.printStackTrace();
		}
		
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
		
		driver.findElement(By.id("login-button")).click();
	}
	


	@AfterTest
  	public void afterTest() {
		driver.close();
		System.out.println("Test completed...");
  	}

}
