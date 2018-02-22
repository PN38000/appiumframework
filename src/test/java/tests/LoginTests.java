package tests;

import models.User;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pages.*;
import framework.Utils;

import static framework.AppiumController.OS.ANDROID;
import static framework.AppiumController.OS.IOS;
import static framework.AppiumController.executionOS;
import static models.UserBuilder.userWithTransactions;

public class LoginTests extends BaseTestClass {

    @Test(priority = 1)
    public void goToLoginScreen() throws InterruptedException {
        languagepage.acceptAlertOnIOS();
        languagepage.selectLanguageAndCheckIcon(0);
        Utils.clickOnElementAndCheckText(languagepage.nextButton, islandpage.topText, "Please choose your country");
        islandpage.selectIslandAndCheckIcon(2);
        Utils.clickOnElementAndCheckText(islandpage.nextButton, selectionpage.topText, "What kind of member are you?");
        Utils.clickOnElement(selectionpage.loginButton);
    }

    @Test(priority = 2)
    public void checkLocalization(){
        Utils.checkTextOfElement(loginpage.usernameTitle,"Username");
        Utils.checkTextOfElement(loginpage.passwordTitle, "Password");
        Utils.checkTextOfElement(loginpage.loginButton, "LOGIN");
        Utils.checkTextOfElement(loginpage.forgotLink, "Forgot your password?");
        Utils.checkTextOfElement(loginpage.registerLink, "No Fun Miles account? Please register your card.");
    }

    @Test(priority = 3)
    public void loginWitIncorrectPassword() {
        String username = user.getUsername();
        String password = user.getPassword()+"123";
        loginpage.loginMethod(username,password);
        Utils.checkTextOfElement(loginpage.errorMessage,"Oops, Unknown combination, please try again.");
    }

    @Test(priority = 4)
    public void loginWithIncorrectUserName() {
        String username = user.getUsername()+"123";
        String password = user.getPassword();
        loginpage.loginMethod(username,password);
        Utils.checkTextOfElement(loginpage.errorMessage,"Oops, Unknown combination, please try again.");
    }

    @Test(priority = 5)
    public void forgotPassLink() throws InterruptedException {
        if(executionOS == ANDROID){
           Utils.clickOnElementAndCheckText(loginpage.forgotLink,loginpage.forgotPageUrl, "https://www.funmiles.net/#/forgotpassword");
        }else if(executionOS == IOS){
            driver().hideKeyboard();
            loginpage.forgotLink.isEnabled();
        }
    }

    @Test(priority = 6)
    public void backToSelectionScreen() throws InterruptedException {
        if(executionOS == ANDROID){
            Utils.returnBackAndroid();
        }

        Utils.elementDisplayed(loginpage.loginButton);
        Utils.clickOnElementAndCheckText(loginpage.registerLink, selectionpage.topText, "What kind of member are you?");
        Utils.clickOnElementAndCheckText(selectionpage.loginButton, loginpage.forgotLink, "Forgot your password?");
    }

    @Test(priority = 7, dependsOnMethods = "goToLoginScreen")
    public void correctLogin() throws InterruptedException {
        String username = user.getUsername();
        String password = user.getPassword();
        loginpage.loginMethod(username,password);
        if(executionOS == ANDROID) {
            Thread.sleep(10000);
            Utils.checkTextOfElement(homepage.locationPermissionMessage, "Allow Fun Miles to access this device's location?");
        }
    }


}
