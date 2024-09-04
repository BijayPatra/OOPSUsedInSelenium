package com.example.OOPSusedinSelenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class BaseTest 
{
	protected WebDriver driver;
	
	@BeforeMethod
	public void setUp() {
		driver=new ChromeDriver();
		driver.manage().window().maximize();
	}
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
}
class LoginTest extends BaseTest
{
	@Test
	public void testLogin() {
		LoginPage loginpage=new LoginPage(driver);
		loginpage.enterUserName("admin");
		loginpage.enterPassWord("admin123");
	}
}
