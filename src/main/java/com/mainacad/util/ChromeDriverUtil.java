package com.mainacad.util;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.opera.OperaDriver;

import java.util.concurrent.TimeUnit;

public class ChromeDriverUtil {
  private static final String MAIN_PATH = System.getProperty("user.dir");
  private static final String SEPARATOR = System.getProperty("file.separator");

  private static final String RES_PATH = MAIN_PATH + SEPARATOR + "driver" + SEPARATOR + "chromedriver.exe";

  public static WebDriver getChromeDriver() {

    System.setProperty("webdriver.chrome.driver", RES_PATH);

    WebDriver chromeDriver = new ChromeDriver();

    chromeDriver.manage().window().maximize();
    chromeDriver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
    chromeDriver.manage().timeouts().setScriptTimeout(30, TimeUnit.SECONDS);
    chromeDriver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

    TimerUtil.waitSeconds(3);

    return chromeDriver;
  }
}
