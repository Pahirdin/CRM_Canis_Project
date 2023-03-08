package com.canis.step_definitions;

import com.canis.pages.HomepagePage;
import com.canis.pages.LoginPage;
import com.canis.utilities.BrowserUtils;
import com.canis.utilities.ConfigurationReader;
import com.canis.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

import java.util.List;

public class B28G10_90_Homepage {
    LoginPage loginPage = new LoginPage();
    HomepagePage homepagePage = new HomepagePage();

    @Given("User is on CRM home page as {string}")
    public void userIsOnCRMHomePageAs(String username) {
        Driver.getDriver().get(ConfigurationReader.getProperty("url"));
        loginPage.login(username);
    }

    @When("user scroll down to see the desktop client options")
    public void userScrollDownToSeeTheDesktopClientOptions() {
        Actions action = new Actions(Driver.getDriver());
        action.scrollToElement(homepagePage.desktopClientOptions).perform();

    }

    @Then("user should  be able to see three options for the desktop version")
    public void userShouldBeAbleToSeeOptionsForTheDesktopVersion(List<String> expectedOptions) {
        WebElement desktopClientOptions = homepagePage.desktopClientOptions;
        Assert.assertTrue(desktopClientOptions.isDisplayed());
        List<String> actualOptions = BrowserUtils.string_to_ListOfString(desktopClientOptions.getText());
        Assert.assertTrue(actualOptions.containsAll(expectedOptions));


    }


}
