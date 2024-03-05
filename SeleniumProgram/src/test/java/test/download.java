package test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
 
import io.github.bonigarcia.wdm.WebDriverManager;
 
public class download {
	ChromeDriver driver;
	@BeforeTest
	public void setup() {
		WebDriverManager.chromedriver().setup();
		 driver=new ChromeDriver();
 
		driver.manage().window().maximize();
		}
	@Test
	public void Download() {
		driver.get("http://demo.automationtesting.in/FileDownload.html");
		driver.findElement(By.id("textbox")).sendKeys("testing files");
		driver.findElement(By.id ("createTxt")).click(); //Generate button
		driver.findElement(By.id("link-to-download")).click(); //click on downlaod link
	}
 
}