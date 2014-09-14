package com.sayem.selenium.pages;

/**
 * Created with IntelliJ IDEA.
 * User: ssayem
 * Date: 05/10/13
 * Time: 12:14
 * To change this template use File | Settings | File Templates.
 */
public class MyApplicationsPage extends BasicPage{
    public AppsContentPage getAppsContent() {
        return initPage(AppsContentPage.class);
    }
}
