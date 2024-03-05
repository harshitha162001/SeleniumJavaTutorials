package ui;


import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class keyboardevents{

	public static void main(String[] args) throws InterruptedException {
		
        // Initialize ChromeDriver
	// Here we assume that the ChromeDriver path has been set in the System Global variables
        WebDriver driver=new ChromeDriver();
       
        //Navigate to the demo site
        driver.get("https://demoqa.com/text-box");
       
        // Enter the Full Name
        WebElement fullName = driver.findElement(By.id("userName"));
        fullName.sendKeys("Mr.Peter Haynes");
        
        //Enter the Email
        WebElement email=driver.findElement(By.id("userEmail"));
        email.sendKeys("PeterHaynes@toolsqa.com");
        
        // Enter the Current Address
        WebElement currentAddress=driver.findElement(By.id("currentAddress"));
        currentAddress.sendKeys("43 School Lane London EC71 9GO");
        
		/*
		 * // Copy the Current Address currentAddress.sendKeys(Keys.CONTROL);
		 * currentAddress.sendKeys("A"); currentAddress.sendKeys(Keys.CONTROL);
		 * currentAddress.sendKeys("C"); Thread.sleep(1000); //Press the TAB Key to
		 * Switch Focus to Permanent Address currentAddress.sendKeys(Keys.TAB);
		 * Thread.sleep(1000); //Paste the Address in the Permanent Address field
		 * WebElement permanentAddress=driver.findElement(By.id("permanentAddress"));
		 * Thread.sleep(1000); permanentAddress.sendKeys(Keys.CONTROL);
		 * 
		 * permanentAddress.sendKeys("V"); Thread.sleep(1000); //Compare Text of current
		 * Address and Permanent Address //
		 * assertEquals(currentAddress.getAttribute("value"),permanentAddress.
		 * getAttribute("value"));
		 */
        Actions act =new Actions(driver);
        act.keyDown(currentAddress,Keys.CONTROL).sendKeys("A").sendKeys("C").build().perform();
        act.keyDown(currentAddress,Keys.TAB).perform();
        WebElement permanentAddress=driver.findElement(By.id("permanentAddress"));
        act.keyDown(permanentAddress,Keys.CONTROL).sendKeys("V").build().perform();
       
        //driver.close();

	}
}