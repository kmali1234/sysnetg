package com.Sysnet.pageobject;

import java.sql.Driver;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PersonalisationPage {
	
	private WebDriver driver;
	private By usernameFieldLocator;
	private By conformUsernameLocator;

	public PersonalisationPage(WebDriver driver, Properties locators){
		this.driver = driver;
		this.usernameFieldLocator = By.id(locators.getProperty("personalise.textfield.username.id"));
		this.conformUsernameLocator = By.id(locators.getProperty("personalise.textfield.confirmUsername.id"));
	}
	
	private  PersonalisationPage enterUsername(String username){
		
		driver.findElement(usernameFieldLocator).clear();
		driver.findElement(usernameFieldLocator).sendKeys(username);
		driver.findElement(conformUsernameLocator).clear();
		driver.findElement(conformUsernameLocator).sendKeys(username);
		return this;
	}

}
