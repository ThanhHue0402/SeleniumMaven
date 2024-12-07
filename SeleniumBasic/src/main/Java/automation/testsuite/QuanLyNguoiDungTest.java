package automation.testsuite;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import automation.common.CommonBase;
import automation.constant.CT_PageURL_java;
import automation.page.LoginPage_Day14;
import automation.page.QuanLyNguoiDung_Page;

public class QuanLyNguoiDungTest extends CommonBase {
    @BeforeMethod
    public void OpenFireFox() {
        driver = initFireFoxDriver(CT_PageURL_java.crmCodeStar);
        LoginPage_Day14 login = new LoginPage_Day14(driver);
        login.LoginFunction("admin@gmail.com", "12345678");
        assertTrue(driver.findElement(By.xpath("//p[text()='Quản lý người dùng']")).isDisplayed());

    }

    @Test(priority = 1)
    public void ThemNguoiDungFail() {
        QuanLyNguoiDung_Page quanlyND = new QuanLyNguoiDung_Page(driver);
        quanlyND.ThemNguoiDung("Thanh Huệ", "test@gmail.com", "0947877734", "3", "1", "2", "NDTest3");
        assertTrue(driver.findElement(By.xpath("//div[text()='Dữ liệu nhập vào sai định dạng']")).isDisplayed());
    }

//    @Test(priority = 2)
//    public void ThemNguoiDung() {
//        QuanLyNguoiDung_Page quanlyND = new QuanLyNguoiDung_Page(driver);
//        quanlyND.ThemNguoiDung("hue", "thanhhue@gmail.com", "947877734", "3", "1", "2", "963");
//        assertTrue(driver.findElement(By.xpath("//div[text()='Thêm mới người dùng thành công']")).isDisplayed());
//    }


}
