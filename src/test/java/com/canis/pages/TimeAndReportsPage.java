package com.canis.pages;

import com.canis.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TimeAndReportsPage extends BasePage{



    public TimeAndReportsPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//span[.='Absence Chart'][1]")
    public WebElement absenceChartButton;

    @FindBy(xpath = "//span[.='Worktime']")
    public WebElement worktimeButton;

    @FindBy(xpath = "//span[.='Bitrix24.Time']")
    public WebElement bitrix24_TimeButton;

    @FindBy(xpath = "//span[.='Work Reports']")
    public WebElement workReportsButton;

    @FindBy(xpath = "//span[.='Meetings and Briefings']")
    public WebElement meetingsAndBriefingsButton;


}
