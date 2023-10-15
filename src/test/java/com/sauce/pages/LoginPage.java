package com.sauce.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class LoginPage extends BasePage {

    @FindBy(id = "loginLink")
    public WebElement login;

    @FindBy(id = "UserName")
    public WebElement userName;

    @FindBy(css = "#Password")
    public WebElement Password;

    @FindBy(xpath = "//input[@type='submit']")
    public WebElement loginBtn;

    public void login(String username,String password){
        login.click();
        userName.sendKeys(username);
        Password.sendKeys(password);
        loginBtn.click();

    }
}
