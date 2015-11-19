package com.Sysnet.SafeMaker;

	import java.io.Console;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Hashtable;
import java.util.Properties;

import junit.framework.Assert;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class MainPci {

		private static final Properties mainprop = null;
		private static final String TimeSpan = null;
		private static final String selenium = null;
		private static final Hashtable<Object, Object> verifyTextPresent = null;
		private static final Assert self = null;
		private static final String element = null;

		@Deprecated  	
		@Test(priority=2)
	 // public static void main(String[] args) throws InterruptedException, IOException  {
		public static void mpci(WebDriver drivea) throws Exception{
		
			 File file = new File("C:\\Users\\kmali\\Desktop\\Automation\\SysnetAutomate\\src\\steps_sysnet\\SysnetGlobalProject\\src\\main\\java\\com\\Sysnet\\SafeMaker\\mainprop.properties");
		  
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
		/*	} catch (IOException e) {
				e.printStackTrace();
			}  
			
			*/
      		
			
					System.getProperty("user.dir"); 
			
					Thread.sleep(3000);
					JavascriptExecutor jse = (JavascriptExecutor)drivea;
						/* drivea.findElement(By.partialLinkText("Merchant User Management")).click();
						 String title = drivea.getTitle();
						 System.out.println("Page title is: "+title);
						 Assert.assertTrue(title.contains("Merchant User Management"));					
						 //Assert.assertTrue(verifyTextPresent.contains("Merchant User Management"));
						 drivea.getTitle();
						// Assert.IsTrue(verifyTitle("Merchant User Management"));
						 // Console.WriteLine("Merchant User Management is present on the home page");
						 Thread.sleep(1000);
						 //2nd link verification
						 drivea.findElement(By.partialLinkText("System User Management")).click();
						 drivea.getTitle();*/
					/*	 String title1 = drivea.getTitle();
						 System.out.println("Page title is: "+title1);
						 Assert.assertTrue(title1.contains("Personalize Username")); */	
						 Thread.sleep(3000);
						 ((JavascriptExecutor)drivea).executeScript("password.focus()");
						 drivea.findElement(By.id("password")).sendKeys(prop.getProperty("password"));
						 ((JavascriptExecutor)drivea).executeScript("confirmPassword.focus()");
						 drivea.findElement(By.id("confirmPassword")).sendKeys(prop.getProperty("confirmPassword"));
						 ((JavascriptExecutor)drivea).executeScript("confirmEmail.focus()");
						 drivea.findElement(By.id("confirmEmail")).sendKeys(prop.getProperty("confirmEmail"));
						 drivea.findElement(By.className("button_in")).click();
						 drivea.findElement(By.partialLinkText("GO")).click();
						 drivea.findElement(By.className("button_in")).click();
						 drivea.findElement(By.className("Next >>")).click();
						 
						 
						/* drivea.getTitle();
						 drivea.findElement(By.partialLinkText("System User Management")).click();
						 drivea.getTitle();
						 drivea.findElement(By.partialLinkText("System User Management")).click();
						 drivea.getTitle();
						 drivea.findElement(By.partialLinkText("System User Management")).click();
						 drivea.getTitle();
						 drivea.findElement(By.partialLinkText("System User Management")).click();
						 drivea.getTitle();
						 Assert.IsTrue(verifyTextPresent("System User Management"));
						  Console.WriteLine("System User Management is present on the home page");
						 Thread.sleep(1000);
						 drivea.findElement(By.partialLinkText("Profile Admin")).click();
						 drivea.getTitle();
						 Assert.IsTrue(verifyTextPresent("Profile Admin"));
						 Console.WriteLine("Profile Admin is present on the home page");
						 Thread.sleep(1000);
						 drivea.findElement(By.partialLinkText("Questionnaire Mgmt")).click();
						 drivea.getTitle();
						 Assert.IsTrue(verifyTextPresent("Controllers"));
						 Console.WriteLine("Controllers is present on the home page");
						 Thread.sleep(1000);
						 drivea.findElement(By.partialLinkText("ChasePath Mgmt")).click();
						 drivea.getTitle();
						 Assert.IsTrue(verifyTextPresent("This is the initial workflow to engage a company"));
						 Console.WriteLine("This is the initial workflow to engage a company is present on the home page");
						 Thread.sleep(1000);
						 drivea.findElement(By.partialLinkText("Choose Skin")).click();
						 drivea.getTitle();
						 Assert.IsTrue(verifyTextPresent("Choose client skin"));
						 Console.WriteLine("Choose client skin is present on the home page");
						 Thread.sleep(1000);
						 drivea.findElement(By.partialLinkText("Sub Client Management")).click();
						 drivea.getTitle();
						 Assert.IsTrue(verifyTextPresent("Subclient management"));
						 Console.WriteLine("Subclient management");
						 Thread.sleep(1000);
						 drivea.close(); */
			} catch (IOException e) {
				e.printStackTrace();
			}  
	       
		}}

			        
	        

		

