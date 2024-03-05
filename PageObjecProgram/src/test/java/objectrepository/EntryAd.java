package objectrepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EntryAd {
	ChromeDriver driver;
    public EntryAd(ChromeDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }

	@FindBy(linkText="Entry Ad")
	private WebElement EntryAdClick;
	
    @FindBy(xpath = "//p[text()='Close']")
    private WebElement closebutton;
    
  

    public void getEntryAdLink(){
    	EntryAdClick.click();
    }
    
    public void getCloseButton() throws InterruptedException  {
    	Thread.sleep(3000);
    	closebutton.click();
    	}
}
