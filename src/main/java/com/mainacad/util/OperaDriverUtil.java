package com.mainacad.util;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.opera.OperaDriver;

import java.util.concurrent.TimeUnit;

public class OperaDriverUtil {
  private static final String MAIN_PATH = System.getProperty("user.dir");
  private static final String SEPARATOR = System.getProperty("file.separator");

  private static final String RES_PATH = MAIN_PATH + SEPARATOR + "driver" + SEPARATOR + "operadriver.exe";

  public static WebDriver getOperaDriver() {

    System.setProperty("webdriver.opera.driver", RES_PATH);

    WebDriver operaDriver = new OperaDriver();

    operaDriver.manage().window().maximize();
    operaDriver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
    operaDriver.manage().timeouts().setScriptTimeout(30, TimeUnit.SECONDS);
    operaDriver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

    TimerUtil.waitSeconds(3);

    return operaDriver;
  }
}
