package automation.testsuite;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import java.util.Set;

import org.openqa.selenium.By;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import automation.common.CommonBase;
import automation.constant.CT_PageURL_java;

public class Day17_WindowsPopUp extends CommonBase {
	@BeforeMethod
	@Parameters("browser")
	public void openBrowser(String browserName) {
		setupDriver(browserName);
		driver.get(CT_PageURL_java.BEPANTOAN);
		
	}

	@Test
	public void handleWindows() {
		String mainWindow = null;
		if (isElementPresent(By.xpath("(//span[text()='Chat với chúng tôi'])[1]"))) {
			mainWindow = driver.getWindowHandle();
			click(By.xpath("(//span[text()='Chat với chúng tôi'])[1]"));
		}
		Set<String> listWindows = driver.getWindowHandles();
		// Chuyển qua từng window mà không phải là window chính
		for (String window : listWindows) {
			if (!window.equals(mainWindow)) {
				driver.switchTo().window(window);
				if (isElementPresent(By.name("email"))) {
					assertEquals(driver.getTitle(), "Messenger");

				}
				type(By.name("email"), "test@gmail.com");
				type(By.name("pass"), "12345");
				click(By.name("login"));
				assertTrue(isElementPresent(By.xpath("//div[contains(text(),'this feature at the moment')]")));
				driver.close();

			}
		}
		driver.switchTo().window(mainWindow);
		System.out.println(" Đã chuyển qua main window thành công");
	}
}