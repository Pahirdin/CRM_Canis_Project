package com.canis.pages;

import com.canis.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

    LoginPage(){

        PageFactory.initElements(Driver.getDriver(),this);

    }

    @FindBy()
    public WebElement inputUsername;




}
