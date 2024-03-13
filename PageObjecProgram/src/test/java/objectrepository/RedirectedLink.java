package objectrepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RedirectedLink {
	ChromeDriver driver;
    public RedirectedLink(ChromeDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }

	@FindBy(linkText="Redirect Link")
	private WebElement linkClick;
	
	@FindBy(linkText="here")
	private WebElement Click2;
	
	@FindBy(id="mce_0_ifr")
	private WebElement frameid;
	
	@FindBy(css="body p")
	private WebElement text;
	
   
    
   
    public void getLink(){
    linkClick.click();
    Click2.click();
    }
    
    public void PerformAction() throws InterruptedException {
    	driver.navigate().forward();
    	Thread.sleep(3000);
    	driver.navigate().back();
    	Thread.sleep(3000);
    	driver.navigate().refresh();
    }
    
}
