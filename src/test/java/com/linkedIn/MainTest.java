package com.linkedIn;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public abstract class MainTest {

    protected WebDriver driver;

    @Before
//    @Test
    public void mainTest(){

        System.setProperty("webdriver.chrome.driver", "/Users/deniskim/Downloads/chromedriver");

        driver = new ChromeDriver();
        driver.manage().window().fullscreen();
        driver.get("https://www.linkedin.com/");
        System.out.println("Start");
        String aqtualTitle = driver.getTitle();
        System.out.println(aqtualTitle);
        String expectedTitle = "LinkedIn: Log In or Sign Up";
        Assert.assertEquals(expectedTitle, aqtualTitle);
    }

    @After
    public void quit(){
        System.out.println("Finish");
//        driver.quit();
    }
}
