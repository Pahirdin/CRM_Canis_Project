package com.canis.step_definitions;

import com.canis.pages.ChatAndCallsPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class B28G10_93_ChatAndCalls_StepDefinitions extends ChatAndCallsPage {
    @When("User navigate to the Chat and Calls module")
    public void user_navigate_to_the_chat_and_calls_module() {
    chatAndCallsButton.click();
    }
    @Then("User should see a list of my submodules")
    public void user_should_see_a_list_of_my_submodules() {
        Assert.assertTrue(messageButton.isDisplayed());
        Assert.assertTrue(notificationsButton.isDisplayed());
        Assert.assertTrue(settingsButton.isDisplayed());
        Assert.assertTrue(activityStreamButton.isDisplayed());

    }
}

