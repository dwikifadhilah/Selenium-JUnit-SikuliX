# SikuliTests

## Online Calculator Testing Using Junit, Selenium and Sikuli.

##### Web URL : https://www.online-calculator.com/full-screen-calculator/
##### Java Version : 1.8
##### Selenium version : 4.4.0
##### JUnit Version : 4.13.2
##### SikuliX version : 2.0.4

## How To Run Using Firefox
1. Change property on file BaseTest.java
```java
System.setProperty("webdriver.gecko.driverr", "src/main/resources/driver/firefoxdriver.exe");
driver = new FirefoxDriver();
```
2. Run on OnlineCalculatorTest.java
