package week4;

import org.openqa.selenium.Platform;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class FacebookLogin {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
//		RemoteWebDriver driver = new FirefoxDriver();
//		DesiredCapabilities dc = new DesiredCapabilities();
//		dc.setBrowserName("firefox");
//		dc.setPlatform(Platform.WINDOWS);
//		driver.get("http:\\www.facebook.com");
//		
		WrapperMethods wm = new WrapperMethods();
		wm.invokeApp("chrome", "http:\\www.facebook.com");
		wm.SelectByIndexById("day", 1);
		wm.enterById("email", "dhivyaable@gmail.com");
		wm.enterById("pass", "ghfgf");
		wm.getTextById("u_0_i");
		wm.clickById("u_0_v");
		wm.clickById("pageLoginAnchor");
		Thread.sleep(10000);
		wm.clickByLink("Log out");
		wm.CloseApp();
	} 
}


