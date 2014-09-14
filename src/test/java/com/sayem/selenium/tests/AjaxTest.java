package com.sayem.selenium.tests;

import com.sayem.selenium.framework.BaseTest;
import com.sayem.selenium.models.User;
import com.sayem.selenium.pages.AjaxTestPage;
import com.sayem.selenium.pages.BasicPage;
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
 * Time: 18:39
 * To change this template use File | Settings | File Templates.
 */
public class AjaxTest extends BaseTest{
    private LoginPage loginPage;
    private BasicPage basicPage;
    private AjaxTestPage  ajaxTestPage;
    private User user;

    @BeforeMethod(alwaysRun = true)
    public void openLoginPage() {
        basicPage = initPage(BasicPage.class);
        loginPage = basicPage.forceLogout();
        user = admin();
    }

   @Test
    public void sumNumbersAndCheckResultTest() {
        float x = 123.123f;
        float y = 123.123f;
        ajaxTestPage = loginPage.loginAs(user)
                .getHeader()
                .clickAjaxTestPage();
        assertThat(ajaxTestPage.calculate(x, y)).isEqualTo(x + y );
    }

   @Test
    public void sumStringAndCheckIncorrectResultTest() {
        ajaxTestPage = loginPage.loginAs(user).getHeader().clickAjaxTestPage();
        assertThat(ajaxTestPage.isIncorrextStringCalc("1" + AjaxTestPage.X_TEXT_FIELD_XPATH, "2")).isTrue();
    }
}
