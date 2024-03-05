package objectrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CheckBox {
    ChromeDriver driver;
    public CheckBox(ChromeDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }

    @FindBy(linkText = "Checkboxes")
    private WebElement chkbox;

    @FindBy(css = "input:nth-child(1)")
    private WebElement chk1;

    @FindBy(xpath = "(//input[@type='checkbox'])[2]")
    private WebElement chk2;

    public void getCheckBox(){
        chkbox.click();
    }

    public void getChk1(){
        chk1.click();
    }

    public void getChk2(){
        chk2.click();
    }
}

