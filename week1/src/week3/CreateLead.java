package week3;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class CreateLead {
  @Test
  public void f() throws InterruptedException {
	  System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Admin\\MyWorkspace\\SeleniumWebDriver\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://demo1.opentaps.org");
		driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.xpath("//*[@id='button']/a/img")).click();
		
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("ABC1");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("FNAME");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("LNAME");
		driver.findElement(By.className("smallSubmit")).click();
		Thread.sleep(10000);
		driver.findElement(By.linkText("Logout")).click();
  }
}
