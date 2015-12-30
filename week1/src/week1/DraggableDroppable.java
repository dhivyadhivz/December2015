package week1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DraggableDroppable {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\MyWorkspace\\SeleniumWebDriver\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://www.jqueryui.com");
		Thread.sleep(10000);
		driver.findElementByLinkText("Draggable").click();
		WebElement Cname = driver.findElement(By.className("demo-frame"));
		driver.switchTo().frame(Cname);   	 
		String text = driver.findElement(By.xpath(".//*[@id='draggable']/p")).getText();
		System.out.println(text);
		driver.switchTo().defaultContent();
		driver.findElementByLinkText("Droppable").click();
			
			}
}


