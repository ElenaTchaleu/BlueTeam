import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;



public class TaxTest {
    @Test
    public void test0(){
        Main tax1 = new Main();
        Assertions.assertEquals("Tax rate: 0% Calculated Tax: 0 Final Salary: 5000.0",
                tax1.taxCalculation(5000));
    }
    @Test
    public void testNegative(){
        Main tax1 = new Main();
        Assertions.assertEquals("Please try again",
                tax1.taxCalculation(-5000));
    }
    @Test
    public void test10(){
        Main tax1 = new Main();
        Assertions.assertEquals("Tax rate: 10% Calculated Tax: 1600.0 Final Salary: 14400.0",
                tax1.taxCalculation(16000));
    }
    @Test
    public void test15(){
        Main tax1 = new Main();
        Assertions.assertEquals("Tax rate: 15% Calculated Tax: 3975.0 Final Salary: 22525.0",
                tax1.taxCalculation(26500));
    }
    @Test
    public void test20(){
        Main tax1 = new Main();
        Assertions.assertEquals("Tax rate: 20% Calculated Tax: 7040.0 Final Salary: 28160.0",
                tax1.taxCalculation(35200));
    }
    @Test
    public void test25(){
        Main tax1 = new Main();
        Assertions.assertEquals("Tax rate: 25% Calculated Tax: 11875.0 Final Salary: 35625.0",
                tax1.taxCalculation(47500));
    }
    @Test
    public void testLowerBoundary(){
        Main tax1 = new Main();
        Assertions.assertEquals("Tax rate: 0% Calculated Tax: 0 Final Salary: 0.0",
                tax1.taxCalculation(0));
    }

    @Test
    public void testUpperBoundary(){
        Main tax1 = new Main();
        Assertions.assertEquals("Tax rate: 0% Calculated Tax: 0 Final Salary: 14999.0",
                tax1.taxCalculation(14999));
    }
    @Test
    public void testDecimals(){
        Main tax1 = new Main();
        Assertions.assertEquals("Tax rate: 10% Calculated Tax: 1770.05 Final Salary: 15930.45",
                tax1.taxCalculation(17700.50F));
    }
}
