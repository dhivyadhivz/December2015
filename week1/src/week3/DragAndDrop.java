package week3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Admin\\MyWorkspace\\SeleniumWebDriver\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://jqueryui.com/sortable");
		Thread.sleep(10000);
		WebElement fname = driver.findElement(By.className("demo-frame"));
		driver.switchTo().frame(fname);
		
		WebElement btn1 = driver.findElement(By.xpath("//*[@id='sortable']/li[1]"));
		WebElement btn5 = driver.findElement(By.xpath("//*[@id='sortable']/li[5]"));
		
		System.out.println(btn1.getLocation());
		System.out.println(btn5.getLocation());
		Actions builder = new Actions(driver);
		builder.dragAndDropBy(btn1, 8, 144).build().perform();
		
	}
}

