package com.testsikuli;

import com.testsikuli.pageobject.CalculatorPage;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.sikuli.script.ImagePath;
import org.sikuli.script.Screen;

public class BaseTest {
    private Screen screen;
    private WebDriver driver;
    protected CalculatorPage calculator;
    
    @Before
    public void openBrowser(){
        
        System.setProperty("webdriver.chrome.driver", "src/main/resources/driver/chromedriver.exe");
        ImagePath.add(System.getProperty("user.dir"));
        
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