package automation.testsuite;

import static org.testng.Assert.assertTrue;

import java.util.Random;

import org.openqa.selenium.By;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import automation.common.CommonBase;
import automation.constant.CT_PageURL_java;
import automation.page.Tedu_CapNhatMatKhau_Page;

public class Tedu_CapNhatyMatKhauTest extends CommonBase{
	public Tedu_CapNhatMatKhau_Page teduPage;
	String currentPass="hue123";

	
	@BeforeMethod
	public void openChrome() {
	driver= initChromeDriver(CT_PageURL_java.tedu);
	teduPage= new Tedu_CapNhatMatKhau_Page(driver);
	
	}
	
	@Test(priority = 1)
	public void CapNhapMatKhauThanhCong() throws InterruptedException {
		Random rand= new Random();
		int value = rand.nextInt(50);
		String newPass= currentPass+value;
		System.out.println(newPass);
		
		DangNhapThanhCong();
		teduPage.CapnhatMatKhau(currentPass, newPass);
		assertTrue(driver.findElement(By.xpath("//div[text()='Đổi mật khẩu thành công. Mời bạn đăng nhập lại.']")).isDisplayed());
		currentPass= newPass;
		
	}

	@Test(priority = 2)
	public void DangNhapThanhCong() throws InterruptedException {
		Thread.sleep(3000);
		teduPage.CloseNotification();
		teduPage.DangNhap("dangthithanhhue723@gmail.com", currentPass);
		assertTrue(driver.findElement(By.xpath("//a[@title='Tài khoản' and @data-toggle='dropdown']")).isDisplayed());
	}
	
	@Test(priority = 3)
	public void SearchThanhCong() throws InterruptedException {
		DangNhapThanhCong();
		teduPage.Search("ASP Net");
		assertTrue(driver.findElement(By.linkText("Bài 52: Gửi phản hồi và gửi mail trong ASP NET sử dụng SMTP")).isDisplayed());
	}
	

}
