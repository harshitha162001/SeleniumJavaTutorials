//package testpackage;
//
//import java.time.Duration;
//
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.testng.Assert;
//import org.testng.annotations.AfterMethod;
//import org.testng.annotations.Test;
//
//import io.github.bonigarcia.wdm.WebDriverManager;
//import objectrepository.LoginPage;
//import objectrepository.MyAccountPage;
//
//public class LoginTest {
//	ChromeDriver driver;
//  @Test
//	public void Login() {
//		WebDriverManager.chromedriver().setup();
//		 driver=new ChromeDriver();
//		
//		driver.manage().window().maximize();
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
//		driver.get("https://tutorialsninja.com/demo/index.php?route=account/login");
//		
//		LoginPage page=new LoginPage(driver);
//		
//		page.getemailidfield().sendKeys("arun.selenium@gmail.com");
//		page.getpasswordfield().sendKeys("Second@123");
//		page.getLoginButton().click();
//		
//		MyAccountPage page2=new MyAccountPage(driver);
//		Assert.assertTrue(page2.getAccountField().isDisplayed());
//		
//		
//		
//		
//	}
//  @AfterMethod
//  public void closer() {
//	  driver.close();
//  }
//}
