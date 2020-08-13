package com.maveric.scuba.utils;

import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import com.maveric.core.driver.Driver;
import com.maveric.core.utils.web.WebActions;
import com.maveric.scuba.pageobjects.demoqa.Demoqa_Objects;

public class Scubautils extends WebActions{
	
//	public  WebDriver driver;
	public  WebElement loc;
	public  WebElement ele;
	Demoqa_Objects Page = new Demoqa_Objects();
//	WebDriverWait wait = new WebDriverWait(driver, 60);
	
	public void driverinit()
	{
		driver = Driver.getWebDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		logScreenshot("Browser Is Opened");
	}
	
	public  void urllaunch(String url)
	{
//		WebDriver driver = Driver.getWebDriver();
		driver.get(url);
		logScreenshot("Url Is Launched");
	}
	
	public  void send(By loc, String value )
	{
		try
		{
//			wait.until(ExpectedConditions.visibilityOf((WebElement) loc ));
			WebElement ele = driver.findElement(loc);
			ele.clear();
			ele.sendKeys(value);
		}
		catch (Exception e) {
	// TODO: handle exception
			String exception = e.getMessage();
			System.out.println(exception);
		}
	}
	
	
	public  void Btnclick(By loc)
	{
		try
		{
//			wait.until(ExpectedConditions.visibilityOfElementLocated(loc));
			WebElement ele = driver.findElement(loc);
			ele.click();
		}
		catch (Exception e) {
	// TODO: handle exception
//			JavascriptExecutor js = (JavascriptExecutor)driver;
//            js.executeScript("arguments[0].click();",ele );
			String exception = e.getMessage();
			System.out.println(exception);
			WebElement element = driver.findElement(loc);
            Actions actions = new Actions(driver);
            actions.moveToElement(element).click().perform();
		}
	}
	
	public  void linkclick(By loc)
	{
		try
		{
//			wait.until(ExpectedConditions.elementToBeSelected(loc));
			WebElement ele = driver.findElement(loc);
			if (!ele.isSelected()) {
				ele.click();
			}
		}
		catch (Exception e) {
	// TODO: handle exception
			String exception = e.getMessage();
			System.out.println(exception);
		}
	}
	
	public  void dropdownselectval(By loc, String value)
	{
		try
		{
			Select dropdown = new Select(driver.findElement(loc));
			dropdown.selectByValue(value);
			}
		catch (Exception e) {
	// TODO: handle exception
			String exception = e.getMessage();
			System.out.println(exception);
		}
	}
	
	public  void dropdownselectind(By loc, int index)
	{
		try
		{
			Select dropdown = new Select(driver.findElement(loc));
			dropdown.selectByIndex(index);
			}
		catch (Exception e) {
	// TODO: handle exception
			String exception = e.getMessage();
			System.out.println(exception);
		}
	}
	
	public  void dropdownselecttxt(By loc, String value)
	{
		try
		{
			Select dropdown = new Select(driver.findElement(loc));
			dropdown.selectByVisibleText(value);
			}
		catch (Exception e) {
	// TODO: handle exception
			String exception = e.getMessage();
			System.out.println(exception);
		}
	}
	
	public  void datePicker(By objlocator, int Index, By Date, String Year )
	{
		driver.findElement(objlocator).click();
		Select Month_dropdown = new Select(driver.findElement(Page.Month));
		Month_dropdown.selectByIndex(Index);
		Select Year_dropdown = new Select(driver.findElement(Page.Year));
		Year_dropdown.selectByValue(Year);
		driver.findElement(Date).click();
	}
	
	public  void sendDate(By loc, String message)
	{
		Actions action = new Actions(driver);
		WebElement textbox = driver.findElement(loc);
		textbox.clear();
		action.moveToElement(textbox).click(textbox).sendKeys(message).build().perform();		
	}
	
	public  void autofill(By loc, String text)
	{
		WebElement autoOptions= driver.findElement(loc);
	    autoOptions.sendKeys("En");

	    List<WebElement> optionsToSelect = driver.findElements(By.tagName("li"));

	    for(WebElement option : optionsToSelect){
	        System.out.println(option);
	        if(option.getText().equals(text)) {
	            System.out.println("Trying to select: "+text);
	            option.click();
	            break;
	        }
	}
} 
	
	public  void UploadFile(By loc)
	{
		
		String path = System.getProperty("user.dir");
        System.out.println(path);
		driver.findElement(loc).sendKeys(path+"\\UploadaFile\\Group6.png");
		// click the "UploadFile" button
		//driver.findElement(By.name("send")).click();
	}
	
	public  void pgdwn()
	{
		Actions act = new Actions(driver);
		act.sendKeys(Keys.PAGE_DOWN).build().perform();
		
	}
	
	public  void tabkey()
	{
		Actions act = new Actions(driver);
		act.sendKeys(Keys.TAB).perform();
	}
	
	public  void alertok()
	{
		driver.switchTo().alert().accept();
	}

	public  void driverquit() {
		// TODO Auto-generated method stub
		
		driver.close();
		driver.quit();
	}
}
