package com.sayem.testcases;


import com.sayem.pages.LandingPage;
import com.sayem.pages.LoginPage;
import com.sayem.pages.ProfilePage;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.Test;

public class UploadPic extends TestBase{

    @Test
    public void uploadPic(){
        APPLICATION_LOGS.debug("Executing the upload pic test");

        if(!TestUtil.isExecutable("UploadPic", xls))
            throw new SkipException("Skipping the test");


        LandingPage landingPage =null;
        //go to landing page - if i am logged in else login
        if(!isLoggedIn){
            LoginPage lp = PageFactory.initElements(driver, LoginPage.class);
            landingPage = lp.doLogin(CONFIG.getProperty("username"),CONFIG.getProperty("password"));
        }else{
            landingPage = getTopMenu().goToLandingPage();
        }
        ProfilePage personalProfile = landingPage.clickProfile();
        // change PIC
        APPLICATION_LOGS.debug("Quitting driver");
        try{
            Assert.assertTrue(false, "xxxx");
        }catch(Throwable e){
            //ErrorUtil.addVerificationFailure(e);
            TestUtil.takeScreenShot("upload");
            return;
        }

        quitDriver();
    }

}