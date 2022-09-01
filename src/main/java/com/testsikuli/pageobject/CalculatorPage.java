package com.testsikuli;

import org.sikuli.script.FindFailed;
import org.sikuli.script.Screen;

public class CalculatorPage extends BasePage{
    public CalculatorPage(Screen screen) {
        super(screen);
    }
    
    private final String buttonComma = "D:\\QA\\Project Java\\SikuliTests\\image\\Button Comma.png";
    private final String buttonZero = "D:\\QA\\Project Java\\SikuliTests\\image\\Button 0.png";
    private final String buttonOne = "D:\\QA\\Project Java\\SikuliTests\\image\\Button 1.png";
    private final String buttonTwo = "D:\\QA\\Project Java\\SikuliTests\\image\\Button 2.png";
    private final String buttonFour = "D:\\QA\\Project Java\\SikuliTests\\image\\Button 4.png";
    private final String buttonFive = "D:\\QA\\Project Java\\SikuliTests\\image\\Button 5.png";
    private final String buttonEight = "D:\\QA\\Project Java\\SikuliTests\\image\\Button 8.png";
    private final String buttonMultiplication = "D:\\QA\\Project Java\\SikuliTests\\image\\Button Times.png";
    private final String buttonDivition = "D:\\QA\\Project Java\\SikuliTests\\image\\Button Div.png";
    private final String buttonPlus = "D:\\QA\\Project Java\\SikuliTests\\image\\Button Plus.png";
    private final String buttonMinus = "D:\\QA\\Project Java\\SikuliTests\\image\\Button Subtraction.png";
    private final String buttonEquals = "D:\\QA\\Project Java\\SikuliTests\\image\\Button Equals.png";
    private final String mulResults = "D:\\QA\\Project Java\\SikuliTests\\image\\Results Mul.png";
    private final String divResults = "D:\\QA\\Project Java\\SikuliTests\\image\\Results Div.png";
    private final String sumResults = "D:\\QA\\Project Java\\SikuliTests\\image\\Results Sum.png";
    private final String subtractionResults = "D:\\QA\\Project Java\\SikuliTests\\image\\Results Subtraction.png";
    
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