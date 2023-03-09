package com.canis.step_definitions;

import com.canis.pages.BasePage;
import com.canis.pages.DrivePage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class B28G10_DriveStepDefinitions_Syed extends BasePage{

    DrivePage drivePage = new DrivePage();
    @When("user clicks on Drive module button")
    public void user_clicks_on_drive_module_button() {
       drivePage.driveButton.click();
    }
    @Then("user should go Drive page")
    public void user_should_go_drive_page() {

    }
    @Then("user should see all six modules in Drive page")
    public void user_should_see_all_six_modules_in_drive_page() {

    }







}
