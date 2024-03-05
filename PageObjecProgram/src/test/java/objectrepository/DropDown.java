package objectrepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class DropDown {
	 ChromeDriver driver;
	    public DropDown(ChromeDriver driver){
	        this.driver=driver;
	        PageFactory.initElements(driver,this);
	    }

		@FindBy(linkText="Dropdown")
		private WebElement DropdownLink;
		
	    @FindBy(css = "#dropdown")
	    private WebElement selectclick;

	    public void getDropdownLink(){
	    	DropdownLink.click();
	    }

	    public void getDDopp(){
	        Select op=new Select(selectclick);
	        op.selectByValue("1");
	        
	    }

}
