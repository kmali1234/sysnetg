package com.Sysnet.SafeMaker;

import java.io.FileInputStream;
import java.util.Properties;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.Sysnet.pageobject.LoginSysnet;

public class DoLogin {

	private String propertyfilepath;
	private Properties clientProps;
	private String baseurl;
	private String loginpageUrlSufix;
	private String url;
	private WebDriver driver;
	private String propertyfilepath1;
	private Properties userprops;
	private String username;
	private String password;
	
	public DoLogin() {
		
	}
		

	@Before
	public void SetUp() throws Exception
	{
		propertyfilepath="src/main/java/sysnetuslocators.properties";
		clientProps = new Properties();
		FileInputStream locatorStream = new FileInputStream(propertyfilepath);
		clientProps.load(locatorStream);
		propertyfilepath1= "src/main/java/com/Sysnet/SafeMaker/objects.properties";
		userprops = new Properties();
		FileInputStream UserLocators = new FileInputStream(propertyfilepath1);
		userprops.load(UserLocators);
		username = userprops.getProperty("username");
		password = userprops.getProperty("password");
		
	}
	
	@Test
	public void MerchantLogin()  throws Exception
	{
		baseurl=clientProps.getProperty("baseUrl");
		loginpageUrlSufix=clientProps.getProperty("login.url.suffix");
		url = baseurl+loginpageUrlSufix;
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get(url);
		LoginSysnet dl = new LoginSysnet(driver, clientProps);
		dl.navigateTo();
		dl.TypeUserName(username);
		dl.TypePassword(password);
		dl.SubmitLogin();
	}
	
	@After
	public void Exit(){
		driver.close();
	}
}
