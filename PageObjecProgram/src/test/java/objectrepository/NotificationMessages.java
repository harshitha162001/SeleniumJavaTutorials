package objectrepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class NotificationMessages {
	ChromeDriver driver;
    public NotificationMessages(ChromeDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }

	@FindBy(linkText="Notification Messages")
	private WebElement linkClick;
	
	@FindBy(linkText="Click here")
	private WebElement Click2;
	
	@FindBy(id="flash")
	private WebElement text;
	
    public void getLink(){
   linkClick.click();
   
    }
    
    public void PerformAction() {
    	Click2.click();
    	String result=text.getText();
    	System.out.println(result);
    			  
    }
    
}
