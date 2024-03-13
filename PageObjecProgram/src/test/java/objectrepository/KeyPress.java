package objectrepository;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class KeyPress {
	ChromeDriver driver;
    public KeyPress(ChromeDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }

	@FindBy(linkText="Key Presses")
	private WebElement keypressClick;
	
    @FindBy(id = "target")
    private WebElement inputfield;
    
    @FindBy(id = "result")
    private WebElement result;
  

    public void getLink(){
    	keypressClick.click();
    }
    
    public void operation() throws InterruptedException  {
    	Actions act =new Actions(driver);
       act.keyDown(inputfield,Keys.TAB).perform();
       String str="You entered: TAB";
      String result1 =result.getText();
       Thread.sleep(3000);
      Assert.assertEquals(result1,str);
    	}
}
