package automation.testsuite;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import automation.common.CommonBase;
import automation.constant.CT_PageURL_java;

public class Day17_iFrame extends CommonBase {
	@BeforeMethod
	@Parameters("browser")
	public void openBrowser(String browserName) {
//	driver = initChromeDriver(CT_PageURL_java.GURUWINDOWS);
		setupDriver(browserName);
		driver.get(CT_PageURL_java.GURUWINDOWS);
	}

	@Test
	public void dangkyNhanTuVanLoTrinh_ThatBai_ThieuEmail() {
		scrollToElement(By.xpath("//h2[contains(text(),'AWS/Kiểm thử/Lập trình web')]"));
		driver.switchTo().frame(1);
		type(By.id("name"), "autotest user");
		type(By.id("phone_number"), "123456");
		click(By.xpath("//button[normalize-space()='Gửi ngay']"));
		assertTrue(isElementPresent(By.xpath("//button[normalize-space()='Gửi ngay']")));

	}
}
