package com.sayem.rough;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Test_Config {

    public static void main(String [] args) throws IOException {

        // Read OR.properties file
        Properties or = new Properties();
        FileInputStream orfs = new FileInputStream(System.getProperty("user.dir") + "\\src\\main\\java\\com\\sayem\\config\\OR.properties");
        or.load(orfs);
        System.out.println(or.getProperty("emailAddress"));

        // Print out to the console
        //System.out.println(or.getProperty("XXXX"));

        /*
        // Read config.properties file
        Properties config = new Properties();
        FileInputStream configFs = new FileInputStream(System.getProperty("user.dir") + "\\src\\main\\java\\com\\sayem\\config\\config.properties");
        config.load(configFs);
        System.out.println(config.getProperty("name"));
        */
    }
}
