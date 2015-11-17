package com.Sysnet.SafeMaker;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import com.gargoylesoftware.htmlunit.WebConsole.Logger;
import com.sun.jna.platform.FileUtils;

public class ReadFileData {

		
	@SuppressWarnings("deprecation") 
	@Test
	public static void main(String[] args) throws Exception  {
		
		//WebDriver driver = new FirefoxDriver();
		System.setProperty("webdriver.chrome.driver", "D://seleniumdrivers//chromedriver.exe");
        WebDriver driver=new ChromeDriver(); 
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.getCurrentUrl();
		File file = new File("C:\\Users\\kmali\\Desktop\\Automation\\SysnetAutomate\\src\\steps_sysnet\\SysnetGlobalProject\\src\\main\\java\\com\\Sysnet\\SafeMaker\\objects.properties");
			  
		FileInputStream fileInput = null;
		try {
			fileInput = new FileInputStream(file);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		Properties prop = new Properties();
		
		//load properties file
		try {
			prop.load(fileInput);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		//driver.get(prop.getProperty("URL"));
		driver.get(prop.getProperty("URL"));
				//Retrieve userid and password		
		driver.findElement(By.id("username")).sendKeys(prop.getProperty("username"));
		driver.findElement(By.id("password")).sendKeys(prop.getProperty("password"));
		driver.findElement(By.className("button_in")).click();
		System.out.println("URL ::" + prop.getProperty("URL"));
		System.out.println("User name::" +prop.getProperty("username"));
	    System.out.println("Password::" +prop.getProperty("password"));
	    File scrFile;
        scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        org.apache.commons.io.FileUtils.copyFile(scrFile, new File("C:\\Users\\kmali\\Desktop\\Kavitha\\images\\image1.png"));
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        MainPci.mpci(driver);
				
	}
  }

	

