package com.canis.step_definitions;

import com.canis.pages.BasePage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class B28G10_98_ConfigureMenu_StepDefinition {

    BasePage basePage = new BasePage();

    @When("user click configure menu")
    public void userClickConfigureMenu() {

        basePage.configureMenu.click();

    }

    @Then("user sees below options")
    public void userSeesBelowOptions() {

        Assert.assertTrue(basePage.configureMenuItems.isDisplayed());
        Assert.assertTrue(basePage.collapseMenu.isDisplayed());
        Assert.assertTrue(basePage.removeCurrentPageFromLeftMenu.isEnabled());
        Assert.assertTrue(basePage.addCustomMenuItem.isDisplayed());
        Assert.assertTrue(basePage.changePrimaryTool.isDisplayed());
        Assert.assertTrue(basePage.resetMenu.isDisplayed());

    }
}
