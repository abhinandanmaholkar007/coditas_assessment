package com.orangehrm.qa.pages;

import com.orangehrm.qa.base.OrangeHRM_BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.io.IOException;


public class OnBoardFormPage extends OrangeHRM_BaseClass {


    @FindBy(xpath = "//i[@class='large material-icons']")
    WebElement addButton;
    public OnBoardFormPage() throws IOException {
        PageFactory.initElements(driver, this);
    }
    public AddEventFormPage addEvent() throws IOException {
        driver.switchTo().frame("noncoreIframe");
        addButton.click();
        return new AddEventFormPage();

    }
}
