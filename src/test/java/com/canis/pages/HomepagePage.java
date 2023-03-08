package com.canis.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomepagePage extends BasePage {
   @FindBy (css = ".b24-app-block.b24-app-desktop")
    public WebElement desktopClientOptions;


}
