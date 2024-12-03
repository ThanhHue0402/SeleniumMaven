package automation.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.devtools.v112.page.Page;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage_Day14 {
	private WebDriver driver;

	@FindBy(id = "email")WebElement textEmail;
	@FindBy(id = "password")WebElement textPassword;
	@FindBy(name = "signin")WebElement bttnDangNhap;

	public LoginPage_Day14(WebDriver driver) {
		super();
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public void LoginFunction(String email, String password) {
		textEmail.sendKeys(email);
		textPassword.sendKeys(password);
		bttnDangNhap.click();

	}
}
