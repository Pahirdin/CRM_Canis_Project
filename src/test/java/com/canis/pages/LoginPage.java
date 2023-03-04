package com.canis.pages;

import com.canis.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

    public LoginPage(){

        PageFactory.initElements(Driver.getDriver(),this);

    }

    @FindBy(xpath = "//input[@name='USER_LOGIN']")
    public WebElement userLoginBox;

    @FindBy(xpath = "//input[@name='USER_PASSWORD']")
    public WebElement userPasswordBox;

    @FindBy(xpath = "//input[@class='login-btn']")
    public WebElement loginButton;

    @FindBy(xpath = "//div[@class='errortext']")
    public WebElement incorrectIogInPasswordMessage;

    @FindBy(xpath = "//label[.='Remember me on this computer']")
    public WebElement rememberMeCheckBoxText;

    @FindBy(xpath = "//input[@name='USER_REMEMBER']")
    public WebElement rememberMeCheckBox;

    @FindBy(xpath = "//a[.='Forgot your password?']")
    public WebElement forgotPassword;

    /**
     * This method will log in with below credential
     * @username : Test
     * @password : Tester
     */

    public void login(){
        this.userLoginBox.sendKeys("Test");
        this.userPasswordBox.sendKeys("Tester");
        this.loginButton.click();
    }


    public void login(String username, String password){
        this.userLoginBox.sendKeys(username);
        this.userPasswordBox.sendKeys(password);
        this.loginButton.click();
    }




}
