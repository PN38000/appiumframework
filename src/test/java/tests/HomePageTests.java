package tests;

import framework.Utils;
import models.User;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pages.*;

import static models.UserBuilder.userWithTransactions;

public class HomePageTests  extends BaseTestClass {


    @Test(priority = 1)
    public void loginToApp() throws InterruptedException {
        Utils.selectElement(0,languagepage.language,languagepage.selectedMark);
        Utils.clickOnElement(languagepage.nextButton);
        Utils.selectElement(2,islandpage.island,islandpage.selectedMark);
        Utils.clickOnElement(islandpage.nextButton);
        Utils.clickOnElement(selectionpage.loginButton);
        String username = user.getUsername();
        String password = user.getPassword();
        loginpage.loginMethod(username,password);
        Thread.sleep(10000);
    }

    @Test(priority = 2)
    public void allowLocationAccess(){
        Utils.checkTextOfElement(homepage.locationPermissionMessage,"Allow Fun Miles to access this device's location?");
        Utils.clickOnElement(homepage.allowLocationPermission);
        bottommenu.goToMoreMenuPage(bottommenu.settingsMenuIcon);
        Utils.checkTextOfElement(settingspage.locationSwitch, "ON");
    }

    @Test(priority = 3)
    public void checkLocalization(){
     //   Utils.returnBack();
        Utils.checkTextOfElement(homepage.myDigitalCardText,"My digital card");
        Utils.checkTextOfElement(homepage.transactionTitle, "Transaction history");
        Utils.checkTextOfElement(homepage.tansactionSubTitle,"Total transactions");
        Utils.checkTextOfElement(homepage.transactionPeriod, "in 2018");
        Utils.checkTextOfElement(homepage.viewTransactionsLink, "VIEW STATEMENT");
        Utils.checkTextOfElement(homepage.lastOffersTitle, "Latest offers");
    }

    @Test(priority = 4)
    public void checkMenuitemIsSelected(){
        Utils.isSelected(bottommenu.discoverMenuIcon);
    }

    @Test(priority = 5)
    public void checkName(){
        String fullname = user.getFname()+" "+user.getSufix()+" "+user.getLname();
        Utils.checkTextOfElement(homepage.userFullName,fullname);
    }

    @Test(priority = 6)
    public void goToProfile(){
        Utils.clickOnElementAndCheckText(homepage.myDigitalCardText, profilepage.myCardTitle,"My card");
        Utils.isSelected(bottommenu.profileMenuIcon);
    }

    @Test(priority = 7)
    public void addPhoto(){
        Utils.clickOnElement(bottommenu.discoverMenuIcon);
        homepage.addProfilePhoto();
    }

    @Test(priority = 8)
    public void checkTransactionsBlock(){

    }
/*
    @Test(priority = 9)
    public void goToTransactionViaBlock(){

    }

    @Test(priority = 10)
    public void goToTransactionViaLink(){

    }

    @Test(priority = 11)
    public void checkOffersList(){

    }

    @Test(priority = 12)
    public void openFirstOffer(){

    }
    */

}