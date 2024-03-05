package objectrepository;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AddAndDelete {
    WebDriver driver;
    public AddAndDelete(WebDriver driver){
        this.driver=driver;
    }
    private final By addordel=By.linkText("Add/Remove Elements");

    private final By add=By.cssSelector("button[onclick='addElement()']");
    private final By del=By.className("added-manually");

    public void getaddordel(){
        driver.findElement(addordel).click();
    }

    public void getadd(){
        driver.findElement(add).click();
    }

    public void getdel(){
        driver.findElement(del).click();
    }
}
