package poly.edu;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestCalculator {

    @Test 
    public void testSum() {
        Calculator calculator = new Calculator();
        Assert.assertEquals(calculator.sum(2, 3), 5);  // 2 + 3 = 5
    }

    @Test 
    public void testSub() {
        Calculator calculator = new Calculator();
        Assert.assertEquals(calculator.sub(5, 3), 2);  // 5 - 3 = 2
    }
}
