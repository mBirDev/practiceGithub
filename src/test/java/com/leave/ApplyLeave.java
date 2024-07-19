package com.leave;

import com.BaseClass.TestBase;
import org.testng.annotations.*;

public class ApplyLeave extends TestBase {
    String className;
    @BeforeTest
    public void setUp(){
        className = getClassName();
    }
    @Test(priority = 1)
    public void testCaseOne() {
        System.out.println("This is the a Normal Test Case in " + className);
    }
    @Test(priority = 2)
    public void testCaseTwo() {
        System.out.println("This is the a Two Test Case in " + className);
    }

    @Test(priority = 3)
    public void testCaseThree() {
        System.out.println("This is the a Three Test Case in " + className);
    }



}
