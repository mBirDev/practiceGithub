package com.admin;

import com.BaseClass.TestBase;
import org.testng.annotations.*;

public class AddUser extends TestBase {
    String className;
    @BeforeTest
    public void setUp(){
        className = getClassName();
    }
    @Test(priority = 1, description = "First Test Case")
    public void testCaseOne() {
        System.out.println("This is the a normal Test Case in " + className);
    }
    @Test(priority = 2, enabled = true)
    public void testCaseTwo() {
        System.out.println("This is the a second Test Case in " + className);
    }

    @Test(priority = 3)
    public void testCaseThree() {
        System.out.println("This is the a third Test Case in " + className);
    }

}
