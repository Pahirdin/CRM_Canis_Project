package com.canis.step_definitions;

import com.canis.pages.LoginPage;
import com.canis.pages.UserProfilePage;
import com.canis.utilities.BrowserUtils;
import com.canis.utilities.ConfigurationReader;
import com.canis.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebElement;

import java.util.List;

public class B28G10_91_UserProfile_StepDefinitions {
    LoginPage loginPage = new LoginPage();
    UserProfilePage userProfilePage = new UserProfilePage();

    @Given("user is on CRM home page as {string}")
    public void userIsOnCRMHomePageAs(String username) {
        Driver.getDriver().get(ConfigurationReader.getProperty("url"));
        loginPage.login(username);
    }

    @When("user clicks on user profile icon")
    public void userClicksOnUserProfileIcon() {
        userProfilePage.userProfileIcon.click();

    }

    @Then("five options should be displayed under the user profile")
    public void fiveOptionsShouldBeDisplayedUnderTheUserProfile(List<String> list) {
        WebElement userProfileOptions = userProfilePage.userProfileOptions;
        String actualOptions = userProfileOptions.getText();
        String expectedOptions = BrowserUtils.listOfString_to_String(list);
        Assert.assertTrue(userProfileOptions.isDisplayed());
        Assert.assertEquals(expectedOptions, actualOptions);


    }
}
