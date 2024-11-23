package automation.testsuite;

import org.checkerframework.checker.units.qual.s;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.*;

import automation.common.CommonBase;
import automation.constant.CT_PageURL_java;

public class Day12_CheckBox extends CommonBase {
	@BeforeMethod
	public void openWebPage() {
		driver = initChromeDriver(CT_PageURL_java.demQA);

	}

//	@Test
	public void clickOneCheckBox() {
		WebElement sportCheckBox = driver.findElement(By.id("hobbies-checkbox-1"));
		try {
			if (sportCheckBox.isSelected() == false) {
				sportCheckBox.click();
				System.out.println("Đã được chọn");
			} else
				System.out.println("Check box đã được chọn mặc định");
		} catch (Exception ex) {
			WebElement labelChb1 = driver.findElement(By.xpath("//label[@for='hobbies-checkbox-1']"));
			labelChb1.click();
		}
	}

	@Test
	public void clickOneRadioBox() {
		WebElement maleRadio = driver.findElement(By.id("gender-radio-1"));
		try {
			if (maleRadio.isSelected() == false) {
				maleRadio.click();
				System.out.println("Đã chọn Male");
			} else
				System.out.println("Radio đã được chọn mặc định");
		} catch (Exception ex) {
			WebElement labelChb2 = driver.findElement(By.xpath("//label[@for='gender-radio-1']"));
			labelChb2.click();
		}

	}

	@Test
	public void clickDefaultRadioBox() {
		WebElement maleRadio = driver.findElement(By.id("gender-radio-1"));
		WebElement femalRadio = driver.findElement(By.id("gender-radio-2"));
		WebElement otherRadio = driver.findElement(By.id("gender-radio-3"));
		System.out.println(maleRadio.isSelected());
		System.out.println(femalRadio.isSelected());
		System.out.println(otherRadio.isSelected());
	}

}
