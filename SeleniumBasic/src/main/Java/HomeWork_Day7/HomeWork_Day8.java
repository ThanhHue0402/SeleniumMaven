package HomeWork_Day7;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import automation.common.CommonBase;

public class HomeWork_Day8 extends CommonBase {
	@BeforeMethod
	public void openChrome() {
		driver = initChromeDriver("https://automationfc.github.io/basic-form/index.html");

	}

	@Test
	public void getLocatorYourBasicInfo() {
		WebElement email = driver.findElement(By.name("user_email"));
		System.out.println("Email is:" + email);

		WebElement pass = driver.findElement(By.name("disable_password"));
		System.out.println("Password is:" + pass);

		WebElement pass2 = driver.findElement(By.id("disable_password"));
		System.out.println("Password is:" + pass2);

		WebElement number = driver.findElement(By.name("number"));
		System.out.println("Number is: " + number);

		WebElement number2 = driver.findElement(By.id("number"));
		System.out.println("Number is: " + number2);

		WebElement under18 = driver.findElement(By.xpath("//*[@id=\"under_18\"]"));
		System.out.println("Under 18 is:" + under18);

		WebElement over18 = driver.findElement(By.xpath("//*[@id=\"over_18\"]"));
		System.out.println("Over 18 is:" + over18);

		WebElement radiobttn = driver.findElement(By.id("radio-disabled"));
		System.out.println("Radio button is disabled is:" + radiobttn);

	}

//	@Test
//	public void getLocatorYourProfile() {
//		
//	}

	@Test
	public void getLocatorTable() {
		WebElement table = driver.findElement(By.tagName("table"));
		System.out.println("table is:" + table);

		WebElement article1 = driver.findElement(By.xpath("//*[@id=\"table-column-toggle\"]/tbody/tr[1]/td[1]/a"));
		System.out.println("Article title is:" + article1);

		WebElement article2 = driver.findElement(By.xpath("//*[@id=\"table-column-toggle\"]/tbody/tr[2]/td[1]/a"));
		System.out.println("Article title is:" + article2);

		WebElement article3 = driver.findElement(By.xpath("//*[@id=\"table-column-toggle\"]/tbody/tr[3]/td[1]/a"));
		System.out.println("Article title is:" + article3);
	}

	@Test
	public void getLocatorWindow() {
		WebElement window = driver.findElement(By.className("container"));
		System.out.println("Window is:" + window);

		WebElement google = driver.findElement(By.linkText("GOOGLE"));
		System.out.println("Google is:" + google);

		WebElement faceBook = driver.findElement(By.linkText("FACEBOOK"));
		System.out.println("FaceBook is:" + faceBook);
	}

	@Test
	public void getLocatorDoubleClick() {
		WebElement doubleClickMe = driver.findElement(By.cssSelector("body > fieldset:nth-child(12) > div > button"));
		doubleClickMe.click();
	}
	
	@Test
	public void getLocatorJavaScriptAlerts() {
		WebElement jsAlert= driver.findElement(By.cssSelector("#content > div > button:nth-child(1)"));
		jsAlert.click();
		
		WebElement jsConfirm= driver.findElement(By.cssSelector("#content > div > button:nth-child(2)"));
		jsConfirm.click();
		
		WebElement jsPrompt= driver.findElement(By.cssSelector("#content > div > button:nth-child(3)"));
		jsPrompt.click();
	}
	
	@Test
	public void getLocatorSubmitAndReset() {
		WebElement name = driver.findElement(By.id("name"));
		System.out.println("Name is:"+ name);
		
		WebElement address = driver.findElement(By.id("address"));
		System.out.println("Address is:"+ address);
		
		WebElement email = driver.findElement(By.id("email"));
		System.out.println("Email is:"+ email);
		
		WebElement password = driver.findElement(By.id("password"));
		System.out.println("Password is:"+ password);
		
		WebElement submit = driver.findElement(By.xpath("//*[@id=\"login-form\"]/button[1]"));
		submit.click();
		
		WebElement reset = driver.findElement(By.xpath("//*[@id=\"login-form\"]/button"));
		reset.click();
	}
}
