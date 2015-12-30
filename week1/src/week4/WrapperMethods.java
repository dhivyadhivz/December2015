package week4;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.AccessDeniedException;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.Select;

public class WrapperMethods {
	RemoteWebDriver driver;
	int i=1;
	Boolean bval;
	Select dropdown;
	public void invokeApp(String browsername , String url){
		if(browsername.equalsIgnoreCase("firefox")) 
		{
			driver = new FirefoxDriver();
		}else{
			System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\MyWorkspace\\SeleniumWebDriver\\chromedriver_win32\\chromedriver.exe" );
			driver = new ChromeDriver();
		}
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get(url);
	}
	
	
	public void enterById(String id,String value )
	{
		try {
			driver.findElement(By.id(id)).clear();
			driver.findElement(By.id(id)).sendKeys(value);
		} catch(NoSuchElementException e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
			System.out.println("element "+id+"not found");
		}
		finally
		{
			takeSnapShot();
		}
	}
	public void clickById(String id)
	{
		try {
			driver.findElement(By.id(id)).click();
		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			System.out.println("element not found"+id+"not found");
			//e.printStackTrace();
		}
		finally
		{
			takeSnapShot();
		}
	}
	
	public void clickByLink(String linkText)
	{
		driver.findElement(By.linkText(linkText)).click();
	}
	public void CloseApp()
	{
		driver.close();
	}
	public void getTextById(String id)
	{
		String text = driver.findElement(By.id(id)).getText();
		System.out.println(text);
		
	}
	public void clickByClassName(String className)
	{
		driver.findElement(By.className(className));
	}
	public void takeSnapShot()
	{
		try {
			File snap = driver.getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(snap,new File("C:\\Users\\Admin\\MyWorkspace\\snap"+i+".JPEG"));
			i++;
		} catch (FileNotFoundException e) {
			
			// TODO Auto-generated catch block
			//e.printStackTrace();
			System.out.println("File is not found");	
		}	
		catch (AccessDeniedException e)
		{
			System.out.println("Folder is not accessible");	
		}
		catch(Exception e)
		{
			System.out.println("Path not found");
		}
	}
	
	public boolean isDisplayedById(String id)
	{
		 
		bval = driver.findElement(By.id(id)).isDisplayed();
		return true;
	}
	public void SelectByIndexById(String id,int index)
	{
		dropdown = new Select(driver.findElement(By.id(id)));
		dropdown.selectByIndex(index);
	}
	}

	
	

