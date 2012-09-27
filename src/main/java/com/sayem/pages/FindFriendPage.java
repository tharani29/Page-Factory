package com.sayem.pages;

import com.sayem.util.Constants;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class FindFriendPage {

    WebDriver driver;

    // Constructor
    public FindFriendPage(WebDriver driver){
        this.driver = driver;
    }

    // Profile Link
    @FindBy(xpath = Constants.searchForFriend)
    public WebElement searchForFriend;

    public boolean findAFriend(String searchForFriend){
        this.searchForFriend.sendKeys(searchForFriend);
        int listOfFriend = driver.findElements(By.linkText(searchForFriend)).size();
        return listOfFriend != 0;
    }


}
