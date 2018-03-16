package ru.stqa.pft.addressbook.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SessionHelper extends HelperBase {

  public SessionHelper(FirefoxDriver wd) {
    super(wd);
  }

  public void login(String user, String pass, String password, By xpath, String username) {
    type(By.name(user), username);
    type(By.name(pass), password);

    click(xpath);
  }

}
