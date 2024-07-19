package com.leave;

import org.testng.annotations.*;

public class MyLeave {
    String className = this.getClass().getSimpleName();

    @Test
    public void testCase1() {
        System.out.println("Normal Test Case - This is the A Normal Test Case in " + className);
    }

    @BeforeMethod
    public void beforeMethod() {
        System.out.println("\t\t\tThis will execute before every Method in "+ className);
    }

    @AfterMethod
    public void afterMethod() {
        System.out.println("\t\t\tThis will execute after every Method in "+ className);
    }

    @BeforeClass
    public void beforeClass() {
        System.out.println("\t\tThis will execute before the Class in "+ className);
    }

    @AfterClass
    public void afterClass() {
        System.out.println("\t\tThis will execute after the Class in "+ className);
    }

    @BeforeTest
    public void beforeTest() {
        System.out.println("\tThis will execute before the Test in "+ className);
    }

    @AfterTest
    public void afterTest() {
        System.out.println("\tThis will execute after the Test in "+ className);
    }

    @BeforeSuite
    public void beforeSuite() {
        System.out.println("This will execute before the Test Suite in "+ className);
    }

    @AfterSuite
    public void afterSuite() {
        System.out.println("This will execute after the Test Suite in "+ className);
    }
}
