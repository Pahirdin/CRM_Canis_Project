package com.canis.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CompanyPage extends BasePage {


    @FindBy(id="bx_left_menu_menu_about_sect")
    public WebElement companyLink;

    @FindBy (id = "top_menu_id_about")
    public WebElement topMenuModules;
}
