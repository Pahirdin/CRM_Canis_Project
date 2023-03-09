package com.canis.step_definitions;

import com.canis.pages.TimeAndReportsPage;
import com.canis.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;


public class B28G10_96_TimeAndReport_StepDefinitions extends TimeAndReportsPage{



    @When("user clicks on Time and Reports module")
    public void user_clicks_on_time_and_reports_module() {
        timeAndReports.click();
    }
    @Then("user should go Time and Reports page")
    public void user_should_go_time_and_reports_page() {
        String actualTitle = Driver.getDriver().getTitle();
        Assert.assertTrue(actualTitle.contains("Absence Chart"));
    }
    @Then("user should see all modules in Time and Reports page")
    public void user_should_see_all_modules_in_time_and_reports_page() {
        Assert.assertTrue(absenceChartButton.isDisplayed());
        Assert.assertTrue(worktimeButton.isDisplayed());
        Assert.assertTrue(bitrix24_TimeButton.isDisplayed());
        Assert.assertTrue(workReportsButton.isDisplayed());
        Assert.assertTrue(meetingsAndBriefingsButton.isDisplayed());
    }
}
