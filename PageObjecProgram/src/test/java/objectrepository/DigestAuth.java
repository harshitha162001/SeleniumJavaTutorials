package objectrepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DigestAuth {
	ChromeDriver driver;
    public DigestAuth(ChromeDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }

    @FindBy(linkText = "Digest Authentication")
    private WebElement authClick;

   

    @FindBy(xpath = "(//input[@type='checkbox'])[2]")
    private WebElement chk2;

    public void getDigestAuth(){
        authClick.click();
    }

    public void getWindow(){
        driver.switchTo().alert();
        
    }

   


}
