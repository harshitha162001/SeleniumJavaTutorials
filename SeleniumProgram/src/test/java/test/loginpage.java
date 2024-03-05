package test;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class loginpage
{

	
		ChromeDriver driver;
		@BeforeMethod
		public void setup()
		{
			WebDriverManager.chromedriver().setup();
			 driver=new ChromeDriver();
	 
			driver.manage().window().maximize();
			driver.get("https://rahulshettyacademy.com/loginpagePractise/");
			}
		
	 
	  @Test(dataProvider="logindata",dataProviderClass=ExcelFileProg.class)
	  public void EndToEndTest(String UserName,String Password) throws InterruptedException
	  {
	      
	    //  Thread.sleep(2000);
	      driver.findElement(By.id("username")).sendKeys(UserName);
	     driver.findElement(By.name("password")).sendKeys(Password);
	      driver.findElement(By.xpath("//div[@class='form-group'][5]/label/span/input")).click();//checkbox
	 
	      driver.findElement(By.xpath("//input[@type='submit']")).click();
	  }
	}
