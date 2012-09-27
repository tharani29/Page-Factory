package com.sayem.pages;


import com.sayem.util.Constants;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class LoginPage {

    WebDriver driver;

    // Constructor
    public LoginPage(WebDriver driver){
        this.driver = driver;
    }

    // Username
    @FindBy(css = Constants.username)
    public WebElement username;

    // Password
    @FindBy(css = Constants.password)
    public WebElement password;

    // Login Button
    @FindBy(xpath = Constants.loginButton)
    public WebElement signInButton;



    public LandingPage doLogin(String username, String password){
        driver.get("http://facebook.com");

        // Verify title
        try {
            Assert.assertEquals(driver.getTitle(), Constants.facebookTitle);
        } catch (Throwable e) { // Change exception to Throwable!!
            System.out.println("Error in verifying Title");
            // Add ErrorUtil verification here and run with testng.xml
            // ErrorUtil.addVerificationFailure(e);
        }



        this.username.sendKeys(username);
        this.password.sendKeys(password);
        this.password.sendKeys(Keys.ENTER);

        int count = driver.findElements(By.cssSelector(Constants.profileNameLink)).size();
        if(count == 0)
            return null;
        else
        // doLogin method will return you to LandingPage
        return PageFactory.initElements(driver, LandingPage.class);
    }

    public void doRegister(){

    }
}
