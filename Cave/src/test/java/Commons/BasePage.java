package Commons;

import org.openqa.selenium.WebDriver;

public abstract class BasePage {
	
	protected WebDriver _driver;
	public abstract boolean Test() throws InterruptedException;

}
