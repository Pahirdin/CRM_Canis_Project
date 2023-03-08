package com.canis.step_definitions;

import com.canis.pages.LoginPage;
import com.canis.utilities.ConfigurationReader;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class B28G10_88_LoginSaveCredentials_StepDefinitions extends LoginPage {


    @When("user log in as {string}")
    public void userLogInAs(String userType) {
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
        userLoginBox.sendKeys(username);
        userPasswordBox.sendKeys(password);
    }

    @When("clicks on Remember me checkbox")
    public void clicks_on_remember_me_checkbox() {
        rememberMeCheckBox.click();
    }


    @Then("user should be able to save credentials")
    public void user_should_be_able_to_save_credentials() {
        Assert.assertTrue(rememberMeCheckBoxText.isDisplayed());
        Assert.assertTrue(rememberMeCheckBox.isSelected());

    }


    @And("user click SignIn button")
    public void userClickSignInButton() {
        loginButton.click();
    }
}
