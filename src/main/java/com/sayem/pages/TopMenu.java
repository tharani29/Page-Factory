package com.sayem.pages;

import com.sayem.testcases.TestBase;
import com.sayem.util.Constants;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TopMenu {
    WebDriver driver;

    // Constructor
    public TopMenu(WebDriver driver){
        this.driver = driver;
    }

    // Top Menu - Navigation Account Link
    @FindBy(xpath = Constants.navAccountLink)
    public WebElement navAccountLink;

    // Account Setting Link
    @FindBy(xpath = Constants.accountSettingLink)
    public WebElement accountSettingLink;

    // facebook logo
    @FindBy(xpath = Constants.facebookLogo)
    public WebElement facebookLogo;

    public AccountSettingPage clickAccountSettingLink(){
        navAccountLink.click();
        accountSettingLink.click();
        return PageFactory.initElements(driver, AccountSettingPage.class);
    }


    /*
    public AccountSettingPage clickAccountSettingLink(){
        navAccountLink.click();
        accountSettingLink.click();
        return PageFactory.initElements(driver, AccountSettingPage.class);
    }
    */

    // Return to LandingPage
    public LandingPage goToLandingPage(){
        facebookLogo.click();
        return PageFactory.initElements(driver, LandingPage.class);
    }

    public void logout(){
        TestBase.isLoggedIn = false;
    }
}
