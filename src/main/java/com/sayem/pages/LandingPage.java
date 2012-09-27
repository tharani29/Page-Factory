package com.sayem.pages;

import com.sayem.util.Constants;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LandingPage {

    WebDriver driver;

    // Constructor
    public LandingPage(WebDriver driver){
        this.driver = driver;
    }

    // Profile Link
    @FindBy(css = Constants.profileNameLink)
    public WebElement profileNameLink;


    public ProfilePage clickProfile(){
        profileNameLink.click();
        return PageFactory.initElements(driver, ProfilePage.class);

    }


}
