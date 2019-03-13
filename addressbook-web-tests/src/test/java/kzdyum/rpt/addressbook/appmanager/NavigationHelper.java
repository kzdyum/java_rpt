package kzdyum.rpt.addressbook.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class NavigationHelper extends HelperBase{

  public NavigationHelper(WebDriver driver) {
    super(driver);
  }

  public void goToGroupsPage() {
    click(By.linkText("GROUPS"));
  }
}
