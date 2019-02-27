package kzdyum.rpt.addressbook;

import org.testng.annotations.Test;

public class GroupCreationTest extends TestBaseGroup {

  @Test
  public void testGroupCreation() throws Exception {
    goToGroupsPage();
    initGroupCreation();
    fillGroupForm(new GroupData("test2", "test3", "test4"));
    submitGroupCreation();
    returnToGroupPage();
  }

}
