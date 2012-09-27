package com.sayem.util;

public class Constants {

    // Config Path
    public static String CONFIG_FILE_PATH = System.getProperty("user.dir") + "\\src\\main\\java\\com\\sayem\\config\\config.properties";

    // Page Title
    public static final String facebookTitle = "Log In | Facebook";

    // Login Page
    public static final String username = "#email";
    public static final String password = "#pass";
    public static final String loginButton = "//label[@id='loginbutton']/input";

    // Landing Page
    public static final String profileNameLink = ".fbxWelcomeBoxName";
    public static final String facebookLogo = "#pageLogo>a";



    // Profile Page
    public static final String friendsListLink = "html/body/div[2]/div[2]/div[1]/div[1]/div[2]/div[2]/div[2]/div/div/div[2]/div[1]/div/ol/li[6]/div[2]/div[1]/div/a/div";
    public static final String changeProfilePic = "html/body/div[2]/div[2]/div[1]/div[1]/div[2]/div[2]/div[2]/div/div/div[1]/div[3]/div[1]/div[2]/div[2]/div/div/div/div/a/span";
    public static final String uploadPicture = "html/body/div[2]/div[2]/div[1]/div[1]/div[2]/div[2]/div[2]/div/div/div[1]/div[3]/div[1]/div[2]/div[2]/div/div/div/div/div/div/ul/li[3]/a/span/form/input[2]";



    // Find a friends page
    public static final String searchForFriend = "html/body/div[2]/div[2]/div[1]/div[1]/div[2]/div[2]/div[2]/div/div/div[2]/div/div/div/div/div[1]/table/tbody/tr/td[2]/table/tbody/tr/td[2]/div[2]/div/div/input";

    // Top Menu
    public static final String navAccountLink = "//*[@id='userNavigationLabel']";
    public static final String accountSettingLink = "//*[@id='userNavigation']/li[7]/a";

    // Account Setting
    public static final String changePasswordLink = "//*[@id='SettingsPage_Content']/ul/li[4]/a/span[2]";
    public static final String currentPassword = "//*[@id='password_old']";
    public static final String newPassword = "//*[@id='password_new']";
    public static final String confirmPassword = "//*[@id='password_confirm']";
    public static final String saveChangeButton = "//*[@class='submit uiButtonDisabled uiButton uiButtonConfirm']";

}
