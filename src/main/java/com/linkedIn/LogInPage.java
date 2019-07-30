package com.linkedIn;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LogInPage extends BasePage {

    public LogInPage(WebDriver driver){
        super(driver);
    }

    @FindBy(css = "#username")
    private WebElement emailOrPhoneField;

    @FindBy(css = "#password")
    private WebElement passwordField;

    @FindBy(css = "button[type=\"submit\"]")
    private WebElement submitButton;

    public GuestHomepage clickSubmitButton(){
        submitButton.click();
        return new GuestHomepage(driver);
    }

    public void inputPassword(String password){
        passwordField.sendKeys(password);
    }

    public void inputUserName(String name){
        emailOrPhoneField.sendKeys(name);
    }
}
