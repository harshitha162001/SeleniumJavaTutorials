package ui;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class xpathexample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 WebDriverManager.chromedriver().setup();
			ChromeDriver driver=new ChromeDriver();
			driver.get("https://money.rediff.com/gainers");
			driver.manage().window().maximize();
			
			//xpath axes
			//self node
			String selfnode=driver.findElement(By.xpath("//a[contains(.,'Ravindra Energy Ltd')]/self::a")).getText();
			System.out.println("the self node is "+selfnode);
			
			//parent node
			String parentnode=driver.findElement(By.xpath("//a[contains(.,'Ravindra Energy Ltd')]/parent::td")).getText();
			System.out.println("The parent node is"+parentnode);
			
			//childnodes
			List<WebElement> childnodes=driver.findElements(By.xpath("//a[contains(.,'Ravindra Energy Ltd')]/ancestor::tr/child::*"));
			System.out.println("The parent node is"+childnodes.size());
			
			//ansestore
			String ansestore=driver.findElement(By.xpath("//a[contains(.,'Ravindra Energy Ltd')]/ancestor::tr")).getText();
			System.out.println("The ancestore is "+ansestore);//yella printing child
			
			  List<WebElement> following=driver.findElements(By.xpath("//a[contains(.,'Ravindra Energy Ltd')]/following::*"));
				System.out.println("The following is "+following.size());
				
				
				//following sibling
				List<WebElement> followingsib=driver.findElements(By.xpath("//a[contains(.,'Ravindra Energy Ltd')]/ancestor::tr/following-sibling::*"));
				System.out.println("The following  siblingis "+followingsib.size());
				
				
				//preceding
				
				List<WebElement> preceding=driver.findElements(By.xpath("//a[contains(.,'Ravindra Energy Ltd')]/preceding::*"));
				System.out.println("The preceding is "+preceding.size());	
			
				
				//precding sibling
				List<WebElement> precedingsib=driver.findElements(By.xpath("//a[contains(.,'Ravindra Energy Ltd')]/preceding::*"));
				System.out.println("The preceding is "+precedingsib.size());
				
			
				

	}

}
