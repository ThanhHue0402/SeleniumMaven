package automation.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPageAlada_HomeWorkDay14 {
	private WebDriver driver;
	
	@FindBy(name = "txtFirstname")WebElement textName;
	@FindBy(name = "txtEmail")WebElement textEmail;
	@FindBy(name = "txtCEmail")WebElement textCEmail;
	@FindBy(name = "txtPassword")WebElement textPassword;
	@FindBy(name = "txtCPassword")WebElement textCPassword;
	@FindBy(name = "txtPhone")WebElement textPhone;
	@FindBy(name = "chkRight")WebElement chkRight;
	@FindBy(xpath = "//button[@class='btn_pink_sm fs16']")WebElement btnDangKy;
	
	// Login 
	@FindBy(name ="txtLoginUsername") WebElement txtEmail;
	@FindBy(name ="txtLoginPassword") WebElement txtPassword;
	@FindBy(xpath = "//button[@type='submit' and text()='ĐĂNG NHẬP']") WebElement btnDangNhap;
	
	
	//update Profile 
	@FindBy(xpath = "//div[@class='avatar2']") WebElement avatar ;
	@FindBy(xpath = "//a[text()='Chỉnh sửa thông tin' and @ class='fs14']") WebElement chinhSua;
	@FindBy(name ="txtpassword") WebElement txtOldtPassword;
	@FindBy(name ="txtnewpass") WebElement txtNewPassworld;
	@FindBy(name ="txtrenewpass") WebElement txtreNewpassworld;
	@FindBy(xpath = "//button[text()='Lưu mật khẩu mới']") WebElement btnLuuMk;
	
	
	
	
	public LoginPageAlada_HomeWorkDay14(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public void registerAlada(String hoVaTen, String email, String nhapLaiEmail, String password, String nhapLaiPassword,String phone) {
//		btnLogin.click();
		WebElement dangKy = driver.findElement(By.partialLinkText("Đăng Ký"));
		dangKy.click();
		textName.sendKeys(hoVaTen);
		textEmail.sendKeys(email);
		textCEmail.sendKeys(nhapLaiEmail);
		textPassword.sendKeys(password);
		textCPassword.sendKeys(nhapLaiPassword);
		textPhone.sendKeys(phone);
		chkRight.click();
		btnDangKy.click();
	}
	
	public void Login(String email, String password) {
		WebElement dangNhap = driver.findElement(By.partialLinkText("Đăng Nhập"));
		dangNhap.click();
		txtEmail.sendKeys(email);
		txtPassword.sendKeys(password);
		btnDangNhap.click();
	}
	
	public void updateProfile(String oldPass, String newPass, String reNewPass) {
		avatar.click();
		chinhSua.click();
		txtOldtPassword.sendKeys(oldPass);
		txtNewPassworld.sendKeys(newPass);
		txtreNewpassworld.sendKeys(reNewPass);
		btnLuuMk.click();
		
	}

}
