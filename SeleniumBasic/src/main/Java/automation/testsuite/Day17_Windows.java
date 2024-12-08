package automation.testsuite;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import java.awt.Window;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementClickInterceptedException;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import automation.common.CommonBase;
import automation.constant.CT_PageURL_java;

public class Day17_Windows extends CommonBase {
	@BeforeMethod
	public void openBrowser() {
		driver = initChromeDriver(CT_PageURL_java.GURUWINDOWS);
	}

	@Test
	public void handleWindows() {
		String mainWindow = null;
		if (isElementPresent(By.xpath("//a[text()='Click Here']"))) {
			 mainWindow = driver.getWindowHandle();
			click(By.xpath("//a[text()='Click Here']"));
		}
		// lấy hết các windows 
		Set<String> listWindows = driver.getWindowHandles();
		// Chuyển qua từng window mà không phải là window chính 
		for(String window: listWindows) {
			if(!window.equals(mainWindow)) {
				driver.switchTo().window(window);
				if(isElementPresent(By.name("emailid"))) {
					assertEquals(driver.getCurrentUrl(),"https://demo.guru99.com/articles_popup.php");

				}
				type(By.name("emailid"),"test@gmail.com");
				click(By.name("btnLogin"));
				assertTrue(isElementPresent(By.xpath("//h2[text()='Access details to demo site.']")));
				driver.close();
				
			}
		}
		driver.switchTo().window(mainWindow);
		System.out.println(" Đã chuyển qua main window thành công");
	}
}
