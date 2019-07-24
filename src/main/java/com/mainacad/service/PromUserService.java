package com.mainacad.service;

import com.mainacad.model.User;
import com.mainacad.util.TimerUtil;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class PromUserService {
  private static final String BASE_URL = "https://prom.ua";

  public static WebDriver registerUser(User user, WebDriver webDriver) {
    https://prom.ua/ua/join-customer?source_id=txt.register.customer
    webDriver.get(BASE_URL + "/ua/join-customer?source_id=txt.register.customer");
    TimerUtil.waitSeconds(3);

    List<WebElement> inputElements = webDriver.findElements(By.cssSelector("input[data-qaid=name]"));
    if (inputElements.size() > 0) {
      WebElement nameInput = inputElements.get(0);
      nameInput.sendKeys(user.getLogin());
    }

    TimerUtil.waitSeconds(1);

    inputElements = webDriver.findElements(By.cssSelector("input[data-qaid=email]"));
    if (inputElements.size() > 0) {
      WebElement emailInput = inputElements.get(0);
      emailInput.sendKeys(user.getEMail());
    }

    TimerUtil.waitSeconds(1);

    inputElements = webDriver.findElements(By.cssSelector("input[data-qaid=password]"));
    if (inputElements.size() > 0) {
      WebElement passwordInput = inputElements.get(0);
      passwordInput.sendKeys(user.getPassword());
    }

    TimerUtil.waitSeconds(1);

    inputElements = webDriver.findElements(By.cssSelector("button[data-qaid=submit]"));
    if (inputElements.size() > 0) {
      WebElement registerButton = inputElements.get(0);
      registerButton.click();
    }

    TimerUtil.waitSeconds(10);

    return webDriver;
  }

  public static WebDriver loginUser(User user, WebDriver webDriver) {
    return webDriver;
  }
}
