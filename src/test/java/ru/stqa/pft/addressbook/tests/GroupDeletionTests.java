package ru.stqa.pft.addressbook.tests;

import org.testng.annotations.Test;

public class GroupDeletionTests extends TestBase {


    @Test
    public void testGroupDeletion() {
       app.gotoGroupPage();
        app.getGroupHelper().SelectGroup();
        app.getGroupHelper().DeleteSelectedGroups();
        app.getGroupHelper().returnToGroupPage();
    }


}
