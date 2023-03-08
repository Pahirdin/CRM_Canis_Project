package com.canis.pages;

import com.canis.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ChatAndCallsPage extends BasePage {

    public ChatAndCallsPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(xpath = "//div[@class='bx-desktop-tab-icon bx-desktop-tab-icon-im']")
    public WebElement messageButton;

    @FindBy(xpath = "//div[@class='bx-desktop-tab-icon bx-desktop-tab-icon-notify']")
    public WebElement notificationsButton;

    @FindBy(xpath = "//div[@class='bx-desktop-tab-icon bx-desktop-tab-icon-config']")
    public WebElement settingsButton;

    @FindBy(xpath = "//div[@class='bx-desktop-tab-icon bx-desktop-tab-icon-im-lf']")
    public WebElement activityStreamButton;
}
