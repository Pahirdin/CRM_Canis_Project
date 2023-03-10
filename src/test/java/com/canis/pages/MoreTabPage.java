package com.canis.pages;

import com.canis.utilities.Driver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class MoreTabPage extends LoginPage {

    public MoreTabPage() {PageFactory.initElements(Driver.getDriver(),this);}

    @FindBy(name = "USER_LOGIN")
    public WebElement logInBox;

    @FindBy(name = "USER_PASSWORD" )
    public WebElement passwordBox;

    @FindBy(xpath = "//input[@value='Log In']")
    public WebElement logInButton;

    @FindBy(xpath = "//span[@id='feed-add-post-form-link-text']")
    public WebElement moreButton;

    @FindBy(xpath = "//div[@class='menu-popup-items']/span[1]/span[2]" )
    public WebElement file;
    @FindBy(xpath = "//div[@class='menu-popup-items']/span[2]/span[2]" )
    public WebElement appreciation;
    @FindBy(xpath = "//div[@class='menu-popup-items']/span[3]/span[2]" )
    public WebElement announcement;
    @FindBy(xpath = "//div[@class='menu-popup-items']/span[4]/span[2]" )
    public WebElement workflow;

}
