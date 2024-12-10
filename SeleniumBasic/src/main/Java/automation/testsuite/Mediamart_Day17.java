package automation.testsuite;

import static org.testng.Assert.assertTrue;

import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.*;

import automation.common.CommonBase;
import automation.constant.CT_PageURL_java;

public class Mediamart_Day17 extends CommonBase {

	@BeforeMethod
	public void copenChrome() {
		driver = initChromeDriver(CT_PageURL_java.MEDIAMART); 
	}
	
	@Test
	public void messenger() {
		click(By.xpath("//div[text()='Gửi tin nhắn']"));
		click(By.xpath("//button[@class='btn--start-convo']"));
		assertTrue(isElementPresent(By.xpath("//button[@class='btn--start-convo']")));
		
	}

	@Test
    public void zaloChat() throws InterruptedException {
        click(By.className("widget-preview--btn-close"));
        click(By.xpath("(//span[@class='widget-header--button-close-icon'])[1]"));
        driver.switchTo().frame(0);
        click(By.className("za-chat__head-box"));
        click(By.xpath("//div[text()='Chat nhanh']"));
        assertTrue(isElementPresent(By.className("card__content")));
    }

}
