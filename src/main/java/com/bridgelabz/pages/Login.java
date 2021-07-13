package com.bridgelabz.pages;

import com.bridgelabz.base.Base;
import com.bridgelabz.utility.Constants;
import org.openqa.selenium.By;

public class Login extends Base {
    public void enterEmail() throws InterruptedException {
        driver.findElement(By.xpath("//input[@class = '_2IX_2- VJZDxU']")).sendKeys(Constants.userName);
        Thread.sleep(2000);
    }
    public void enterPassword() throws InterruptedException {
        driver.findElement(By.xpath("//input[@class = '_2IX_2- _3mctLh VJZDxU']")).sendKeys(Constants.password);
        Thread.sleep(2000);
    }
    public void clickButton() throws InterruptedException {
        driver.findElement(By.xpath("//button[@class = '_2KpZ6l _2HKlqd _3AWRsL']")).click();
        Thread.sleep(2000);
    }
}
