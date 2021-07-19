package com.bridgelabz.base;

import com.bridgelabz.utility.Constants;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import java.io.IOException;

public class Base {
    public static WebDriver driver;
    @BeforeTest
    public void openBrowser() throws InterruptedException, IOException {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        Thread.sleep(200);
    }
    public void navigateURL() throws InterruptedException {
        //Enter the URL of the Application
        driver.get(Constants.URL);
//        driver.get("https://www.flipkart.com/");
        Thread.sleep(2000);
    }
    //After execution
    @AfterTest
    public void closeBrowser() {
        //used to close the current window
        driver.quit();
    }

}
