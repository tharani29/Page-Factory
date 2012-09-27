package com.sayem.testcases;


import com.sayem.pages.FindFriendPage;
import com.sayem.pages.LandingPage;
import com.sayem.pages.LoginPage;
import com.sayem.pages.ProfilePage;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.util.Hashtable;
import java.util.concurrent.TimeUnit;

public class LoginTest extends TestBase{
    LandingPage landingPage=null;

    @BeforeSuite
    public void init(){
        initConfigurations();
        initDriver();
    }

    @Test(dataProvider="getLoginData")
    public void loginTest(Hashtable<String,String> data){
        if(!TestUtil.isExecutable("LoginTest", xls) || data.get("Runmode").equals("N"))
            throw new SkipException("Skipping the test");

        System.out.println("************************************************");

        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);

        LoginPage lp = PageFactory.initElements(driver, LoginPage.class);
        landingPage = lp.doLogin(data.get("Username"),data.get("Password"));
        Assert.assertTrue(landingPage!=null, "Could not login");
        isLoggedIn=true;
        APPLICATION_LOGS.debug("logged in");
        landingPage.clickProfile();
        APPLICATION_LOGS.debug("In profile page");

        // wrong username/password
        // return type	}

    }
    @DataProvider
    public Object[][] getLoginData(){
        return TestUtil.getData("LoginTest", xls);
    }


    @Test(dependsOnMethods = {"loginTest"})
    public void findFriend(){


        String friendName = "Minhaz Quraishi";

        Xls_Reader xls = new Xls_Reader(System.getProperty("user.dir") + "\\src\\main\\java\\com\\sayem\\data\\Test Cases.xlsx");
        // If the TestUtil is not executable, throw an skip exception!!
        if(!TestUtil.isExecutable("FindFriendTest", xls))
            throw new SkipException("Skipping the test");


        // goToProfile(method) from landingPage will return you to the ProfilePage
        ProfilePage profilePage = landingPage.clickProfile();
        FindFriendPage findFriendPage = profilePage.clickFriends();
        boolean friend =findFriendPage.findAFriend("Emon Islam");

        Assert.assertTrue(friend, "Friend is not found" + friendName);
    }
}
