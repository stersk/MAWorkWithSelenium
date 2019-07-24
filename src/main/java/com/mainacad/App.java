package com.mainacad;

import com.mainacad.model.User;
import com.mainacad.service.PromUserService;
import com.mainacad.util.ChromeDriverUtil;
import org.openqa.selenium.WebDriver;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        WebDriver driver = ChromeDriverUtil.getChromeDriver();
        User user = new User("testingUser", "testingPassword234", "test1234@mail.ua");

        //driver = PromUserService.registerUser(user, driver);
        driver = PromUserService.loginUser(user, driver);
        driver.quit();
    }
}
