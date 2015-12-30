package week3;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Admin\\MyWorkspace\\SeleniumWebDriver\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://amazon.in");
		Thread.sleep(20000);
		
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Books");
		driver.findElement(By.className("nav-input")).click();
		Thread.sleep(20000);
		
		driver.findElement(By.xpath("//a[@title='Indian Tales']/h2")).click();
		
		//"//*[@id="result_1"]/div/div/div/div[2]/div[1]/a/h2"
	}
}


