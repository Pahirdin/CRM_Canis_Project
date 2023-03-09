package com.canis.pages;

import com.canis.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class B28G10_97_Ahmad {
    public B28G10_97_Ahmad(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy (xpath = "(//span[@class='menu-item-link-text'])[10]")
    public WebElement emplyeesTab;

    @FindBy (xpath = "//span[@class='main-buttons-item-text-title']")
    public List<WebElement> emplyeesTabs;


}
