package automation.page;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Factory;

public class Tedu_CapNhatMatKhau_Page {
	private WebDriver driver;
	@FindBy(xpath="//a[@title='Đăng nhập']") WebElement buttonDangNhap;
	@FindBy(id="UserName") WebElement textUserName;
	@FindBy(id="Password") WebElement textPassword;
	@FindBy(xpath="//button[text()='Đăng nhập']") WebElement btnDangNhap;
	@FindBy(id="onesignal-slidedown-cancel-button") WebElement btnLater;
	@FindBy(xpath = "//a[@title='Tài khoản' and @data-toggle='dropdown']") WebElement btnAvatar ;
	@FindBy(xpath = "//a[@title= 'Đổi mật khẩu']") WebElement btnDoiMatKhau;
	@FindBy(id="OldPassword") WebElement textOlPass;
	@FindBy(id="NewPassword") WebElement textNewPass;
	@FindBy(id="ConfirmNewPassword") WebElement textConfirPass;
	@FindBy(xpath = "//input[@value='Cập nhật']") WebElement btnCapNhap ;
	@FindBy(xpath = "//button[@class='button-search btn btn-primary']") WebElement btnSearch;
	@FindBy(xpath = "//input[@class='autosearch-input form-control']") WebElement textKeySearch;
	@FindBy(xpath = "//a[@class='clearfix' and @title='Khóa học']") WebElement khoahoc;
	
	public Tedu_CapNhatMatKhau_Page(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);

	}
	
	public void DangNhap(String email, String password) {
//		JavascriptExecutor js= (JavascriptExecutor) driver;
//		js.executeScript("arguments[0].click();", buttonDangNhap);
		
		buttonDangNhap.click(); // Chỉ dùng sau khi CloseNotification vì có exception xảy ra: ElementNotInteractableException:
		//Element abc could not be clickable beacuse intercepted
		textUserName.sendKeys(email);
		textPassword.sendKeys(password);
		btnDangNhap.click();
	}
	public void CloseNotification() {
		btnLater.click();
	}
	
	public void CapnhatMatKhau(String OldPass, String newPass) {
		btnAvatar.click();
		btnDoiMatKhau.click();
		textOlPass.sendKeys(OldPass);
		textNewPass.sendKeys(newPass);
		textConfirPass.sendKeys(newPass);
		btnCapNhap.click();
	}
	
	public void Search(String keySerach) {
		khoahoc.click();
		textKeySearch.sendKeys(keySerach);
		btnSearch.click();
	}
	
}
