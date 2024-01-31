package testing;

import org.testng.Assert;
import org.testng.annotations.Test;

import javabasics.Calculator;

public class CalculatorTest {
  @Test
  public void testAdd() {
	  int num1=100;
	  int num2=200;
	  int expectedresult = num1+num2;
	  Calculator calc = new Calculator();
	  int actualresult = calc.add(num1, num2);
	  Assert.assertEquals(actualresult, expectedresult);
  }
}
