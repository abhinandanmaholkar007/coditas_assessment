package com.orangehrm.qa.pages;

import com.orangehrm.qa.base.OrangeHRM_BaseClass;
import com.orangehrm.qa.utility.OrangeHRM_TestUtil;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.io.IOException;

public class OrangeHRM_HomePage extends OrangeHRM_BaseClass  {


@FindBy(xpath = "//span[text()='Onboarding']")
    WebElement onBoardingButton;

    public OrangeHRM_HomePage() throws IOException  {
        PageFactory.initElements(driver, this);

    }

   public OnBoardFormPage onboardingButton() throws IOException {

       JavascriptExecutor js = (JavascriptExecutor)driver;
       js.executeScript("arguments[0].click();", onBoardingButton);
       return new OnBoardFormPage();
   }

}
