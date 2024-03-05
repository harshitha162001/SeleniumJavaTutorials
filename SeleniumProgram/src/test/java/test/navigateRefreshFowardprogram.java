package test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
 
import io.github.bonigarcia.wdm.WebDriverManager;
 
public class navigateRefreshFowardprogram {
	ChromeDriver driver;
	@BeforeTest
	public void setup() {
		WebDriverManager.chromedriver().setup();
		 driver=new ChromeDriver();
 
		driver.manage().window().maximize();
	}
	@Test
	public void navigate() throws InterruptedException {
		  driver.get("http://www.google.com");
		     driver.manage().window().maximize();
		     driver.navigate().to("https://rahulshettyacademy.com/locatorspractice/");
		     driver.findElement(By.id("inputUsername")).sendKeys("Amulya");
			 driver.findElement(By.name("inputPassword")).sendKeys("rahulshettyacademy");
			 driver.findElement(By.xpath("//button[@class='submit signInBtn']")).click();
			 Thread.sleep(2000);
		     driver.navigate().refresh();
		     Thread.sleep(2000);
		     driver.navigate().back();
		     Thread.sleep(2000);
		     driver.navigate().forward();
	}
}