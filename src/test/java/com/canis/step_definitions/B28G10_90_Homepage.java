package com.canis.step_definitions;

import com.canis.pages.HomepagePage;
import com.canis.pages.LoginPage;
import com.canis.utilities.BrowserUtils;
import com.canis.utilities.ConfigurationReader;
import com.canis.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class B28G10_90_Homepage {
    LoginPage loginPage= new LoginPage();
    HomepagePage homepagePage = new HomepagePage();

    @Given("user is on CRM home page as {string}")
    public void userIsOnCRMHomePageAs(String username) {
        Driver.getDriver().get(ConfigurationReader.getProperty("url"));
        loginPage.login(username);
    }
    @When("user scroll down to see the desktop client options")
    public void userScrollDownToSeeTheDesktopClientOptions() {
       Actions action = new Actions(Driver.getDriver());
       action.scrollToElement(homepagePage.desktopClientOptions).perform();



    }

    @Then("user should  be able to see {int} options for the desktop version")
    public void userShouldBeAbleToSeeOptionsForTheDesktopVersion(int arg0) {
    }
}
