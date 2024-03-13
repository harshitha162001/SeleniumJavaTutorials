package objectrepository;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SortedDataTable {
	  ChromeDriver driver;
	    public SortedDataTable(ChromeDriver driver){
	        this.driver=driver;
	        PageFactory.initElements(driver,this);
	    }

	    @FindBy(linkText = "Sortable Data Tables")
	    private WebElement linkclick;
	  //table[@id='table1']//tbody//tr
	    @FindBy(xpath = "//table[@id='table1']//tbody//tr")
	    private List<WebElement> tablerow;
	    
	    @FindBy(xpath = "//table[@id='table1']//thead//tr//th")
	    private List<WebElement> tablecolumn;
	    
	    
	    public void getlink(){
	       linkclick.click();
	    }

	    public void performAction(){
	    	List<WebElement> totalpagerow =tablerow;
			System.out.println(totalpagerow.size());

			List<WebElement> totalpagecoloum = tablecolumn;
			System.out.println(totalpagecoloum.size());

			for (int i = 1; i <=totalpagerow.size() ; i++) {
				for (int j = 1; j <=totalpagecoloum.size() ; j++) {

					String elements = driver.findElement(By.xpath("//table[@id='table1']//tbody//tr["+i+"]//td["+j+"]"))
							.getText();
					System.out.print(" "+elements);
					
				}
				System.out.println("\n");
			}
	    }

}
