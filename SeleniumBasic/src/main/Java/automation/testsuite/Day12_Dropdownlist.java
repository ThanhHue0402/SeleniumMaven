package automation.testsuite;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import automation.common.CommonBase;
import automation.constant.CT_PageURL_java;

public class Day12_Dropdownlist extends CommonBase {
	@BeforeMethod
	public void openWebPage() {
//		driver = initChromeDriver(CT_PageURL_java.codeStar);
		driver = initChromeDriver(CT_PageURL_java.globalSQ);

	}
//	@Test
//	public void chooseCourseOption() throws InterruptedException {
//		Thread.sleep(5000);
//		Select courseDropdown = new Select(driver.findElement(By.id("product_categories_filter")));
//		// Cách 1 selectByVisibleText
//		courseDropdown.selectByVisibleText("Kiểm thử");
//		String text1= courseDropdown.getFirstSelectedOption().getText();
//		System.out.println("courseDropdown.getFirstSelectedOption()"+text1);
//		
//		//cách 2 selectByValue
//		courseDropdown.selectByValue("https://codestar.vn/product-category/lap-trinh-web/");
//		String text2 = courseDropdown.getFirstSelectedOption().getText();
//		System.out.println("courseDropdown.getFirstSelectedOption()"+text2);
//
//		//cách 3 selectByIndex
//		courseDropdown.selectByIndex(4);
//		String text3 = courseDropdown.getFirstSelectedOption().getText();
//		System.out.println("courseDropdown.getFirstSelectedOption()"+text3);
//	}
	
	@Test
	public void chooseCountryOption() throws InterruptedException{
		//Cách1
		Select countryDropdown = new Select(driver.findElement(By.xpath("//select")));
		countryDropdown.selectByVisibleText("Afghanistan");
		String countryText1= countryDropdown.getFirstSelectedOption().getText();
		System.out.println("countryDropdown.getFirstSelectedOption(): "+ countryText1);
		
		//Cách 2
		countryDropdown.selectByIndex(6);
		String countryText2 = countryDropdown.getFirstSelectedOption().getText();
		System.out.println("countryDropdown.getFirstSelectedOption():"+ countryText2);
		
		//Cách 3
		countryDropdown.selectByValue("ARG");
		String countryText3= countryDropdown.getFirstSelectedOption().getText();
		System.out.println("countryDropdown.getFirstSelectedOption(): "+ countryText3);
		
	}
	
}

