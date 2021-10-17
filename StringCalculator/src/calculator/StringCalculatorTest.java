package calculator;

import static org.junit.Assert.*;

import org.junit.Test;

public class StringCalculatorTest {

	private StringCalculator calculator;



   @Test
   void empty_string_should_return_0() {
       StringCalculator stringCalculator = new StringCalculator();
       assertEquals(0, stringCalculator.add(""));
   }

   
   
   
   @Test
   public void numberStringShouldReturnSameNumber() {
       StringCalculator stringCalculator = new StringCalculator();
       assertEquals(1, stringCalculator.add("1"));
       assertEquals(calculator.add("5"), 5);
   }
   @Test
   public void numbersCommaDelimitedShouldBeSummed() {
       assertEquals(calculator.add("1,2"), 3);
       assertEquals(25, calculator.add("10,15"));
   }
   

  

}
