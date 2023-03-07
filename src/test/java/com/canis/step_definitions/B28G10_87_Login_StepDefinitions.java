package com.canis.step_definitions;

import com.canis.pages.LoginPage;
import com.canis.utilities.ConfigurationReader;
import com.canis.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

import java.util.List;

public class B28G10_87_Login_StepDefinitions {

    LoginPage loginPage = new LoginPage();

    @Given("user is on the login page")
    public void user_is_on_the_login_page() {
        Driver.getDriver().get(ConfigurationReader.getProperty("url"));
    }

    @When("user login as {string}")
    public void user_login_as(String userType) {

        String username = "";
        String password = "";


        if (userType.equalsIgnoreCase("helpDesk")) {
            username = ConfigurationReader.getProperty("helpDesk_username");
            password = ConfigurationReader.getProperty("helpDesk_password");
        } else if (userType.equalsIgnoreCase("humanResources")) {
            username = ConfigurationReader.getProperty("humanResources_username");
            password = ConfigurationReader.getProperty("humanResources_password");
        } else if (userType.equalsIgnoreCase("marketing")) {
            username = ConfigurationReader.getProperty("marketing_username");
            password = ConfigurationReader.getProperty("marketing_password");
        }

        loginPage.login(username, password);


    }

    @Then("user should go to homepage")
    public void userShouldGoToHomepage() {

        String actualURL = Driver.getDriver().getCurrentUrl();
        Assert.assertTrue(actualURL.contains("stream"));

    }

    @When("user enter {string} or {string}")
    public void user_enter_or(String wrongUsername, String wrongPassword) {

        loginPage.login(wrongUsername, wrongPassword);

    }

    @Then("display “Incorrect username or password”")
    public void display_incorrect_username_or_password() {

        String expectedMessage = "Incorrect login or password";
        String actualMessage = loginPage.incorrectIogInPasswordMessage.getText();
        Assert.assertTrue(actualMessage.equals(expectedMessage));

    }


    @Given("user is already logged in to CRM as {string}")
    public void userIsAlreadyLoggedInToCRMAs(String userType) {

        Driver.getDriver().get(ConfigurationReader.getProperty("url"));

        String username = "";
        String password = "";


        if (userType.equalsIgnoreCase("helpDesk")) {
            username = ConfigurationReader.getProperty("helpDesk_username");
            password = ConfigurationReader.getProperty("helpDesk_password");
        } else if (userType.equalsIgnoreCase("humanResources")) {
            username = ConfigurationReader.getProperty("humanResources_username");
            password = ConfigurationReader.getProperty("humanResources_password");
        } else if (userType.equalsIgnoreCase("marketing")) {
            username = ConfigurationReader.getProperty("marketing_username");
            password = ConfigurationReader.getProperty("marketing_password");
        }

        loginPage.login(username, password);



    }

    @Given("user is already logged in to CRM as {string} \\(check all userType)")
    public void userIsAlreadyLoggedInToCRMAsCheckAllUserType(String userType) {

        Driver.getDriver().get(ConfigurationReader.getProperty("url"));

        String username = "";
        String password = "";


        if (userType.equalsIgnoreCase("helpDesk")) {
            username = ConfigurationReader.getProperty("helpDesk_username");
            password = ConfigurationReader.getProperty("helpDesk_password");
        } else if (userType.equalsIgnoreCase("humanResources")) {
            username = ConfigurationReader.getProperty("humanResources_username");
            password = ConfigurationReader.getProperty("humanResources_password");
        } else if (userType.equalsIgnoreCase("marketing")) {
            username = ConfigurationReader.getProperty("marketing_username");
            password = ConfigurationReader.getProperty("marketing_password");
        }

        loginPage.login(username, password);



    }

}


