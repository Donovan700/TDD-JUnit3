package src;

import junit.framework.TestResult;
import junit.framework.TestSuite;
import junit.textui.TestRunner;

public class CalculTestSuite {
    public static void main(String[] args) {
        // Method 1
        TestSuite suite = new TestSuite(CalculTest.class);
//        TestSuite suite = new TestSuite();
//        suite.addTest(new CalculTest());
        TestResult result = new TestResult();
        suite.run(result);

        // Method 2
        TestRunner.run(CalculTest.class);
        TestRunner.run(ParserDataTest.class);
    }
}
