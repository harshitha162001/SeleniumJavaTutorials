package objectrepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class JavascriptAlert {
	ChromeDriver driver;
    public JavascriptAlert(ChromeDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }

	@FindBy(linkText="JavaScript Alerts")
	private WebElement JSAlertClick;
	
    @FindBy(xpath = "//button[text()='Click for JS Alert']")
    private WebElement alertbutton;
    
  

    public void getLink(){
    	JSAlertClick.click();
    }
    
    public void getalertButton()  {
    	alertbutton.click();
    	driver.switchTo().alert().accept();
    	}
}
