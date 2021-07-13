package com.bridgelabz.test;

import com.bridgelabz.base.Base;
import com.bridgelabz.pages.Login;
import com.bridgelabz.utility.ReadExcelSheet;
import org.testng.annotations.Test;
import java.io.IOException;

public class ExecutionTest extends Base {
    @Test
    public static void getLogin() throws InterruptedException, IOException {
        ReadExcelSheet rs = new ReadExcelSheet();
        Login k = new Login();
        rs.getColumn(4);
        k.openBrowser();
        k.navigateURL();
        k.enterEmail();
        k.enterPassword();
        k.clickButton();
        k.closeBrowser();
        System.out.println("Test executed successfully");
    }
}


