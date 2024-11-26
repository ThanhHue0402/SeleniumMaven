package automation.constant;

import org.openqa.selenium.By;

public class CT_Account {
	// Chứa các locator của element trên toàn bộ các trang cần test
	// Nếu locator bị thay đổi, tester vào class này để thay đổi giá trị XpPath

//	public static By TEXTEmail=By.id("txtLoginUsername");
//	public static By TEXT_PASSWORD=By.id("txtLoginPassword");
//	public static By BUTTON_LOGIN= By.xpath("//button[text()='ĐĂNG NHẬP' and contains(@class,'btn_submit')]");
	
	
	
	public static By inputEmail = By.id("email");
	public static By inputPass= By.id("password");
	public static By BUTTON_LOGIN = By.xpath("//button[@name='signin']");
	public static By BUTTON_LOGOUT = By.xpath("//button[@class='dropdown-item']");
	
	
	
	
}
