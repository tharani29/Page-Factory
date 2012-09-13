package com.sayem.rough;

import org.apache.log4j.Logger;

public class Log4j {

    public static void main(String [] args){

        Logger APPLICATION_LOGS = Logger.getLogger("devpinoyLogger");
        APPLICATION_LOGS.debug("Executing Test1");
        APPLICATION_LOGS.debug("Executing Test2");
        APPLICATION_LOGS.debug("Executing Test3");
    }

}
