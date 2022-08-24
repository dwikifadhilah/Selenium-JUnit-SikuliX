package com.testsikuli;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.sikuli.script.Screen;

public class BaseTest {
    private Screen screen;
    private WebDriver driver;
    protected CalculatorPage calculator;
    
    @Before
    public void openBrowser(){
        
        System.setProperty("webdriver.chrome.driver", "D:\\Aplikasi\\Web Driver\\chromedriver.exe");
        
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.online-calculator.com/full-screen-calculator/");
        
        screen = new Screen();
        
        calculator = new CalculatorPage(screen);
    }
    
    @After
    public void closeBrowser(){
        driver.quit();
    }
}