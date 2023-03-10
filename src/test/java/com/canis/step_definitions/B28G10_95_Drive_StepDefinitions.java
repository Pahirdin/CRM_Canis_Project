package com.canis.step_definitions;

import com.canis.pages.DrivePage;
import com.canis.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class B28G10_95_Drive_StepDefinitions extends DrivePage{

    DrivePage drivePage = new DrivePage();


    @When("user clicks on Drive module button")
    public void user_clicks_on_drive_module_button() {
       drivePage.driveButton.click();
    }
    @Then("user should go Drive page")
    public void user_should_go_drive_page() {
        String actualTitle = Driver.getDriver().getTitle();
        Assert.assertTrue(actualTitle.contains("Drive"));
    }
    @Then("user should see all six modules in Drive page")
    public void user_should_see_all_six_modules_in_drive_page() {
        Assert.assertTrue(myDriveButton.isDisplayed());
        Assert.assertTrue(allDocumentsButton.isDisplayed());
        Assert.assertTrue(companyDriveButton.isDisplayed());
        Assert.assertTrue(topManagementsDocumentsButton.isDisplayed());
        Assert.assertTrue(driveCleanupButton.isDisplayed());
    }//Update

    }








