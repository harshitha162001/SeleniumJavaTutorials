package objectrepository;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DynamicControls {
	ChromeDriver driver;
    public DynamicControls(ChromeDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }

	@FindBy(linkText="Dynamic Controls")
	private WebElement DynamicControlsClick;
	
    @FindBy(css = "form[id='input-example'] button")
    private WebElement enableOrDisablebutton;
    
    @FindBy(css="form input[type='text']")
    private WebElement sendinginput;

    public void getDynamicControlsLink(){
    	DynamicControlsClick.click();
    }
    
    public void getClickButton() throws InterruptedException {
    	enableOrDisablebutton.click();
    	Thread.sleep(3000);
    	sendinginput.sendKeys("harshitha");
    	enableOrDisablebutton.click();
    	}
    

    
}
