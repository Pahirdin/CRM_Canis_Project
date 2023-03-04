package com.canis.pages;

import com.canis.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public abstract class BasePage {

    public BasePage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }



    @FindBy(xpath = "//span[@id='user-name']")
    public WebElement userProfile;

    @FindBy(xpath = "//span[.='Log out']")
    public WebElement logoutButton;

    @FindBy(xpath = "//span[contains(., 'Chat and Calls')]")
    public WebElement chatAndCallsButton;

    @FindBy(xpath = "//div[@class='bx-desktop-appearance-tab']")
    public List<WebElement> chatAndCallsMenu;

    @FindBy(xpath = "//div[@title='Message(s) ']")
    public WebElement messageModule;

    @FindBy(xpath = "//div[@title='Notifications']")
    public WebElement notificationModule;

    @FindBy(xpath = "//div[@title='Settings']")
    public WebElement settingsModule;

    @FindBy(xpath = "//div[@title='Activity Stream ']")
    public WebElement activeStreamModule;

    @FindBy(xpath = "//div[@class='menu-popup']")
    public List<WebElement> userProfileMenu;

    @FindBy(xpath = "//span[.='Send message …']")
    public WebElement sendMessageText;

    @FindBy(xpath = "//div[@class='feed-add-post-micro']")
    public WebElement sendMessageBox;

    @FindBy(xpath = "//button[@id='blog-submit-button-save']")
    public WebElement sendMessageButton;

    @FindBy(xpath = "//span[@class='feed-add-info-text']")
    public WebElement titleIsNotSpecifiedMessage;

    @FindBy(xpath = "//span[@id='feed-add-post-form-link-text']")
    public WebElement moreButtonHomePage;

    @FindBy(xpath = "//div[@class='menu-popup-items']")
    public List<WebElement> moreButtonHomepageElements;








}
