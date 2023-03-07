package com.canis.step_definitions;

import com.canis.pages.BasePage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class B28G10_98_ConfigureMenu_StepDefinition {

    BasePage basePage = new BasePage();

    @When("user click configure menu")
    public void userClickConfigureMenu() {

        basePage.configureMenu.click();

    }

    @Then("user sees below options")
    public void userSeesBelowOptions() {

        basePage.configureMenuItems.isDisplayed();
        basePage.collapseMenu.isDisplayed();
        basePage.removeCurrentPageFromLeftMenu.isDisplayed();
        basePage.addCustomMenuItem.isDisplayed();
        basePage.changePrimaryTool.isDisplayed();
        basePage.resetMenu.isDisplayed();

    }
}
