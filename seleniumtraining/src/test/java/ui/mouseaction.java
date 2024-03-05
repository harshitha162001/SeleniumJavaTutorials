package ui;

import java.awt.Desktop.Action;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class mouseaction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		//driver.get("https://omayo.blogspot.com/p/page3.html");
		
		
		
		/*
		 * WebElement blogs=driver.findElement(By.id("blogsmenu")); 
		 * Actions action=new
		 * Actions(driver); action.moveToElement(blogs).perform();
		 * 
		 * 
		 * WebElement
		 * option2=driver.findElement(By.xpath("//span[text()='SeleniumByArun']"));
		 * 
		 * action.moveToElement(option2).perform(); action.click().build().perform();
		 */
		
		
		
		/*
		 * WebElement draganddropby=driver.findElement(By.xpath(
		 * "//a[@aria-labelledby='price-max-label']")); Actions action=new
		 * Actions(driver); action.dragAndDropBy(draganddropby, 100, 0).perform();
		 */
		
		/*
		 * driver.get("https://tutorialsninja.com/demo/"); WebElement
		 * contextclick=driver.findElement(By.id("search")); Actions action=new
		 * Actions(driver); action.contextClick(contextclick).perform();
		 */
		
		//double click
		//remove movetoelement  replace double click
		
		/*
		 * driver.get(
		 * "http://dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
		 * Actions action =new Actions(driver);
		 * 
		 * WebElement clickandhold=driver.findElement(By.id("box1"));
		 * action.clickAndHold(clickandhold);
		 * 
		 * WebElement movetoelement=driver.findElement(By.id("box101"));
		 * //action.moveToElement(movetoelement).release().build().perform();
		 * action.dragAndDrop(clickandhold, movetoelement).perform();
		 */
		
		
		//keybord evenys
		driver.get("https://omayo.blogspot.com/");
		
		WebElement keydownup=driver.findElement(By.linkText("compendiumdev"));
		
		Actions action=new Actions(driver);
		action.keyDown(Keys.CONTROL).moveToElement(keydownup).click().keyUp(Keys.CONTROL).build().perform();
		
		
		
		
		
		
		

	}

}
