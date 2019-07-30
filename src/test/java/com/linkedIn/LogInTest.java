package com.linkedIn;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;

public class LogInTest extends MainTest {

    private HomePage homePage;
    private LogInPage logInPage;
    private GuestHomepage guestHomepage;

    @Test
    public void testLogIn() {

        homePage = new HomePage(driver);
        logInPage = new LogInPage(driver);
        guestHomepage = new GuestHomepage(driver);

        homePage.clickSignInButton();
        logInPage.inputUserName("raidendemon77@gmail.com");
        logInPage.inputPassword("1q2w3e4r5t6y7u8i9o0p");
        guestHomepage = logInPage.clickSubmitButton();
        String  actualUserName = driver.findElement(By.cssSelector(".t-16.t-black.t-bold")).getText();
        System.out.println(actualUserName);
        String expectedTitle = "Kim Denis";
        Assert.assertEquals(expectedTitle, actualUserName);
    }
}
