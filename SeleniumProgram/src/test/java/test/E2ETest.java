package test;


import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
 
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
 
import io.github.bonigarcia.wdm.WebDriverManager;
 
public class E2ETest
{
	ChromeDriver driver;
	@BeforeTest
	public void setup() {
		WebDriverManager.chromedriver().setup();
		 driver=new ChromeDriver();
 
		driver.manage().window().maximize();
		}
 
  @Test
  public void EndToEndTest() throws InterruptedException
  {
      
      driver.get("https://rahulshettyacademy.com/loginpagePractise/");
      String[] expectedProducts = { "iphone X", "Blackberry" };
      List actualProducts = new ArrayList<>();//creating new array
      driver.findElement(By.id("username")).sendKeys("rahulshettyacademy");
     driver.findElement(By.name("password")).sendKeys("learning");
      driver.findElement(By.xpath("//div[@class='form-group'][5]/label/span/input")).click();//checkbox
 
      driver.findElement(By.xpath("//input[@type='submit']")).click();
      WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(20));
      wait.until(ExpectedConditions.presenceOfElementLocated(By.partialLinkText("Checkout")));//wait until checkout is visible
     
       
       List<WebElement> products= driver.findElements(By.tagName("app-card"));
       System.out.println(products.size());
      for(WebElement product:products)
      {	
    	
    	  String productName = product.findElement(By.cssSelector(".card-title a")).getText();
          if (productName.equals(expectedProducts[0]) || productName.equals(expectedProducts[1])) {
              product.findElement(By.cssSelector(".card-footer button")).click();    
          }
          
      }
     
      driver.findElement(By.partialLinkText("Checkout")).click();
 
      List<WebElement> checkoutCards =driver.findElements(By.cssSelector("h4 a"));
      for (WebElement card : checkoutCards) {
          actualProducts.add(card.getText());
      }
      System.out.println(actualProducts);
      Assert.assertEquals(actualProducts.toArray(new String[0]), expectedProducts);
 
 
      //clicking checkout button
      driver.findElement(By.xpath("//button[@class=\"btn btn-success\"]")).click();
 
 
      //selecting india
      driver.findElement(By.id("country")).sendKeys("ind");
 
      wait.until(ExpectedConditions.presenceOfElementLocated(By.linkText("India")));
      driver.findElement(By.linkText("India")).click() ;
 
      driver.findElement(By.cssSelector(".checkbox-primary")).click();
      driver.findElement(By.cssSelector("[value='Purchase']")).click();
 
    
      Assert.assertTrue(driver.findElement(By.xpath("//div[@class=\"alert alert-success alert-dismissible\"]")).isDisplayed(),"unsuccessfull");
 
 
  }
 
}