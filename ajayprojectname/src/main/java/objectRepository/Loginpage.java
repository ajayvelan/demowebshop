package objectRepository;

import org.testng.Reporter;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class Loginpage extends BaseClass{
	 @Test
	 public void verifyBookpage_001() {
		 Homepage homepage=new Homepage(driver);
		 Bookpage bookpage=new Bookpage(driver);
		 Reporter.log("verify booksnpageis displayed",true);
		 //click on book link
		 homepage.getBookLink().click();
		 test.log(LogStatus.INFO,"Clicked on books link");
		 String pageHeadink
	 }

}
