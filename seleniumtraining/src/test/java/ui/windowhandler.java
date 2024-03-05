package ui;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;


import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class windowhandler {
	 public static void main(String[] args) {

	WebDriverManager.chromedriver().setup();
	ChromeDriver driver=new ChromeDriver();
	driver.get("https://www.irctc.co.in/nget/train-search");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(50,TimeUnit.SECONDS) ;
	
	driver.findElement(By.xpath("//span[@class='allcircle circletwo']")).click();
	
	 Set<String> handles=driver.getWindowHandles();
	 Iterator it=handles.iterator();
	 
	 String parentid=(String) it.next();
	 String childid=(String)it.next();
	 
	 driver.switchTo().window(childid);
	 
	 
	driver.findElement(By.xpath("//span[text()='Bus Tickets']")).click();
	
	
	
	
	
	 }
}
