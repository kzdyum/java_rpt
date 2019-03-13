package kzdyum.rpt.addressbook.appmanager;

import kzdyum.rpt.addressbook.model.ContactData;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ContactHelper extends HelperBase {

  public ContactHelper(WebDriver driver) {
   super (driver);
  }

  public void submitContactForm() {
    click(By.xpath("(//input[@name='submit'])[2]"));
  }

  public void fillContactForm(ContactData contactData) {
    type(By.name("firstname"),contactData.getFirstname());
    type(By.name("middlename"),contactData.getMiddlename());
    type(By.name("lastname"),contactData.getLastname());
    type(By.name("address"),contactData.getAddress());
    type(By.name("mobile"),contactData.getMobilephone());
    type(By.name("email"),contactData.getEmail());
  }

  public void initContactCreation() {
    click(By.linkText("ADD_NEW"));
  }
}
