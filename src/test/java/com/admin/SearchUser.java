package com.admin;

import com.BaseClass.TestBase;
import org.testng.annotations.*;

public class SearchUser extends TestBase {
    String className;

    @BeforeTest
    public void setUp(){
        className = getClassName();
    }

    @Test(priority = 1)
    public void testCaseOne() {
        System.out.println("Normal Test Case - This is the a Normal Test Case in " + className);
    }

    @Test(priority = 2)
    public void testCaseTwo() {
        System.out.println("Test Case Two Case in " + className);
    }


}
