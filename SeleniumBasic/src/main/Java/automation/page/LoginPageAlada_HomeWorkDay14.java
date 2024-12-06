package automation.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPageAlada_HomeWorkDay14 {
    private WebDriver driver;


    @FindBy(xpath = "//a[text()='Đăng Ký' and @class='btn-anis-effect']")
    WebElement bttnLogin;
    @FindBy(name = "txtFirstnametxtFirstname")
    WebElement textName;
    @FindBy(name = "txtEmail")
    WebElement textEmail;
    @FindBy(name = "txtCEmail")
    WebElement textCEmail;
    @FindBy(name = "txtPassword")
    WebElement textPassword;
    @FindBy(name = "txtCPassword")
    WebElement textCPassword;
    @FindBy(name = "txtPhone")
    WebElement textPhone;
    @FindBy(name = "chkRight")
    WebElement chkRight;
    @FindBy(xpath = "//button[@class='btn_pink_sm fs16']")
    WebElement btnDangKy;

    public void LoginAlada(String hoVaTen, String email,String nhapLaiEmail, String password, String nhapLaiPassword, String phone) {
    bttnLogin.click();
    textName.sendKeys(hoVaTen);
    textEmail.sendKeys(email);
    textCEmail.sendKeys(nhapLaiEmail);
    textPassword.sendKeys(password);
    textCPassword.sendKeys(nhapLaiPassword);
    textPhone.sendKeys(phone);
    chkRight.click();
    bttnLogin.click();
    }

    public LoginPageAlada_HomeWorkDay14(WebDriver driver) {
        this.driver = driver;
    }
}
