package automation.testsuite;

import org.apache.log4j.chainsaw.Main;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.*;

import automation.common.CommonBase;

public class LocatorPractice extends CommonBase {
	@BeforeMethod
	public void openChrome() {
		driver = initChromeDriver("https://selectorshub.com/xpath-practice-page/");
//		driver = initChromeDriver("https://bepantoan.vn/");

	}
	@Test
	public void getLocator() {
		// Sử dụng name
		WebElement username = driver.findElement(By.name("email"));
		System.out.println("username is:"+username);
		
		WebElement pass = driver.findElement(By.id("pass"));
		System.out.println("password is:"+pass);
		
		WebElement mobileNumber = driver.findElement(By.name("mobile number"));
		System.out.println("mobileNumber is:"+ mobileNumber);
		
		WebElement company= driver.findElement(By.name("company"));
		System.out.println("Company is:" + company);
		
		// Sử dụng ClassName
		WebElement classMobileNumber = driver.findElement(By.className("form-control"));
		System.out.println("mobileNumber is:"+ classMobileNumber);
		
		// Sử dụng TagName
		
		// Sử dụng partitalLinkText
		WebElement courses = driver.findElement(By.partialLinkText("Courses"));
		System.out.println("Courses is:"+ courses);
		// Sử dụng linkText
		
		
		
	}
//	@Test
//	public void getLocatorBepAnToan() {
//		WebElement linkBepTu = driver.findElement(By.linkText("Bếp Từ"));
//		System.out.println("LinkBepTu is:"+linkBepTu);
//	}
	
}
