package com.canis.utilities;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;

public class Driver {





    //Create a private constructor to remove access to this object

    private Driver(){}

    /*
    We make th WebDriver private, because we want to close access from outside the class
    We are making it static, because we will use it in a static method
     */

    // private static WebDriver driver;  // default value = null

    /*Create a re-usable utility method which will return the same driver instance once we call it.
    - If an instance doesn't exist, it will create first, and then it will always return same instance
     */

    private static InheritableThreadLocal<WebDriver> driverPool = new InheritableThreadLocal<>();


    public static WebDriver getDriver(){

        if(driverPool.get() == null){

            /*
            WE will read out browserType from configuration,properties file.
            this way we can control which browser is opened from outside our code.
             */

            String browserType = ConfigurationReader.getProperty("browser");

            /*
            Depending on the browserType returned from the configuration.properties
            switch statement wil determine the "case", and open the matching browser
             */


            switch (browserType){

                case "chrome":
                    // WebDriverManager.chromedriver().setup();
                    ChromeOptions options = new ChromeOptions();
                    options.addArguments("--remote-allow-origins=*");
                    driverPool.set(new ChromeDriver(options));
                    driverPool.get().manage().window().maximize();
                    driverPool.get().manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
                    break;

                case "firefox":
                    //  WebDriverManager.firefoxdriver().setup();
                    driverPool.set(new FirefoxDriver());
                    driverPool.get().manage().window().maximize();
                    driverPool.get().manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
                    break;

            }



        }

        return driverPool.get();


    }

    /*
    Create a new Driver.close(); it will use .quit() method to quit browsers, and then set the driver value back to bull.
     */

    public static void closeDriver(){
        if(driverPool.get()!=null){
            /*
            this line will terminate the currently existing driver completely.
            It will not exist going forward.
             */
            driverPool.get().quit();
            /*
            we assign the value back to "null" so that my "singleton" can  create a newer one if needed
             */
            driverPool.remove();
        }
    }



}
