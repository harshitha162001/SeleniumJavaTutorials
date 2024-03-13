package objectrepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class NestedFrames {
	ChromeDriver driver;
    public NestedFrames(ChromeDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }

	@FindBy(linkText="Nested Frames")
	private WebElement NestedFrameClick;
	
	@FindBy(tagName="body")
	private WebElement text;
	
	
    public void getLink(){
   NestedFrameClick.click();
    }
    
    public void PerformAction() {
    	driver.switchTo().frame("frame-top").switchTo().frame(0);
    	String displayText=text.getText();
    	System.out.println(displayText);
    	driver.switchTo().defaultContent();
    	System.out.println("main content"+driver.getPageSource());
    	driver.close();
    }
    
}
