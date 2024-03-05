package ui;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

import io.github.bonigarcia.wdm.WebDriverManager;

public class takingscreenshot {

	public static void main(String[] args) throws IOException {
		 WebDriverManager.chromedriver().setup();
			ChromeDriver driver=new ChromeDriver();
			driver.get("http://www.ebay.com");
			driver.manage().window().maximize();
			File f=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			//(f,new File("C:\\Users\\haithal\\Documents\\sample\\takingscreenshotofebay.jpg"));
             Files.copy(f, new File("C:\\Users\\haithal\\Documents\\sample\\takingscreenshotofebay.jpg"));
	}

}
