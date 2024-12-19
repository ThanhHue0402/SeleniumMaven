package automation.page;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import bsh.Console;

public class MayRuaChenBat_Page {
	private WebDriver driver;
	
	@FindBy (xpath="(//a[@class='menu-link'])[3]") WebElement linkMayRuaChen;
	@FindBy (xpath = "//img[@src='https://static.bepantoan.vn/userfiles/images/logo bosch.jpg?w=100']") WebElement linkBOSCH;
//	@FindBy (xpath = "//div[@class='flex flex-wrap product-list']") WebElement list
	public MayRuaChenBat_Page(WebDriver driver) {
		super();
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	public void sortHang() throws InterruptedException {
		linkMayRuaChen.click();
		Thread.sleep(5000);
		linkBOSCH.click();
		
	}
	
	

}
