package TestScript;
import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class ReportJava {
	ExtentReports report=new ExtentReports("./Report/report.html");
	ExtentTest test=report.startTest("LoginTest");
	@Test
	public void reportTest() {
		WebDriver driver=new ChromeDriver();
		test.log(LogStatus.INFO, "Chrome Browser open");
		driver.manage().window().maximize();
		test.log(LogStatus.INFO, "Chrome browser maximized");
		driver.get("https://demowebshop.tricentis.com/desktops");
		
		
	}

}
