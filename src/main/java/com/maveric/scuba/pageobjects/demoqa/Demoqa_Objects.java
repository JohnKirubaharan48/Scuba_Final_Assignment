package com.maveric.scuba.pageobjects.demoqa;

import org.openqa.selenium.By;

public class Demoqa_Objects {
	
//*************************************************Elements*****************************************************************
	public By Elements = By.xpath("//div[@class='card-body']//h5[text()='Elements']");
	
	//=============Text box==================
	public  By TextBox_TextBox= By.xpath("//span[text()='Text Box']");
	public  By TextBox_Fullname= By.id("userName");
	public  By TextBox_EmailId = By.id("userEmail");
	public  By TextBox_CurrentAddress = By.id("currentAddress");
	public  By TextBox_PermanentAddress = By.id("permanentAddress");
	public  By submit = By.xpath("//button[text()='Submit']");
	
	//=============Check box==================	
	public  By CheckBox_Checkbox = By.xpath("//span[text()='Check Box']");
	public  By CheckBox_Home = By.xpath("//span[@class='rct-checkbox'][1]");
	public  By CheckBox_Expand = By.xpath("//div[@class='rct-options']//button[1]");
	public  By CheckBox_Collapse = By.xpath("//div[@class='rct-options']//button[2]");
	
	//=============RadioButton==================
	public  By RadioButton_RadioButton = By.xpath("//span[text()='Radio Button']");	
	public  By RadioButton_YesOption = By.xpath("//label[@for='yesRadio']");
	public  By RadioButton_ImpressOption = By.xpath("//label[@for='impressiveRadio']");
	public  By RadioButton_NoOption = By.xpath("//label[@for='NoRadio']");
			
	//=============Buttons==================
	public  By Button_Buttons = By.xpath("//span[text()='Buttons']");
	public  By Button_DoubleClick = By.id("doubleClickBtn");
	public  By Button_RightClick = By.id("rightClickBtn");
	public  By clickMe = By.xpath("//button[text()='Click Me']");
	
	
	//=============Links=================
	public  By Link_links = By.xpath("//span[text()='Links']");
	public  By Link_Created = By.xpath("//*[@id='created']");
			
			
	//=============Upload & Download==================		
	public  By UploadAndDownload = By.xpath("//span[text()='Upload and Download']");
	public  By ChooseUploadFile= By.xpath("//div[@class='form-file']//input[@id='uploadFile']");
	
	//=============Dynamic Properties==================		
	public  By DyanmicProperty = By.xpath("//span[text()='Dynamic Properties']");
	public  By Enable5Secs = By.xpath("//button[@id='enableAfter']");
	public  By Colorchange = By.xpath("//button[@id='colorChange']");
	public  By VisibleAfter5secs = By.xpath("//button[@id='Visible After 5 Seconds']");
	
	
	
//*************************************************Alerts,Frames, Windows*****************************************************************	
	public  By Alerts_Frames_WindowsOptions = By.xpath("//div[text()='Alerts, Frame & Windows']");
	public  By Mainscreen_Alerts_Frames_WindowsOptions = By.xpath("//div[@class='card-body']//h5[text()='Alerts, Frame & Windows']");
	//=============Alerts==================
	public  By AlertOption = By.xpath("//span[text()='Alerts']");
	public  By AlertButton = By.xpath("//Button[text()='Click me']");
	public  By AlertText =By.xpath("//span[text()='Click Button to see alert ']");
	
	//=============Frames==================	
	public  By FrameOption = By.xpath("//span[text()='Frames']");
	
	//=============Browser==================	
	public  By BrowserOption = By.xpath("//span[text()='Browser Windows']");
	public  By Browser_Windows =By.xpath("//Button[@id='tabButton']");
	
		
	public  By Modal_DialogsOption = By.xpath("//span[text()='Modal Dialogs']");
	public  By SmallModal_Button = By.xpath("//Button[@id='showSmallModal']");
	public  By LargeModal_Button = By.xpath("//Button[@id='showLargeModal']");


//*************************************************Interactions*****************************************************************
	public  By InteractionsButton = By.xpath("//div[text()='Interactions']");
	public  By SortableButton = By.xpath("//span[text()='Sortable']");
	public  By SelectableButton = By.xpath("//span[text()='Selectable']");
	
