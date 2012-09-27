package com.sayem.rough;

import com.sayem.pages.LandingPage;
import com.sayem.pages.LoginPage;
import com.sayem.util.Constants;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.openqa.selenium.support.PageFactory;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

public class TestLogin {

    public static void main(String [] args){

        Logger APPLICATION_LOGS = Logger.getLogger("devpinoyLogger");
        APPLICATION_LOGS.debug("I am starting the test");

        Properties CONFIG = new Properties();
        FileInputStream fs = null;
        try {
            fs = new FileInputStream(Constants.CONFIG_FILE_PATH);
        } catch (Exception e) {
            e.getMessage();
        }
        try {
            CONFIG.load(fs);
        } catch (IOException e) {
            e.getMessage();
        }
        System.out.println(CONFIG.getProperty("emailAddress"));

        WebDriver driver = null;
        if(CONFIG.getProperty("browser").equalsIgnoreCase("Firefox"))
            driver = new FirefoxDriver();
        else if(CONFIG.getProperty("browser").equalsIgnoreCase("Chrome"))
            driver = new ChromeDriver();
        else if(CONFIG.getProperty("browser").equalsIgnoreCase("IE"))
            driver = new InternetExplorerDriver();
        else if(CONFIG.getProperty("browser").equalsIgnoreCase("Safari"))
            driver = new SafariDriver();


        //noinspection ConstantConditions
        driver.navigate().to("http://www.facebook.com/login.php");
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

        LoginPage loginPage = PageFactory.initElements(driver, LoginPage.class);

        // loginPage.doLogin(method) from LoginPage will return you to the LandingPage
        LandingPage landingPage = loginPage.doLogin("syed@hotmail.com", "user123");
        APPLICATION_LOGS.debug("I am logged in to the Landing Page");

        // goToProfile(method) from landingPage will return you to the ProfilePage
        landingPage.clickProfile();
        APPLICATION_LOGS.debug("I am in the Profile Page");




    }
}
