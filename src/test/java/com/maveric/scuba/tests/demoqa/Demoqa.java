package com.maveric.scuba.tests.demoqa;

import org.testng.annotations.Test;

import com.maveric.core.testng.BaseTest;
import com.maveric.scuba.pageobjects.demoqa.Demoqa_Objects;
import com.maveric.scuba.utils.Scubautils;


public class Demoqa extends BaseTest {
	
	Scubautils Utils = new Scubautils();
	Demoqa_Objects Page = new Demoqa_Objects();
			
	@Test (priority = 1)
	public void ProfileForm() throws InterruptedException {
		Utils.driverinit();
		Utils.urllaunch("https://demoqa.com/");
		Utils.Btnclick(Page.form);
		Utils.Btnclick(Page.Practice_Form);
		Utils.logScreenshot("Form Is Launched");
		Utils.send(Page.FirstName, "John Pragadeesh");
		Utils.send(Page.LastName, "Kiru Prathachala");
		Utils.send(Page.UserEmail, "johnpraga@gmail.com");
		Utils.Btnclick(Page.Male_Gender);
		Utils.send(Page.UserNumber, "9600091763");
		Utils.datePicker(Page.DOB, 3, Page.Date, "1994");
		Utils.send(Page.Subject_Search,"English");
		Utils.tabkey();		
		Utils.Btnclick(Page.Music_Hobby);
		Utils.Btnclick(Page.Reading_Hobby);
		Utils.Btnclick(Page.Sports_Hobby);
		//Utils.UploadFile(Page.ChooseFile);
		Utils.send(Page.TextBox_CurrentAddress, "ABC");
		Utils.send(Page.Select_State,"Rajasthan");
		Utils.tabkey();
		Utils.send(Page.Select_City,"Jaipur");
		Utils.tabkey();
		Utils.pgdwn();
		Thread.sleep(5000);
		Utils.logScreenshot("Form Details are entered");
		Utils.Btnclick(Page.ProfileForm_Submit);
		Thread.sleep(5000);
		Utils.logScreenshot("Form Submit Details are Captured");
		Utils.Btnclick(Page.ProfileForm_Close);
		Utils.driverquit();
	}
	
//@Test(priority = 2)
public void BookStore() throws InterruptedException
{
	Utils.driverinit();
	Utils.urllaunch("https://demoqa.com/");
	Thread.sleep(5000);
	Utils.logScreenshot("Form Is Launched");
	Utils.pgdwn();
	Utils.Btnclick(Page.BookStoreApplications);
	Utils.logScreenshot("BookStoreApplications Is Launched");
	Utils.Btnclick(Page.Login_Form);
	Utils.Btnclick(Page.Login_Button);
	Utils.send(Page.UserName, "JohnPragadeesh");
	Utils.send(Page.Password, "Maveric@456");
	Utils.logScreenshot("BookStoreApplications Details are Entered");
	Utils.Btnclick(Page.Login_Submit);
	Thread.sleep(5000);
	Utils.pgdwn();
	Utils.Btnclick(Page.Goto_BookStore);
	Utils.Btnclick(Page.BookName);
	Utils.Btnclick(Page.AddCollection);
	Utils.logScreenshot("BookStoreCollections Details are Entered");
	Thread.sleep(5000);
	Utils.alertok();
	Utils.pgdwn();
	Utils.Btnclick(Page.Profile);
	Utils.Btnclick(Page.Delete_Allbooks);
	Utils.Btnclick(Page.Delete_Confirm);
	Utils.logScreenshot("Delete will happen");
	Thread.sleep(2000);
	Utils.alertok();
	Utils.Btnclick(Page.Logout);
	Utils.driverquit();
}
}
