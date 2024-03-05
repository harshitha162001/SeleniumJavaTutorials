package objectrepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Horizontal_Slider {
	ChromeDriver driver;
    public Horizontal_Slider(ChromeDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }

	@FindBy(linkText="Horizontal Slider")
	private WebElement SliderClick;
	
	
	
	@FindBy(css="input[type='range']")
	private WebElement slider;
	
   
    
   
    public void getLink(){
    SliderClick.click();
    
    }
    
    public void PerformAction() {
    	Actions act=new Actions(driver);
    	act.dragAndDropBy(slider, 300, 0).perform();
    }
    
}
