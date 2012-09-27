package com.sayem.pages;

import com.sayem.util.Constants;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProfilePage {


    WebDriver driver;

    // Constructor
    public ProfilePage(WebDriver driver){
        this.driver = driver;
    }

    // Profile Link
    @FindBy(xpath = Constants.friendsListLink)
    public WebElement friendsListLink;

    // Change profile picture
    @FindBy(xpath = Constants.changeProfilePic)
    public WebElement changeProfilePic;

    // Change profile picture
    @FindBy(xpath = Constants.uploadPicture)
    public WebElement uploadPicture;

    public FindFriendPage clickFriends(){
        friendsListLink.click();
        return PageFactory.initElements(driver, FindFriendPage.class);
    }

    public void changeProfilePic(String newPicPath){
        changeProfilePic.click();
        uploadPicture.sendKeys(newPicPath);

    }
}
