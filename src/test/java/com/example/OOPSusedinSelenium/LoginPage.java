
//Page Class in POM
package com.example.OOPSusedinSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage 
{
	private WebDriver driver;
	private By userName=By.id("");
	private By userPass=By.id("");
	
	public LoginPage(WebDriver driver)
	{
		this.driver=driver;
	}
	public void enterUserName(String user)
	{
		driver.findElement(userName).sendKeys(user);
	}
	public void enterPassWord(String pass)
	{
		driver.findElement(userPass).sendKeys(pass);
	}
}
