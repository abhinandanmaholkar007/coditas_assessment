package com.orangehrm.qa.pages;

import com.orangehrm.qa.base.OrangeHRM_BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.io.IOException;

public class OrangeHRM_LoginPage extends OrangeHRM_BaseClass {
@FindBy(id="txtUsername")
    WebElement userName;

@FindBy(id="txtPassword")
    WebElement password;

@FindBy(css = "button[type='submit']")
    WebElement loginButton;

    public OrangeHRM_LoginPage() throws IOException  {
        PageFactory.initElements(driver, this);
    }
    public String validateLoginPageTitle(){
        return driver.getTitle();
    }
    public OrangeHRM_HomePage login(String un, String pwd) throws IOException {
        userName.sendKeys(un);
        password.sendKeys(pwd);
        loginButton.click();
        return new OrangeHRM_HomePage();
}}
