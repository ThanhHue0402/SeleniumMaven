package automation.testsuite;

import automation.common.CommonBase;
import automation.constant.CT_PageURL_java;
import automation.page.LoginPageAlada_HomeWorkDay14;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LoginAladaTest_HomeWorkDay14 extends CommonBase {
    @BeforeMethod
    public void beforeMethod() {
        driver= initFireFoxDriver(CT_PageURL_java.alada);
    }
@Test (priority = 1)
    public void Login() throws InterruptedException {
        LoginPageAlada_HomeWorkDay14 login = new LoginPageAlada_HomeWorkDay14(driver);
//        login.LoginAlada("Thanh Huệ");
        Thread.sleep(5000);


}
}
