package kzdyum.rpt.addressbook;

import org.testng.annotations.Test;

public class DeleteGroup extends TestBase {

  @Test
  public void testDeleteGroup() throws Exception {
    goToGroupsPage();
    selectGroup();
    deleteSelectedGroups();
    returnToGroupPage();
  }

}
