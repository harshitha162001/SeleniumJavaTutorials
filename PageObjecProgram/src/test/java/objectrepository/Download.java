package objectrepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Download {
	ChromeDriver driver;
    public Download(ChromeDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }

	@FindBy(linkText="File Download")
	private WebElement FileDownloadClick;
	
    @FindBy(linkText = "sample.txt")
    private WebElement clickbutton;
    
  

    public void getFileDownloadLink(){
    	FileDownloadClick.click();
    }
    
    public void getClickButton()  {
    	
    	clickbutton.click();
    	}
}
