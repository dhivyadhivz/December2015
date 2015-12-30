package week1;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class OptionHomework2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Admin\\MyWorkspace\\SeleniumWebDriver\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		Thread.sleep(10000);
		driver.findElement(By.xpath("//*[@id='content']/div/ul/li[1]/button")).click();
		Alert a = driver.switchTo().alert();
		System.out.println(a.getText());
		a.accept();
		
		driver.findElement(By.xpath("//*[@id='content']/div/ul/li[2]/button")).click();
		Alert b = driver.switchTo().alert();
		a.dismiss();
		WebElement result = driver.findElement(By.id("result"));
		String res = result.getText();
		if(res.contains("You clicked: Cancel"))
		{
			System.out.println("success");
		}
		else
		{
			System.out.println("fail");
		}
		
		driver.findElement(By.xpath("//*[@id='content']/div/ul/li[3]/button")).click();
		Alert c = driver.switchTo().alert();
		c.sendKeys("Hello");
		c.accept();
		WebElement res1 = driver.findElement(By.id("result"));
		String ress = result.getText();
		if(ress.contains("You entered: Hello"))
		{
			System.out.println("success");
		}
		else
		{
			System.out.println("fail");
		}
		}
				
	}



