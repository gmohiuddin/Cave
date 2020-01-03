package Commons;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public abstract class Browser {
	
	public abstract WebDriver OpenBrowser();
	public abstract void CloseBrowser();
	
	public static class ChromeBrowser extends Browser
	{
		@Override
		public WebDriver OpenBrowser() {
			
			System.setProperty("webdriver.chrome.driver","C:/Selenium/Drivers/New/chromedriver.exe");
			return new ChromeDriver();
		}
		@Override
		public void CloseBrowser() {
			
		}
	}
	
	public static class IEBrowser extends Browser
	{
		@Override
		public WebDriver OpenBrowser() {
			
			System.setProperty("webdriver.ie.driver","C:/Selenium/Drivers/IEDriverServe.exe");
			return new InternetExplorerDriver();
		}
		@Override
		public void CloseBrowser() {
			
		}
	}
}
