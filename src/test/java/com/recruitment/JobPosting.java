package com.recruitment;

import com.BaseClass.TestBase;
import org.testng.annotations.*;

public class JobPosting extends TestBase {
    String className = this.getClass().getSimpleName();

    @Test
    public void testCase1() {
        System.out.println("Normal Test Case - This is the A Normal Test Case in " + className);
    }

    @BeforeTest
    public void setUp(){
        className = getClassName();
    }
}
