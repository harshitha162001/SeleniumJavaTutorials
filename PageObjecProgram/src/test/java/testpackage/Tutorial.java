package testpackage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import objectrepository.AddAndDelete;
import objectrepository.CheckBox;
import objectrepository.ContextMenu;
import objectrepository.Download;
import objectrepository.DragAndDrop;
import objectrepository.DropDown;
import objectrepository.DynamicContent;
import objectrepository.DynamicControls;
import objectrepository.EntryAd;
import objectrepository.Frames;
import objectrepository.Geolocationopp;
import objectrepository.Horizontal_Slider;
import objectrepository.Infinate_Scoll;
import objectrepository.KeyPress;
import objectrepository.LargeAndDeepDOM;
import objectrepository.RedirectedLink;
import objectrepository.UploadFile;

import java.time.Duration;


public class Tutorial {
    ChromeDriver driver;
    @BeforeMethod
    public void initialize() {
        driver= new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
        driver.get("https://the-internet.herokuapp.com/");
    }
    @Test
    public void ClickOpp() throws InterruptedException {
        AddAndDelete ad =new AddAndDelete(driver);
        ad.getaddordel();
        Thread.sleep(3000);
        
        ad.getadd();
        ad.getdel();;
    }

    @Test
    public void CheckboxeOperation() throws InterruptedException {
        
        CheckBox ck= new CheckBox(driver);
        ck.getCheckBox();
        Thread.sleep(2000);
        ck.getCheckBox();
        ck.getChk1();
        ck.getChk2();
    }

    @Test
    public void ContextMenuOpp() throws InterruptedException {
       
        ContextMenu cm = new ContextMenu(driver);
        cm.getContextMenu();
        Thread.sleep(2000);
        cm.getBox();
    }
    @Test
    public void DragAndDropopp() throws InterruptedException {
    	DragAndDrop dd=new DragAndDrop(driver);
    	dd.getdragAndDropLink();
    	dd.getDADopp();
    	driver.close();
    	
    	
    }
    @Test
    public void DropDownOpp() {
    	DropDown d=new DropDown(driver);
    	d.getDropdownLink();
    	d.getDDopp();
    }
    
    @Test
    public void Dynamic_Content() {
    	DynamicContent dd=new DynamicContent(driver);
    	dd.getDynamicContentLink();
    	dd.getClickButton();
    	dd.getselectedElement();
    	
    
    }
    @Test
    public void Dynamic_Controls() throws InterruptedException {
    	DynamicControls Dc=new DynamicControls(driver);
    	Dc.getDynamicControlsLink();
    	Dc.getClickButton();
    }
    @Test
    public void Entry_Ad() throws InterruptedException {
    	EntryAd ad=new EntryAd(driver);
    	ad.getEntryAdLink();
    	ad.getCloseButton();
    }
    @Test
    public void download() {
    	Download d=new Download(driver);
    	d.getFileDownloadLink();
    	d.getClickButton();
    	
    }
    @Test
    public void Upload() {
    	UploadFile file=new UploadFile(driver);
    	file.getfileUploadLink();
    	file.getClickButton();
    }
    @Test
    public void FormAuthontication() {
    	objectrepository.FormAuthontication f=new objectrepository.FormAuthontication(driver);
    	f.getLink();
    	f.getUsernameandPassword();
    	f.logoutbtn();
    }
    
    @Test
    public void FramesConcepts() {
    	Frames f=new Frames(driver);
    	f.getLink();
    	f.PerformAction();
    }
    
    @Test
    public void Hover() {
    objectrepository.Hover h=new objectrepository.Hover(driver);
    h.getLink();
    h.PerformAction();
    }
    
    @Test
    public void HorizontalSlider() {
    	Horizontal_Slider slider=new Horizontal_Slider(driver);
    	slider.getLink();
    	slider.PerformAction();
    }
    
    @Test
    public void Infinite_Scroll() throws InterruptedException {
    	Infinate_Scoll s=new Infinate_Scoll(driver);
    	s.getLink();
    	Thread.sleep(3000);
    	s.PerformAction();
    }
    
    @Test
    public void FloatingMenu() {
    	objectrepository.FloatingMenu m=new objectrepository.FloatingMenu(driver);
    	m.getMenu();
    	m.getFloating();
    	
    }
    @Test
    public void GeoLocation() {
    	Geolocationopp opp=new Geolocationopp(driver);
    	opp.getLink();
    	opp.getlocateButton();
    	opp.getMap();
    }
    
    @Test
    public void JavascriptAlert() {
    	objectrepository.JavascriptAlert j=new objectrepository.JavascriptAlert(driver);
    	j.getLink();
    	j.getalertButton();
    	
    }
    
    @Test
    public void Key_Presses() throws InterruptedException {
    	KeyPress kp=new KeyPress(driver);
    	kp.getLink();
    	kp.operation();
    }
    
  @Test
  public void Multiple_Windows() {
	  objectrepository.Multiple_Windows wind=new objectrepository.Multiple_Windows(driver);
	  wind.getLink();
	  wind.PerformAction();
	  
  }
  @Test
  public void NestedFrames() {
	  objectrepository.NestedFrames s=new objectrepository.NestedFrames(driver);
	  s.getLink();
	  s.PerformAction();
	  
  }
  @Test
  public void NotificationMessages() {
	  objectrepository.NotificationMessages s=new objectrepository.NotificationMessages(driver);
	  s.getLink();
	  s.PerformAction();
  }
  
 @Test
 public void RediredLink() throws InterruptedException
 {
	 RedirectedLink link=new RedirectedLink(driver);
	 link.getLink();
	 link.PerformAction();
 }
 
 @Test
 public void Shadow_DOM() {
	 objectrepository.Shadow_DOM m=new objectrepository.Shadow_DOM(driver);
	 m.getLink();
	 m.PerformAction();
 }
 
 @Test
 public void LargeandDeepDOM() throws InterruptedException {
	LargeAndDeepDOM dom=new LargeAndDeepDOM(driver);
	dom.getLink();
	dom.PerformAction();
 }
 
 @Test
 public void SortedDataTable() {
	 objectrepository.SortedDataTable table=new objectrepository.SortedDataTable(driver);
	 table.getlink();
	 table.performAction();
	 
 }
  
    
  
    
    


}
