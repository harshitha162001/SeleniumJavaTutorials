package test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class dynamictable {
	ChromeDriver driver;

	@BeforeTest
	public void BfTest() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://money.rediff.com/gainers/bse/daily/groupall");
	}

	@Test
	public void DynamicTableTest() {
		driver.findElement(By
				.xpath("//div[@style='width:50%;font-size:14px;float:left;']//a[text()='Weekly']"))
				.click();

		List<WebElement> totalpagerow = driver.findElements(By.xpath("//table[@class='dataTable']//tbody//tr"));
		System.out.println(totalpagerow.size());

		List<WebElement> totalpagecoloum = driver.findElements(By.xpath("//table[@class='dataTable']//thead//tr//th"));
		System.out.println(totalpagecoloum.size());

		for (int i = 1; i <=totalpagerow.size() ; i++) {
			for (int j = 1; j <=totalpagecoloum.size() ; j++) {

				String elements = driver.findElement(By.xpath("//table[@class='dataTable']//tbody//tr["+i+"]//td["+j+"]"))
						.getText();
				System.out.print(elements);
				
			}
			System.out.println("\n");
		}

	}
}
