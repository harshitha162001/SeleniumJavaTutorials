package objectrepository;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class Multiple_Windows {
	ChromeDriver driver;
    public Multiple_Windows(ChromeDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }

	@FindBy(linkText="Multiple Windows")
	private WebElement WindowsClick;
	
	@FindBy(linkText="Click Here")
	private WebElement NewWindowClick;
	
	@FindBy(id="mce_0_ifr")
	private WebElement frameid;
	
	@FindBy(css="body p")
	private WebElement text;
	
   
    
   
    public void getLink(){
   WindowsClick.click();
   NewWindowClick.click();
    }
    
    public void PerformAction() {
     String exp="https://the-internet.herokuapp.com/windows/new";
    	
   	 Set<String> handles=driver.getWindowHandles();
   	 Iterator it=handles.iterator();
   	 
   	 String parentid=(String) it.next();
   	 String childid=(String)it.next();
   	 
   	 driver.switchTo().window(childid);
   	String act =driver.getCurrentUrl();
   	 Assert.assertEquals(act,exp );
    }
    
}
