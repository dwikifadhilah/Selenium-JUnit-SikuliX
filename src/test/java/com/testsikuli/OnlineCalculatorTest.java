package com.testsikuli;

import org.junit.Test;
import org.sikuli.script.FindFailed;

public class OnlineCalculatorTest extends BaseTest{
    
    @Test
    public void multiplicationTest() throws FindFailed {
        calculator
              .multiplication()
              .verifyMultiplicationResult();
    }
    
    @Test
    public void divisionTest() throws FindFailed {
        calculator
              .division()
              .verifyDivideResult();
    }
    
    @Test
    public void sumTest() throws FindFailed {
        calculator
              .sum()
              .verifySumResult();
    }
    
    @Test
    public void subtractionTest() throws FindFailed {
        calculator
              .subtraction()
              .verifySubtractionResult();
    }
}