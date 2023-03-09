package com.canis.pages;

import com.canis.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DrivePage extends BasePage {


    public DrivePage(){
        PageFactory.initElements(Driver.getDriver(),this);

}
    @FindBy(xpath = "//div[@id='top_menu_id_docs']/div[1]")
    public WebElement myDriveButton;

    @FindBy(xpath = "//div[@id='top_menu_id_docs']/div[2]")
    public WebElement allDocumentsButton;

    @FindBy(xpath = "//div[@id='top_menu_id_docs']/div[3]")
    public WebElement companyDriveButton;

    @FindBy(xpath = "//div[@id='top_menu_id_docs']/div[4]")
    public WebElement salesAndMarketingButton;

    @FindBy(xpath = "//div[@id='top_menu_id_docs']/div[5]")
    public WebElement topManagementsDocumentsButton;

    @FindBy( id = "top_menu_id_docs_menu_my_disk_volume")
    public WebElement driveCleanupButton;
}


