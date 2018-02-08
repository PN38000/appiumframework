package tests;

import framework.AppiumBaseClass;
import framework.AppiumController;
import models.User;
import org.testng.annotations.BeforeSuite;
import pages.*;

import java.net.MalformedURLException;

import static models.UserBuilder.userWithTransactions;

public class BaseTestClass extends AppiumBaseClass {

    LanguagePage languagepage;
    IslandPage islandpage;
    SelectionPage selectionpage;
    RegistrationPages registrationpages;
    LoginPage loginpage;
    HomePage homepage;
    TransactionPage transactionpage;
    OfferDetails oferdetailspage;
    BottomMenu bottommenu;
    SettingsPage settingspage;
    ProfilePage profilepage;
    User user;

    @BeforeSuite
    public void BaseTestClass() throws MalformedURLException {
        AppiumController.instance.start();
        user = userWithTransactions();
        languagepage = new LanguagePage(driver());
        islandpage = new IslandPage(driver());
        selectionpage = new SelectionPage(driver());
        registrationpages = new RegistrationPages(driver());
        loginpage = new LoginPage(driver());
        homepage = new HomePage(driver());
        transactionpage = new TransactionPage(driver());
        oferdetailspage = new OfferDetails(driver());
        bottommenu = new BottomMenu(driver());
        settingspage = new SettingsPage(driver());
        profilepage = new ProfilePage(driver());
    }
}
