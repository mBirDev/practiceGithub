package com.BaseClass;

import org.testng.annotations.*;

public class TestBase {

    public String getClassName() {
        String className = this.getClass().getSimpleName();
        return className;
    }

    @BeforeClass
    public void beforeClass(){
        System.out.println("Base class " + getClassName());
    }

    @BeforeMethod
    public void beforeMethod() {
        System.out.println("\t\t\tThis will execute before every Method in "+ getClassName());
    }

    @AfterMethod
    public void afterMethod() {
        System.out.println("\t\t\tThis will execute after every Method in "+ getClassName());
    }


    @AfterClass
    public void afterClass() {
        System.out.println("\t\tThis will execute after the Class in "+ getClassName());
    }

    @BeforeTest
    public void beforeTest() {
        System.out.println("\tThis will execute before the Test in "+ getClassName());
    }

    @AfterTest
    public void afterTest() {
        System.out.println("\tThis will execute after the Test in "+ getClassName());
    }

    @BeforeSuite
    public void beforeSuite() {
        System.out.println("This will execute before the Test Suite in "+getClassName());
    }

    @AfterSuite
    public void afterSuite() {
        System.out.println("This will execute after the Test Suite in "+ getClassName());
    }
}
