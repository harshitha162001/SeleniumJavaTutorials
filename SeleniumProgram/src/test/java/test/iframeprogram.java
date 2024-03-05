package test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
 
import io.github.bonigarcia.wdm.WebDriverManager;
 
public class iframeprogram {
	ChromeDriver driver;
	@BeforeTest
	public void setup() {
		WebDriverManager.chromedriver().setup();
		 driver=new ChromeDriver();
 
		driver.manage().window().maximize();
	}
	@Test
	public void iframe() throws InterruptedException {
		driver.get("http://jqueryui.com/droppable/");
		driver.switchTo().frame(driver.findElement(By.cssSelector("iframe.demo-frame")));
		WebElement source =driver.findElement(By.id("draggable"));
		WebElement destn =driver.findElement(By.id("droppable"));
		Actions act=new Actions(driver);
		Thread.sleep(1000);
		act.dragAndDrop(source, destn).build().perform();
	}
}