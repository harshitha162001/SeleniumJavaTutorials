package objectrepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Geolocationopp {
	ChromeDriver driver;
    public Geolocationopp(ChromeDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }

	@FindBy(linkText="Geolocation")
	private WebElement GeolocationClick;
	
    @FindBy(xpath = "//button[text()='Where am I?']")
    private WebElement locatebutton;
    
    @FindBy(linkText="See it on Google")
	private WebElement map;
  

    public void getLink(){
    	GeolocationClick.click();
    }
    
    public void getlocateButton() {
    	locatebutton.click();
    	}
    public void getMap() {
    	map.click();
    }
}
