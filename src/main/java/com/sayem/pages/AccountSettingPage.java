package com.sayem.pages;
import com.sayem.util.Constants;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AccountSettingPage {
    WebDriver driver;

    // Constructor
    public AccountSettingPage(WebDriver driver){
        this.driver = driver;
    }

    // Change Password Edit
    @FindBy(xpath = Constants.changePasswordLink)
    public WebElement changePasswordLink;

    // Enter current password
    @FindBy(xpath = Constants.currentPassword)
    public WebElement currentPassword;

    // Enter new password
    @FindBy(xpath = Constants.newPassword)
    public WebElement newPassword;

    // Re-enter password
    @FindBy(xpath = Constants.confirmPassword)
    public WebElement confirmPassword;

    // Save Change
    @FindBy(xpath = Constants.saveChangeButton)
    public WebElement saveChangeButton;


    public void clickChangePasswordEdit(String currentPassword, String newPassword, String confirmPassword){
        changePasswordLink.click();
        this.currentPassword.sendKeys(currentPassword);
        this.newPassword.sendKeys(newPassword);
        this.confirmPassword.sendKeys(confirmPassword);
        this.confirmPassword.sendKeys(Keys.ENTER);

    }
}
