package tests;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pages.*;
import framework.Utils;

import static framework.AppiumController.OS.ANDROID;
import static framework.AppiumController.executionOS;

public class SelectionScreenTests extends BaseTestClass{

    @Test(priority = 1)
    public void goToSelectionScreen() throws InterruptedException {
        languagepage.acceptAlertOnIOS();
        languagepage.selectLanguageAndCheckIcon(0);
        Utils.clickOnElementAndCheckText(languagepage.nextButton, islandpage.topText, "Please choose your country");
        islandpage.selectIslandAndCheckIcon(2);
        Utils.clickOnElementAndCheckText(islandpage.nextButton, selectionpage.topText, "What kind of member are you?");
    }

    @Test(priority = 2)
    public void openScrenAndCheckText(){
        Utils.elementDisplayed(selectionpage.stepText);
        Utils.checkTextOfElement(selectionpage.newMemberOption, "New member");
        Utils.checkTextOfElement(selectionpage.memberOption,"Member");
        Utils.checkTextOfElement(selectionpage.bottomText,"Do you have a Fun Miles app account already?");
        Utils.checkTextOfElement(selectionpage.loginButton,"LOGIN");
    }

    @Test(priority = 3)
    public void openNewMemberPage() throws InterruptedException {
        Utils.clickOnElementAndCheckText(selectionpage.newMemberOption, registrationpages.topTest1,"Please let us know who you are");
        registrationpages.returnBackToSelectionPage();
    }

    @Test(priority = 4)
    public void openCardUnregisteredPage() throws InterruptedException {
        Utils.clickOnElementAndCheckText(selectionpage.memberOption, selectionpage.cardUnregisteredOption,
                "Card unregistered");
        Utils.elementDisplayed(selectionpage.cardUnregisteredOption);
        Utils.clickOnElement(selectionpage.cardUnregisteredOption);
        Utils.checkTextOfListElement(0, registrationpages.titlesFlows_2_3,"Let’s connect your Fun Miles card!");
        registrationpages.returnBackToSelectionPage();
    }

    @Test(priority = 5)
    public void openCardRegisteredPage() throws InterruptedException {
        Utils.clickOnElementAndCheckText(selectionpage.memberOption, selectionpage.cardRegisteredOption,
                "Card registered");
        Utils.elementDisplayed(selectionpage.cardUnregisteredOption);
        Utils.clickOnElement(selectionpage.cardRegisteredOption);
        Utils.checkTextOfListElement(0, registrationpages.titlesFlows_2_3,"Shall we transfer your data?");
        registrationpages.returnBackToSelectionPage();
    }

    @Test(priority = 6)
    public void openLoginPage() throws InterruptedException {
        Utils.buttonIsActive(selectionpage.loginButton);
        Utils.clickOnElementAndCheckText(selectionpage.loginButton, loginpage.registerLink,
                "No Fun Miles account? Please register your card.");
    }

    @AfterTest
    public void resetApp(){
        if(executionOS == ANDROID){
            Utils.resetApp();
        }
    }

}
