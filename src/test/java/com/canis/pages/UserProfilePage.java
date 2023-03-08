package com.canis.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class UserProfilePage extends BasePage {

    @FindBy(className = "menu-popup-items")
    public WebElement userProfileOptions;

    @FindBy(id = "user-name")
    public WebElement userProfileIcon;


}
