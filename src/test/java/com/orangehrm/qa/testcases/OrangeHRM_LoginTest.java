package com.orangehrm.qa.testcases;

import com.orangehrm.qa.base.OrangeHRM_BaseClass;
import com.orangehrm.qa.pages.OrangeHRM_HomePage;
import com.orangehrm.qa.pages.OrangeHRM_LoginPage;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.io.IOException;

public class OrangeHRM_LoginTest extends OrangeHRM_BaseClass {
    OrangeHRM_LoginPage loginPage;
    OrangeHRM_HomePage orangeHRM_homePage;


    public OrangeHRM_LoginTest() throws IOException {
        super();
    }


    @BeforeMethod
    public void setUp() throws IOException {
        initialization();
        loginPage = new OrangeHRM_LoginPage();
        orangeHRM_homePage=new OrangeHRM_HomePage();
    }
    @Test(priority=1)
    public void loginPageTitleTest(){
        String title = loginPage.validateLoginPageTitle();
        Assert.assertEquals(title, prop.getProperty("LoginPageTitle"));
    }
    @Test(priority=2)
    public void loginTest() throws IOException {
        orangeHRM_homePage = loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
    }

    @AfterMethod
    public void tearDown(){
        driver.quit();
    }

}
