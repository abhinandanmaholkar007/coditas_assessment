package com.orangehrm.qa.utility;


import com.orangehrm.qa.base.OrangeHRM_BaseClass;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.IOException;
import java.time.Duration;

public class OrangeHRM_TestUtil extends OrangeHRM_BaseClass {

    public static long implicitlyWait=10;

    public OrangeHRM_TestUtil() throws IOException  {
        PageFactory.initElements(driver, this);
    }

}
