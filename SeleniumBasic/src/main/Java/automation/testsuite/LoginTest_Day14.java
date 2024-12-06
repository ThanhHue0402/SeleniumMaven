package automation.testsuite;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.testng.annotations.*;

import automation.common.CommonBase;
import automation.constant.CT_PageURL_java;
import automation.page.LoginPage_Day14;

public class LoginTest_Day14 extends CommonBase{
	@BeforeMethod
	public void OpenFireFox() {
		driver= initFireFoxDriver(CT_PageURL_java.crmCodeStar);
		
	}
	@Test(priority=1)
	public void LoginFail() throws InterruptedException {
		LoginPage_Day14  login = new LoginPage_Day14(driver);
		login.LoginFunction("admin@gmail.com","12345678");
		Thread.sleep(5000);
		assertTrue(driver.findElement(By.xpath("//p[text()='Quản lý người dùng']")).isDisplayed());
	}

}
