package genericLibrary;

import org.testng.Reporter;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class BaseClass {
	public Webdriver driver;
	@BeforeSuite
	public void beforeSuit() {
	Reporter.log("Connect to database",true);
}
	@AfterSuite
	public void afterSuite() {
		Reporter.log("Close connections to database",true);
	}
	@BeforeTest
	public void beforeTest() {
		Reporter.log("Before test",true);
	}
	@AfterTest
	public void afterTest() {
		Reporter.log("After test",true);
	}
	@BeforeClass
	public void beforeClass() {
		Reporter.log("Before class",true);
		String browser=FileUtility
	}
	

}
