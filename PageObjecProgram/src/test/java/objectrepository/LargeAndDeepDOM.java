package objectrepository;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LargeAndDeepDOM {
	ChromeDriver driver;
    public LargeAndDeepDOM(ChromeDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }

	@FindBy(linkText="Large & Deep DOM")
	private WebElement Click;
	
	@FindBy(xpath="//td[text()='45.6']")
	private WebElement text;
	
    public void getLink(){
    Click.click();
   
    }
    
    public void PerformAction() throws InterruptedException {
    	JavascriptExecutor js=(JavascriptExecutor)driver;
    	js.executeScript("window.scrollBy(0,1000000)");
    	Thread.sleep(4000);
    	System.out.print(text.getText());
    }
    
}
