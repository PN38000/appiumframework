package androidAppTests;

import framework.BaseTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pagesAndroid.*;
import framework.Utils;

public class SelectionScreenTests extends BaseTest {

    LanguagePageAndroid languagepage;
    IslandPageAndroid islandpage;
    SelectionPageAndroid selectionpage;
    RegistrationPagesAndroid registrationpage;
    LoginPageAndroid loginpage;

    @BeforeTest
    public void beforemethod(){
        languagepage = new LanguagePageAndroid();
        islandpage = new IslandPageAndroid();
        selectionpage = new SelectionPageAndroid();
        registrationpage = new RegistrationPagesAndroid();
        loginpage = new LoginPageAndroid();
    }

    @Test(priority = 1)
    public void goToSelectionScreen(){
        Utils.selectElement(0,languagepage.language,languagepage.selectedMark);
        Utils.clickOnElementAndCheckText(languagepage.nextButton, islandpage.topText, "Please choose your country");
        Utils.selectElement(2,islandpage.island,islandpage.selectedMark);
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
    public void openNewMemberPage() {
        Utils.clickOnElementAndCheckText(selectionpage.newMemberOption, registrationpage.topTest1,"Please let us know who you are");
        Utils.returnBack();
    }

    @Test(priority = 4)
    public void openCardUnregisteredPage() {
        Utils.clickOnElementAndCheckText(selectionpage.memberOption, selectionpage.cardUnregisteredOption,
                "Card unregistered");
        Utils.elementDisplayed(selectionpage.cardUnregisteredOption);
        Utils.clickOnElement(selectionpage.cardUnregisteredOption);
        Utils.checkTextOfListElement(0, registrationpage.titlesFlows_2_3,"Let’s connect your Fun Miles card!");
        Utils.returnBack();
    }

    @Test(priority = 5)
    public void openCardRegisteredPage() {
        Utils.clickOnElementAndCheckText(selectionpage.memberOption, selectionpage.cardRegisteredOption,
                "Card registered");
        Utils.elementDisplayed(selectionpage.cardUnregisteredOption);
        Utils.clickOnElement(selectionpage.cardRegisteredOption);
        Utils.checkTextOfListElement(0, registrationpage.titlesFlows_2_3,"Shall we transfer your data?");
        Utils.returnBack();
    }

    @Test(priority = 6)
    public void openLoginPage() {
        Utils.buttonIsActive(selectionpage.loginButton);
        Utils.clickOnElementAndCheckText(selectionpage.loginButton, loginpage.registerLink,
                "No Fun Miles account? Please register your card.");
    }

    @AfterTest
    public void resetApp(){
        Utils.resetApp();
    }

}