package Scenarios;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;
import org.apache.log4j.Level;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.test.utility.TestUtil;

import Commons.Browser.ChromeBrowser;
import Pages.LoginPage;

@SuppressWarnings("unused")
public class SmokeTest {
	
	private static final String Priority = null;
	WebDriver driver;
	protected static String ename, eid, email;
	public Logger logger; 
	
	@BeforeMethod
	public void setUp() {
		
		logger=Logger.getLogger("EmployeesRestAPI");//added Logger 
		PropertyConfigurator.configure("Log4j.properties"); //added logger 
		logger.setLevel(Level.DEBUG); 
		
		ChromeBrowser browser = new ChromeBrowser();
		driver = browser.OpenBrowser();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
	}
	
	@DataProvider
	public Iterator<Object[]> getTestData() {
		ArrayList<Object[]> testData = TestUtil.getDataFromExcel(); 
		return testData.iterator();
	}
	
	@Test(priority=1, dataProvider="getTestData") 
	public void searchEmp(String EmpName, String EmpId, String Email) throws InterruptedException{
		this.ename = EmpName;
		this.eid = EmpId;
		System.out.println("From search Emp: " +ename + "-----------"+ eid + "-----------"+ email);
	}
	
	@Test(priority=2, dataProvider="getTestData") 
	public void searchEmp2(String EmpName, String EmpId, String Email) throws InterruptedException{

		this.email = Email;
		System.out.println("From search Emp2: "+ email);
	}
	
	@Test(priority=3)
	public void openZoopla() throws InterruptedException{
		logger.info("******************* Checking response body ****************");
		LoginPage login = new LoginPage(driver);
        login.Test();   
	}
	
	@AfterClass
	void tearDown() {
		
		logger.info("******************* Finished TC001_GET_AllEmployees ****************");
	
	}
}
