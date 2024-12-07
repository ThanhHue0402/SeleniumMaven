package automation.testsuite;

import automation.common.CommonBase;
import automation.constant.CT_PageURL_java;
import automation.page.LoginPageAlada_HomeWorkDay14;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LoginAladaTest_HomeWorkDay14 extends CommonBase {
	@BeforeMethod
	public void beforeMethod() {
		driver = initFireFoxDriver(CT_PageURL_java.alada);
		LoginPageAlada_HomeWorkDay14 login = new LoginPageAlada_HomeWorkDay14(driver);
		login.Login("toan@gmail.com", "toan123");
		
	}

	@Test(priority = 1)
	public void Register() throws InterruptedException {
		LoginPageAlada_HomeWorkDay14 register = new LoginPageAlada_HomeWorkDay14(driver);
		register.registerAlada("Bảo Toàn", "toan@gmail.com", "toan@gmail.com", "toan12345", "toan12345", "0947877723");
		Thread.sleep(5000);

	}

	//Update mật khẩu và lưu mật khẩu 
	@Test(priority = 2)
	public void updateProfile () throws InterruptedException {
		LoginPageAlada_HomeWorkDay14 update = new LoginPageAlada_HomeWorkDay14(driver);
		update.updateProfile("toan123", "hue123", "hue123");
		Thread.sleep(5000);

	}
	
	@Test(priority = 3)
	public void Login() {
		LoginPageAlada_HomeWorkDay14 login = new LoginPageAlada_HomeWorkDay14(driver);
		login.Login("toan@gmail.com", "hue123");
		assertTrue(driver.findElement(By.xpath("//a[@class='fleft martop20 khct']")).isDisplayed());
	}
	
}
