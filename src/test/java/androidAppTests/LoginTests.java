package androidAppTests;

import framework.BaseTest;
import models.User;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pagesAndroid.*;
import framework.Utils;

import static models.UserBuilder.userWithTransactions;

public class LoginTests extends BaseTest {

    LanguagePageAndroid languagepage;
    IslandPageAndroid islandpage;
    SelectionPageAndroid selectionpage;
    LoginPageAndroid loginpage;
    HomePageAndroid homepage;
    User user;

    @BeforeTest
    public void beforemethod() {
        user = userWithTransactions();
        languagepage = new LanguagePageAndroid();
        islandpage = new IslandPageAndroid();
        selectionpage = new SelectionPageAndroid();
        loginpage = new LoginPageAndroid();
        homepage = new HomePageAndroid();
    }

    @Test(priority = 1)
    public void goToLoginScreen(){
        Utils.selectElement(0,languagepage.language,languagepage.selectedMark);
        Utils.clickOnElementAndCheckText(languagepage.nextButton, islandpage.topText, "Please choose your country");
        Utils.selectElement(2,islandpage.island,islandpage.selectedMark);
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
    public void loginWitIncorrectPassword() throws InterruptedException {
        String username = user.getUsername();
        String password = user.getPassword()+"123";
        loginpage.loginMethod(username,password);
        Utils.checkTextOfElement(loginpage.errorMessage,"Oops, Unknown combination, please try again.");
    }

    @Test(priority = 4)
    public void loginWithIncorrectUserName() throws InterruptedException {
        String username = user.getUsername()+"123";
        String password = user.getPassword();
        loginpage.loginMethod(username,password);
        //Utils.checkTextOfElement(loginpage.errorMessage,"Oops, Unknown combination, please try again.");
    }

    @Test(priority = 5)
    public void forgotPassLink() throws InterruptedException {
        Thread.sleep(10000);
        Utils.clickOnElementAndCheckText(loginpage.forgotLink,loginpage.forgotPageUrl, "https://www.funmiles.net/#/forgotpassword");
    }

    @Test(priority = 6)
    public void backToSelectionScreen(){
        Utils.returnBack();
        Utils.elementDisplayed(loginpage.loginButton);
        Utils.clickOnElementAndCheckText(loginpage.registerLink, selectionpage.topText, "What kind of member are you?");
        Utils.clickOnElementAndCheckText(selectionpage.loginButton, loginpage.forgotLink, "Forgot your password?");
    }

    @Test(priority = 7, dependsOnMethods = "goToLoginScreen")
    public void correctLogin() throws InterruptedException {
        String username = user.getUsername();
        String password = user.getPassword();
        loginpage.loginMethod(username,password);
        Thread.sleep(10000);
        Utils.checkTextOfElement(homepage.locationPermissionMessage,"Allow Fun Miles to access this device's location?");
    }


}
