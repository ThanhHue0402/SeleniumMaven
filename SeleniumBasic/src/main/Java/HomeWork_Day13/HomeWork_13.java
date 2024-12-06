package HomeWork_Day13;

import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.*;

import automation.common.CommonBase;
import automation.constant.CT_Account;
import automation.constant.CT_PageURL_java;
//import bsh.Primitive;

public class HomeWork_13 extends CommonBase {
	@BeforeMethod
	public void openWebPage() {
		driver = initFireFoxDriver(CT_PageURL_java.crmCodeStar);

	}

	@Test(priority = 1)
	public void loginSuccessfully() throws InterruptedException {
		Login login = new Login(driver);
		login.LoginFunction("admin@gmail.com", "12345678");
		Thread.sleep(5000);
		assertTrue(driver.findElement(By.xpath("//a[@id='dropdownMenuLink']")).isDisplayed());
	}

	@Test(priority = 2)
	public void LoginFailEmail() throws InterruptedException {

		Login login = new Login(driver);
		login.LoginFunction("hue123@gmail.com", "12345678");
		Thread.sleep(5000);
		assertTrue(driver.findElement(By.xpath("//span[@class='fl-message']")).isDisplayed());

	}

	@Test(priority = 3)
	public void LoginFailPass() throws InterruptedException {
		Login login = new Login(driver);
		login.LoginFunction("admin@gmail.com", "12345666");
		Thread.sleep(5000);
		assertTrue(driver.findElement(By.xpath("//span[@class='fl-message']")).isDisplayed());
	}

	@Test(priority = 4)
	public void LoginFail() throws InterruptedException {
		Login login = new Login(driver);
		login.LoginFunction("hue123@gmail.com", "12345666");
		Thread.sleep(5000);
		assertTrue(driver.findElement(By.xpath("//span[@class='fl-message']")).isDisplayed());
	}

	@Test(priority = 5)
	public void Logout() throws InterruptedException {
		Login login = new Login(driver);
		login.LoginFunction("admin@gmail.com", "12345678");
		Thread.sleep(10000);
		login.LogoutFunction();
		Thread.sleep(5000);
		assertTrue(driver.findElement(By.xpath("//div[@class='login_oueter']")).isDisplayed());
		
	}

	public class Login {
		private WebDriver driver;

		public Login(WebDriver driver) {
			super();
			this.driver = driver;
		}

		public void LoginFunction(String email, String pass) {
			WebElement textEmail = driver.findElement(CT_Account.inputEmail);
			if (textEmail.isDisplayed()) {
				textEmail.sendKeys(email);
			}
			WebElement textPass = driver.findElement(CT_Account.inputPass);
			if (textPass.isDisplayed()) {
				textPass.sendKeys(pass);
			}

			WebElement buttonLogin = driver.findElement(CT_Account.BUTTON_LOGIN);
			if (buttonLogin.isDisplayed()) {
				buttonLogin.click();
			}
		}

		public void LogoutFunction() {
			WebElement navigationclick = driver.findElement(By.xpath("//a[@id='dropdownMenuLink']"));
			navigationclick.click();
			WebElement buttonLogout = driver.findElement(CT_Account.BUTTON_LOGOUT);
			WebElement bttnLogoutSuccess = driver.findElement(By.xpath("//button[@class= 'btn btn-success' and @form='logout']"));
			if (buttonLogout.isEnabled() && buttonLogout.isDisplayed()) {
				buttonLogout.click();
				bttnLogoutSuccess.click();
				
			}
			

		}

	}

}
