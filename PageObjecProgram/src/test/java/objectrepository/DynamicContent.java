package objectrepository;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class DynamicContent {
	ChromeDriver driver;
    public DynamicContent(ChromeDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }

	@FindBy(linkText="Dynamic Content")
	private WebElement DynamicContentClick;
	
    @FindBy(css = ".large-10")
    private WebElement selectionelement;
    
    @FindBy(css="p a")
    private WebElement clickbutton;

    public void getDynamicContentLink(){
    	DynamicContentClick.click();
    }
    
    public void getClickButton() {
    	clickbutton.click();
    }
    

    public void getselectedElement(){
    	  Actions act =new Actions(driver);
          act.keyDown(selectionelement,Keys.CONTROL).sendKeys("A").build().perform();
        
    }

}
