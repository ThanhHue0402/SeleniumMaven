package automation.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class QuanLyNguoiDung_Page {
	private WebDriver driver;
	//FindBy
	@FindBy(xpath = "//button[text()='Thêm mới']") WebElement bttnThemMoi;
	@FindBy(name="username") WebElement textName;
	@FindBy(name="email") WebElement textEmail;
	@FindBy(name="phone_number") WebElement textPhoneNumber;
	@FindBy(name="department_id") WebElement dropdownPhongBan;
	@FindBy(name="role_id") WebElement dropdownChucDanh;
	@FindBy(name="workarea_id") WebElement dropdownKhuVuclamViec;
	@FindBy(name="code_user") WebElement textMaNguoiDung;
	@FindBy(xpath = "//button[text()='Lưu']") WebElement bttnluu;
	@FindBy(xpath = "//button[text()='Thêm' and @class='btn btn-success']") WebElement bttnXacNhan;

	public QuanLyNguoiDung_Page(WebDriver driver) {
		super();
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	//Thêm người dùng thất bại 
	public void ThemNguoiDung(String hoVaTen, String email, String sodienthoai, String phongban, String chucdanh, String khuVuclamViec, String maNguoiDung ) {
		bttnThemMoi.click();
		textName.sendKeys(hoVaTen);
		textEmail.sendKeys(email);
		textPhoneNumber.sendKeys(sodienthoai);
		Select selectPhongBan = new Select(dropdownPhongBan);
		selectPhongBan.selectByValue(phongban);
		Select selectChucDanh = new Select(dropdownChucDanh);
		selectChucDanh.selectByValue(chucdanh);
		Select selectKhuVucLamViec = new Select(dropdownKhuVuclamViec);
		selectKhuVucLamViec.selectByValue(chucdanh);
		textMaNguoiDung.sendKeys(maNguoiDung);
		bttnluu.click();
		bttnXacNhan.click();


		
	}

	//BTVN: cas2 - Xóa người dùng sau khi thêm 


	
}
