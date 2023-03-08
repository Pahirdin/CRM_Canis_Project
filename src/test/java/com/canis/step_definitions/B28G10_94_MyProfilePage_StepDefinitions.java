package com.canis.step_definitions;

import com.canis.pages.MyProfilePage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebElement;

public class B28G10_94_MyProfilePage_StepDefinitions extends MyProfilePage{


    @When("user clicks on user profile")
    public void user_clicks_on_user_profile() {
        userProfile.click();
    }

    @When("user clicks on My Profile button")
    public void user_clicks_on_my_profile_button() {
        userMyProfile.click();
    }

    @Then("user should be able to see General Drive Tasks Calendar Conversations")
    public void user_should_be_able_to_see_general_drive_tasks_calendar_conversations() {

        for (WebElement eachModule : menuList) {
            System.out.println(eachModule.getText());
            Assert.assertTrue(eachModule.isDisplayed());
        }

    }
}
