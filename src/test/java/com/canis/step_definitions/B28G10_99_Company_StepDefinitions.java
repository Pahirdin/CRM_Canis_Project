package com.canis.step_definitions;

import com.canis.pages.CompanyPage;
import com.canis.pages.LoginPage;
import com.canis.utilities.BrowserUtils;
import com.canis.utilities.ConfigurationReader;
import com.canis.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebElement;

import java.util.List;

public class B28G10_99_Company_StepDefinitions {
    LoginPage loginPage = new LoginPage();

    CompanyPage companyPage = new CompanyPage();


    @Given("user is already logged in to CRM")
    public void userIsAlreadyLoggedInToCRM() {
        Driver.getDriver().get(ConfigurationReader.getProperty("url"));
        loginPage.login("helpDesk");
    }
    @When("user clicks on the Company page")
    public void userClicksOnTheCompanyPage() {
        companyPage.companyLink.click();
    }

    @Then("users see the seven modules in the Company page shown as design")
    public void usersSeeTheSevenModulesInTheCompanyPageShownAsDesign(List<String> expectedResult) {
        WebElement topMenuModules = companyPage.topMenuModules;
        Assert.assertTrue(topMenuModules.isDisplayed());
        List<String> actualResult = BrowserUtils.string_to_ListOfString(topMenuModules.getText());
        Assert.assertTrue(actualResult.containsAll(expectedResult));
    }


}
