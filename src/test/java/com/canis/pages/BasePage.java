package com.canis.pages;

import com.canis.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class BasePage {

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

    @FindBy(xpath = "//span[contains(., 'Time and Reports')]")
    public WebElement timeAndReports;

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

    @FindBy(xpath = "//span[@class='menu-items-title-text']")
    public WebElement configureMenu;

    @FindBy(xpath = "//div[@class='menu-popup-items']/span/span[2]")
    public WebElement configureMenuItems;

    @FindBy(xpath = "//div[@class='menu-popup-items']/span[2]/span[2]")
    public WebElement collapseMenu;

    @FindBy(xpath = "//div[@class='menu-popup-items']/span[3]/span[2]")
    public WebElement removeCurrentPageFromLeftMenu;

    @FindBy(xpath = "//div[@class='menu-popup-items']/span[4]/span[2]")
    public WebElement addCustomMenuItem;

    @FindBy(xpath = "//div[@class='menu-popup-items']/span[5]/span[2]")
    public WebElement changePrimaryTool;

    @FindBy(xpath = "//div[@class='menu-popup-items']/span[6]/span[2]")
    public WebElement resetMenu;










}
