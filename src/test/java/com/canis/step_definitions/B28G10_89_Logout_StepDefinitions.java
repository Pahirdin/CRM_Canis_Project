package com.canis.step_definitions;


import com.canis.pages.BasePage;
import com.canis.pages.LoginPage;
import com.canis.utilities.ConfigurationReader;
import com.canis.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class B28G10_89_Logout_StepDefinitions extends BasePage {
    LoginPage loginPage = new LoginPage();



    @Then("user clicks on username tab")
    public void user_clicks_on_username_tab() {
       userProfile.click();

    }
    @Then("user clicks on logout")
    public void user_clicks_on_logout() {
    logoutButton.click();
    }
    @Then("user is on the login page verification")
    public void user_is_on_the_login_page_verification() {

        loginPage.userLoginBox.isDisplayed();


    }


}
