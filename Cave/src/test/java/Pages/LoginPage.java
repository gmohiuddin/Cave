package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import Commons.BasePage;
import Commons.UserType;
import Model.UserCredential;

@SuppressWarnings("unused")
public class LoginPage extends BasePage{
	
	public UserType userType = UserType.User1;
//	public UserCredential UserInfo = new UserCredential();

	public LoginPage(WebDriver driver) {
		_driver = driver;
	}
	
	@Override
	public boolean Test() throws InterruptedException {

		_driver.navigate().to("http://www.zoopla.co.uk/");
		_driver.findElement(By.xpath("//a[contains(., 'Sign in')]")).click();
		
		return true;
	}

	
	
	// ----- //input[@id='signin_email']
	// -----//input[@id='signin_password']
	//------//button[@id='signin_submit']
	//------//a[@class='button button--tertiary-dark account-link__text'] -- OR--  //a[contains(., 'Sign in')]
	
	
}
