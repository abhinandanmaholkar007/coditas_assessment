package com.orangehrm.qa.base;

import com.orangehrm.qa.utility.OrangeHRM_TestUtil;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

public class OrangeHRM_BaseClass {
    public static WebDriver driver;
    public static Properties prop;
    public OrangeHRM_BaseClass() throws IOException {
        try {
            prop = new Properties();
            FileInputStream ip = new FileInputStream("C:\\Users\\coditas\\Documents\\intellijProject\\BDD-Framework\\OrangeHRM\\src\\main\\java\\com\\orangehrm\\qa\\config\\config.properties");
            prop.load(ip);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }}
    public static void initialization(){
        String browserName = prop.getProperty("browser");

        if(browserName.equals("chrome")){

            driver = new ChromeDriver();
        }
        else if(browserName.equals("FF")){
            driver = new FirefoxDriver();
        }
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(OrangeHRM_TestUtil.implicitlyWait));
        driver.get(prop.getProperty("url"));

    }}

