package com.linkedIn;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class GuestHomepage extends BasePage {

    public GuestHomepage(WebDriver driver){
        super(driver);
    }

    @FindBy(css = "#ember103.>.span")
    private WebElement userName;

    public String getUserName(){
        return userName.getText();
    }

}
