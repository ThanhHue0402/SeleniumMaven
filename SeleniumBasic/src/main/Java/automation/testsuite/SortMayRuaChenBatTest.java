package automation.testsuite;

import org.testng.annotations.BeforeClass;

import static org.testng.Assert.assertTrue;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.*;

import automation.common.CommonBase;
import automation.constant.CT_PageURL_java;
import automation.page.MayRuaChenBat_Page;

public class SortMayRuaChenBatTest extends CommonBase {
	@BeforeMethod
	public void OpenFireFox() {
		driver = initFireFoxDriver(CT_PageURL_java.BEPANTOAN);

	}

	@Test
	public void SortHang() throws InterruptedException {
		MayRuaChenBat_Page sortHang = new MayRuaChenBat_Page(driver);
		sortHang.sortHang();
		
		List<WebElement> ptoductList = driver.findElements(By.xpath("//div[@class='flex flex-wrap product-list']"));

		System.out.println(ptoductList.size());

		for (WebElement item : ptoductList) {
			WebElement productName = item.findElement(By.cssSelector("h4.title-card"));
			String itemName = productName.getText();
			System.out.println(itemName);
			assertTrue(itemName.toLowerCase().contains("bosch"));	

		}
	}

}
