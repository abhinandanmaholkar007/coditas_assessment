package com.orangehrm.qa.testcases;

import com.orangehrm.qa.base.OrangeHRM_BaseClass;
import com.orangehrm.qa.pages.OnBoardFormPage;
import com.orangehrm.qa.pages.OrangeHRM_HomePage;
import com.orangehrm.qa.pages.OrangeHRM_LoginPage;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.io.IOException;

public class OrangeHRM_HomePageTest extends OrangeHRM_BaseClass {
    OrangeHRM_LoginPage loginPage;
    OrangeHRM_HomePage orangeHRM_homePage;
    OnBoardFormPage onBoardFormPage;


    public OrangeHRM_HomePageTest() throws IOException {
        super();
    }

    @BeforeMethod
    public void setUp() throws IOException {
        initialization();
        loginPage = new OrangeHRM_LoginPage();
        loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
        orangeHRM_homePage=new OrangeHRM_HomePage();
        onBoardFormPage=new OnBoardFormPage();

    }

    @Test()
    public void OnBoard() throws IOException {
        onBoardFormPage=orangeHRM_homePage.onboardingButton();
    }

    @AfterMethod
    public void tearDown(){
        driver.quit();
    }

}
