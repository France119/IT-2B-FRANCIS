spackage labtest;

import java.util.ArrayList;
import java.util.Date;


public class LABTEST {

   
    public static void main(String[] args) {
     

    class LabTest {
   
      private static int idCounter = 1; 
    private final int testId;
    private final String testName;
    private final Date testDate;
    private final String testResult;

    // Constructor
    public LabTest(String testName, Date testDate, String testResult) {
        this.testId = idCounter++;
        this.testName = testName;
        this.testDate = testDate;
        this.testResult = testResult;
    }

    
    public int getTestId() {
        return testId;
    }

    public String getTestName() {
        return testName;
    }

    public Date getTestDate() {
        return testDate;
    }

    public String getTestResult() {
        return testResult;
    }

    Override
     
    public String toString() {
        return "LabTest{" +
                "testId=" + testId +
                ", testName='" + testName + '\'' +
                ", testDate=" + testDate +
                ", testResult='" + testResult + '\'' +
                '}';
    }
}

     class LabTestManager {
      private final ArrayList<LabTest> tests;

     public LabTestManager() {
         tests = new ArrayList<>();
    }

    public void addTest(String testName, Date testDate, String testResult) {
        LabTest test = new LabTest(testName, testDate, testResult);
        tests.add(test);
    }

    public void displayTests() {
        tests.forEach((test) -> {
            System.out.println(test);
          });
    }
}

     public class Main {
     public static void main(String[] args) {
        LabTestManager manager = new LabTestManager();
        
        // Example usage
        manager.addTest("Blood Test", new Date(), "Normal");
        manager.addTest("X-Ray", new Date(), "No Issues");
        
        System.out.println("Lab Tests:");
        manager.displayTests();
    }
}

    }
    

