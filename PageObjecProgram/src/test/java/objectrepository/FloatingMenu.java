package objectrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class FloatingMenu {
    ChromeDriver driver;
    public FloatingMenu(ChromeDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath = "//a[text()='Floating Menu']")
    private WebElement menu;

    @FindBy(xpath = "//a[text()='News']")
    private WebElement news;

    public void getMenu()
    {
        menu.click();
    }
    public void getFloating()
    {
        String act="https://the-internet.herokuapp.com/floating_menu#news";
        news.click();
        String exp=driver.getCurrentUrl();
        Assert.assertEquals(act,exp);

    }


}
