package homework_7;

import homework_7.mytesting.AfterSuite;
import homework_7.mytesting.BeforeSuite;
import homework_7.mytesting.Test;

public class ClassForTesting {
    @Test(priority = 5)
    public void testMethod1() {
        System.out.println("Test method priority = 5");
    }

    @Test(priority = 1)
    public void testMethod2() {
        System.out.println("Test method priority = 1");
    }

    @Test(priority = 10)
    public void testMethod3() {
        System.out.println("Test method priority = 10");
    }

    @Test(priority = 7)
    private void testMethod4() {
        System.out.println("Test method priority = 7 (private)");
    }

    @Test
    public void testMethod5() {
        System.out.println("Test method priority = default");
    }

    @AfterSuite
    public void afterMethod() {
        System.out.println("AfterSuite method");
    }

    @BeforeSuite
    public void beforeSuiteMethod() {
        System.out.println("BeforeSuite method");
    }

//    @BeforeSuite
//    public void beforeSuiteMethod2() {
//        System.out.println("BeforeSuite method");
//    }
}
