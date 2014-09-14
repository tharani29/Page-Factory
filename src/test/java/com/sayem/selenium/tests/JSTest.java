package com.sayem.selenium.tests;

import com.sayem.selenium.framework.BaseTest;
import com.sayem.selenium.models.User;
import com.sayem.selenium.pages.AjaxTestPage;
import com.sayem.selenium.pages.BasicPage;
import com.sayem.selenium.pages.JSTestPage;
import com.sayem.selenium.pages.LoginPage;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import static com.sayem.selenium.framework.BasePage.initPage;
import static com.sayem.selenium.models.UserBuilder.admin;
import static org.fest.assertions.Assertions.assertThat;

/**
 * Created with IntelliJ IDEA.
 * User: ssayem
 * Date: 05/10/13
 * Time: 10:51
 * To change this template use File | Settings | File Templates.
 */
public class JSTest extends BaseTest {
    private LoginPage loginPage;
    private BasicPage basicPage;
    private AjaxTestPage ajaxTestPage;
    private JSTestPage jSTestPage;
    private User user;

    @BeforeMethod(alwaysRun = true)
    public void openLoginPage() {
        basicPage = initPage(BasicPage.class);
        loginPage = basicPage.forceLogout();
//      headerPage = initPage(HeaderPage.class);
        user = admin();
    }

    @Test
    public void findPositionTest() {
        jSTestPage = loginPage.loginAs(user).getHeader().clickJSTestPage();
        String s = jSTestPage.find();
        assertThat(s).isEqualTo("Whoo Hoooo! Correct!");
    }
}
