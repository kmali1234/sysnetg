package com.Sysnet.pageobject;

import java.util.Properties;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginSysnet {
	
	private WebDriver driver;
	private By usernamelocator;
	private By passwordlocator;
	private By loginbuttonlocator;
	private String url;
	
	private final Logger log =Logger.getLogger(LoginSysnet.class.getClass());
	
	
	public LoginSysnet(WebDriver driver, Properties locators){
		this.driver = driver;
		this.url =locators.getProperty("baseUrl")+locators.getProperty("login.url.suffix");
		this.usernamelocator = By.cssSelector(locators.getProperty("login.textfield.username.css"));
		this.passwordlocator = By.cssSelector(locators.getProperty("login.textfield.password.css"));
		this.loginbuttonlocator = By.cssSelector(locators.getProperty("login.button.submit.css"));
	//navigateTo();
		
	}
	
	
	public LoginSysnet navigateTo(){
		driver.get(url);
		return this;
	}
	
	public LoginSysnet TypeUserName(String username){
		driver.findElement(usernamelocator).sendKeys(username);
		return this;
	}
	
	public LoginSysnet TypePassword(String password){
		driver.findElement(passwordlocator).sendKeys(password);
		return this;
	}
	
	public LoginSysnet SubmitLogin(){
		driver.findElement(loginbuttonlocator).submit();
	log.debug("Loging in as a merchant");
		return this;
	}
	
	public LoginSysnet IsSucessfull(String Username,Properties locators){
		String CurrentUrl = driver.getCurrentUrl();
		
		String ExpectedURl= locators.getProperty("baseUrl")+locators.getProperty("personalise.url.suffix");
		
		if(CurrentUrl.equals(ExpectedURl))
		{
			log.info("Merchant is logged in");
		}
		else
		{
			log.info("Merchant login Failed, Please try with valid Username and Password");
			driver.close();
		}
		return this;
		
		
	}

}


