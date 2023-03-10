package com.canis.step_definitions;

import com.canis.pages.MoreTabPage;
import com.canis.utilities.ConfigurationReader;
import com.canis.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.w3c.dom.html.HTMLInputElement;

import javax.lang.model.SourceVersion;
import java.util.List;

public class B28G10_92_MoreTab_StepDefinitions {

    MoreTabPage moreTabPage = new MoreTabPage();

   /* @Given("user is on CRM home page as {string}")
    public void userIsOnCRMHomePageAs(String arg0) {
        Driver.getDriver().get(ConfigurationReader.getProperty("url"));
        moreTabPage.userLoginBox.sendKeys("helpdesk1@cybertekschool.com");
        moreTabPage.userPasswordBox.sendKeys("UserUser");
        moreTabPage.loginButton.click();
    }


    */

    @When("user clicks on more tab")
    public void userClicksOnMoreTab() {
        moreTabPage.moreButton.click();

    }

    @Then("four options should be displayed under the more tab")
    public void fourOptionsShouldBeDisplayedUnderTheMoreTab() {
        Assert.assertTrue( moreTabPage.file.isDisplayed());
        Assert.assertTrue( moreTabPage.appreciation.isDisplayed());
        Assert.assertTrue( moreTabPage.announcement.isDisplayed());
        Assert.assertTrue( moreTabPage.workflow.isDisplayed());


        }
    }

