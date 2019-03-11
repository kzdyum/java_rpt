package kzdyum.rpt.addressbook.tests;

import kzdyum.rpt.addressbook.model.ContactData;
import org.testng.annotations.Test;

public class ContactCreationTest extends TestBase {

  @Test
  public void testContactCreation() throws Exception {
    app.getContactHelper().initContactCreation();
    app.getContactHelper().fillContactForm(new ContactData(
      "Ekaterina",
      "A",
      "Zdyumayeva",
      "202a, Minusinska str., Dnipro, Ukraine, 49000",
      "0667519212",
      "kzdyum@gmail.com"));
    app.getContactHelper().submitContactForm();
  }

}
