package com.canis.step_definitions;

import com.canis.utilities.BrowserUtils;
import com.canis.utilities.ConfigurationReader;
import com.canis.utilities.Driver;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class Hooks {

    /*
    @Before
    public void setupMethod(){
        Driver.getDriver().get(ConfigurationReader.getProperty("url"));
    }

     */

    @After
    public void tearDownMethod(Scenario scenario){

        if(scenario.isFailed()) {

            byte[] screenshot = ((TakesScreenshot) Driver.getDriver()).getScreenshotAs(OutputType.BYTES);
            scenario.attach(screenshot, "image/png", scenario.getName());

        }

        BrowserUtils.sleep(2);
        Driver.closeDriver();

    }

}
