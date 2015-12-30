package week1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class OptionHomeWork1 {

	public static void main(String[] args) throws InterruptedException{
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Admin\\MyWorkspace\\SeleniumWebDriver\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/dynamic_controls");
		
		Thread.sleep(10000);
		Select chkbox = new Select(driver.findElement(By.id("checkbox")));
		chkbox.selectByIndex(0);
		driver.findElementById("btn").click();
		
		if((driver.findElementById("checkbox")).isDisplayed())
		{
		System.out.println("chk box exists");
		}
		else
		{
			System.out.println("chk box closed");
		}
		}
	}



