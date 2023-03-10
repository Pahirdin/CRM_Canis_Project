package com.canis.step_definitions;

import com.canis.pages.EmployeePage;
import com.canis.pages.LoginPage;
import com.canis.utilities.BrowserUtils;
import com.canis.utilities.ConfigurationReader;
import com.canis.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Dimension;

import java.util.List;

public class B28G10_97_EmployeePage_StepDefinitions {

    EmployeePage employeePage = new EmployeePage();
    LoginPage loginPage = new LoginPage();
    @Given("User is already in ctisSolution page")
    public void user_is_already_in_ctis_solution_page() {

        Driver.getDriver().get(ConfigurationReader.getProperty("url"));
       //Driver.getDriver().get(ConfigurationReader.getProperty("url"));
        Driver.getDriver().manage().window().setSize(new Dimension(1980, 1320));
        loginPage.userLoginBox.sendKeys(ConfigurationReader.getProperty("helpDesk_username"));
        loginPage.userPasswordBox.sendKeys(ConfigurationReader.getProperty("helpDesk_password"));
        loginPage.loginButton.click();

    }
    @When("User click the employee page")
    public void user_click_the_employee_page() {
        employeePage.emplyeesTab.click();

    }

    @Then("User see all below modules")
    public void user_see_all_below_modules(List<String> expectedTab) {
        List<String>  actualTabs = BrowserUtils.getElementsText(employeePage.emplyeesTabs);


        System.out.println(actualTabs);
        System.out.println(expectedTab);

        Assert.assertEquals(expectedTab,actualTabs);

    }


}
