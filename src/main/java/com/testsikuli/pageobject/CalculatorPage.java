package com.testsikuli.pageobject;

import org.sikuli.script.FindFailed;
import org.sikuli.script.Screen;

public class CalculatorPage extends BasePage{
    public CalculatorPage(Screen screen) {
        super(screen);
    }
    
    private final String buttonComma = "src/main/resources/image/Button Comma.png";
    private final String buttonZero = "src/main/resources/image/Button 0.png";
    private final String buttonOne = "src/main/resources/image/Button 1.png";
    private final String buttonTwo = "src/main/resources/image/Button 2.png";
    private final String buttonFour = "src/main/resources/image/Button 4.png";
    private final String buttonFive = "src/main/resources/image/Button 5.png";
    private final String buttonEight = "src/main/resources/image/Button 8.png";
    private final String buttonMultiplication = "src/main/resources/image/Button Times.png";
    private final String buttonDivition = "src/main/resources/image/Button Div.png";
    private final String buttonPlus = "src/main/resources/image/Button Plus.png";
    private final String buttonMinus = "src/main/resources/image/Button Subtraction.png";
    private final String buttonEquals = "src/main/resources/image/Button Equals.png";
    private final String mulResults = "src/main/resources/image/Results Mul.png";
    private final String divResults = "src/main/resources/image/Results Div.png";
    private final String sumResults = "src/main/resources/image/Results Sum.png";
    private final String subtractionResults = "src/main/resources/image/Results Subtraction.png";
    
    /**Multiplication*/
    public CalculatorPage multiplication() throws FindFailed {
        click(buttonTwo);
        click(buttonMultiplication);
        click(buttonEight);
        click(buttonEquals);
        return this;
    }
    public void verifyMultiplicationResult() throws FindFailed {
        verifyElement(mulResults);
    }
    
    /**Division*/
    public CalculatorPage division() throws FindFailed {
        click(buttonOne);
        click(buttonTwo);
        click(buttonFive);
        click(buttonDivition);
        click(buttonFour);
        click(buttonEquals);
        return this;
    }
    public void verifyDivideResult() throws FindFailed {
        verifyElement(divResults);
    }
    
    /**Sum*/
    public CalculatorPage sum() throws FindFailed {
        click(buttonEight);
        click(buttonZero);
        click(buttonComma);
        click(buttonFive);
        click(buttonPlus);
        click(buttonFour);
        click(buttonComma);
        click(buttonFive);
        click(buttonEquals);
        return this;
    }
    public void verifySumResult() throws FindFailed {
        verifyElement(sumResults);
    }
    
    /**Subtraction*/
    public CalculatorPage subtraction() throws FindFailed {
        click(buttonFive);
        click(buttonTwo);
        click(buttonComma);
        click(buttonEight);
        click(buttonMinus);
        click(buttonEight);
        click(buttonZero);
        click(buttonEquals);
        return this;
    }
    public void verifySubtractionResult() throws FindFailed {
        verifyElement(subtractionResults);
    }
}