	public  By ResizableButton = By.xpath("//span[text()='Resizable']");
	public  By Resize = By.xpath("(//span[@class='react-resizable-handle react-resizable-handle-se'])[1]");
	
	public  By DroppableButton = By.xpath("//span[text()='Droppable']");
	public  By DragabbleButton = By.xpath("//span[text()='Dragabble']");
	public  By fromElement = By.xpath("//*[@id='draggable']");
	public  By toElement = By.xpath("//*[@id='droppable']");
	
//*************************************************Interactions*****************************************************************	
	public  By Interactions = By.xpath("//div[@class='card-body']//h5[text()='Interaction']");
	
//*************************************************Forms*****************************************************************
	public  By form = By.xpath("//div[@class='card-body']//h5[text()='Forms']");
	
	//=======Practice Forms======
	public  By Practice_Form = By.xpath("//span[text()='Practice Form']");
	public  By FirstName= By.id("firstName");
	public  By LastName = By.id("lastName");
	public  By UserEmail = By.id("userEmail");
	public  By Male_Gender = By.xpath("//label[@for='gender-radio-1']");
	public  By Female_Gender = By.xpath("//label[@for='gender-radio-2']");
	public  By Other_Gender = By.xpath("//label[@for='gender-radio-3']");
	public  By UserNumber = By.id("userNumber");
	public  By DOB = By.id("dateOfBirthInput");
	public  By Calendar = By.xpath("//div[@class='react-datepicker__month-container']/child::div[1]/child::div[2]/div/select");
    public  By Date = By.xpath("//div[text()='23']");
    public  By Month = By.xpath("//select[@class='react-datepicker__month-select']");
    public  By Year = By.xpath("//select[@class='react-datepicker__year-select']");
	public  By Subject_Search = By.id("subjectsInput");
	public  By Sports_Hobby = By.xpath("//label[@for='hobbies-checkbox-1']");
	public  By Reading_Hobby = By.xpath("//label[@for='hobbies-checkbox-2']");
	public  By Music_Hobby = By.xpath("//label[@for='hobbies-checkbox-3']");
	public  By Select_Picture = By.xpath("//label[@for='uploadPicture']");
	public  By ChooseFile = By.id("uploadPicture");
	
	//currentaddress already declared
	
	public  By Select_State = By.id("react-select-3-input");
	public  By Select_City = By.id("react-select-4-input");
	public  By ProfileForm_Submit = By.xpath("//button[text()='Submit']");
	public  By ProfileForm_Close = By.xpath("//button[text()='Close']");
		
//*************************************************Book Store Application*****************************************************************	
	public  By BookStoreApplications = By.xpath("//div[@class='card-body']//h5[text()='Book Store Application']");
	
	//=======Login======
	public  By Login_Form = By.xpath("//span[text()='Login']");
	public  By Login_Button = By.xpath("//button[text()='Login']");
	public  By UserName= By.id("userName");
	public  By Password = By.id("password");
	public  By Login_Submit = By.xpath("//button[text()='Login']");
	public  By BookName = By.id("see-book-Git Pocket Guide");
	public  By AddCollection = By.xpath("//button[text()='Add To Your Collection']");
	public  By Search_book = By.id("searchBox");
    public  By Goto_BookStore = By.xpath("//button[text()='Go To Book Store']");
    public  By Delete_Allbooks = By.xpath("//button[text()='Delete All Books']");
    public  By Delete_Confirm = By.id("closeSmallModal-ok");
    
   
	
	//public	By Delete_Allbooks = By.id("submit");
	public  By Delete_Account = By.xpath("//button[text()='Delete Account']");
	public  By Loggedin_Profile = By.xpath("//a[contains(text(),'profile')]");
	public  By Logout = By.id("submit");

	//=======Profile======
	public  By Profile = By.xpath("//span[text()='Profile']");
	public  By login_link = By.xpath("//a[contains(@href, 'login')]");
	public  By register_link = By.xpath("//a[contains(@href, 'register')]");
	
	//=======Book Store======
	public  By Book_Store = By.xpath("//span[text()='Book Store']");
	public  By Book1 = By.xpath("//a[text()='Git Pocket Guide']");
	public  By BacktoBookStore = By.xpath("//button[text()='Back To Book Store']");	
}

