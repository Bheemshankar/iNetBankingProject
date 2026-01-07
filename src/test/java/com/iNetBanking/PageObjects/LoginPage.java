package com.iNetBanking.PageObjects;

public class LoginPage {

    WebDriver ldriver;

    public LoginPage(WebDriver rdriver) {
        ldriver = rdriver;
        PageFactory.initElements(rdriver, this);
    }

    @FindBy(name="uid")
    @CacheLookup
    WebElement txtUserName;

    @FindBy(name="password")
    @CacheLookup
    WebElement txtPassword;

    @FindBy(name="btnLogin")
    @CacheLookup
    WebElement btnLogin;

    public void setTxtUserName(String uname) {
        txtUserName.sendKeys(uname);
    }

    public void setPassword(String pwd){
        txtPassword.sendKeys(pwd);
    }
    public void clickOnLoginBtn(){
        btnLogin.click();

    }

}
