package com.sayem.testcases;


import com.sayem.util.TestUtil;
import com.sayem.util.Xls_Reader;
import org.testng.SkipException;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class LoginTest {

    @BeforeTest
    public void checkRunmode(){
        Xls_Reader xls = new Xls_Reader(System.getProperty("user.dir") + "\\src\\main\\java\\com\\sayem\\data\\Test Cases.xlsx");

        // If the TestUtil is not executable, throw an skip exception!!
        if(!TestUtil.isExecutable("Test1", xls))
            throw new SkipException("Skipping the test");

    }

    @Test
    public void sampleTest(){
        System.out.println("This is a sample test");
    }
}
