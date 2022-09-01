package com.testsikuli;

import org.junit.Assert;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;

public class BasePage {
    private final Screen screen;
    private Pattern pattern;
    
    public BasePage(Screen screen) {
        this.screen = screen;
    }
    
    public void click(String imgPath) throws FindFailed {
        pattern = new Pattern(imgPath);
        screen.wait(pattern, 5);
        screen.click(pattern);
    }
    
    public void verifyElement(String imgPath) throws FindFailed {
        screen.wait(pattern, 5);
        System.out.println(imgPath);
        if (screen.exists(imgPath) != null ){
            System.out.println("correct");
        } else {
            System.out.println("wrong");
        }
        Assert.assertTrue(String.valueOf(screen.find(imgPath)), true);
    }
}