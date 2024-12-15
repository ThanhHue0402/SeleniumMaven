package automation.testsuite;

import org.openqa.selenium.By;
import org.testng.annotations.*;
import automation.common.CommonBase;
import automation.constant.CT_PageURL_java;

public class DienMayNhapKhau extends CommonBase{
	@BeforeMethod
	@Parameters("browser")
	public void openBrowser(String browserName) {
		setupDriver(browserName);
		driver.get(CT_PageURL_java.DIENMAY);
		
	}
	@Test
	public void zaloChat() {
		click(By.id("zalo-vr"));
	}

}
