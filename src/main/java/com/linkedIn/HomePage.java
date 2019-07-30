package com.linkedIn;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage {
    public HomePage(WebDriver driver){
        super(driver);
    }

    @FindBy(css = ".nav__button-secondary")
    public WebElement signInButton;

    public GuestHomepage clickSignInButton(){
        signInButton.click();
        return new GuestHomepage(driver);
    }
}
