package tests;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pages.*;
import framework.Utils;

import static framework.AppiumController.OS.ANDROID;
import static framework.AppiumController.executionOS;


public class IslandSelectTests extends BaseTestClass {

    @Test(priority = 1)
    public void goToIslandScreen() throws InterruptedException {
        languagepage.acceptAlertOnIOS();
        languagepage.selectLanguageAndCheckIcon(0);
        Utils.clickOnElementAndCheckText(languagepage.nextButton, islandpage.topText, "Please choose your country");

    }

    @Test(priority = 2)
    public void selectArubaIsland() throws InterruptedException {
        Utils.buttonIsInactive(islandpage.nextButton);
        Utils.checkTextOfListElement(0,islandpage.island, "Aruba");
        islandpage.selectIslandAndCheckIcon(0);
        Utils.buttonIsActive(islandpage.nextButton);
    }

    @Test(priority = 3)
    public void selectBonaireIsland(){
        Utils.checkTextOfListElement(1,islandpage.island, "Bonaire");
        islandpage.selectIslandAndCheckIcon(1);
        Utils.buttonIsActive(islandpage.nextButton);
    }

    @Test(priority = 4)
    public void selectCuracaoIsland(){
        Utils.checkTextOfListElement(2,islandpage.island, "Curaçao");
        islandpage.selectIslandAndCheckIcon(2);
        Utils.buttonIsActive(islandpage.nextButton);
    }

    @Test(priority = 5)
    public void selectStMartenIsland(){
        Utils.checkTextOfListElement(3,islandpage.island, "St. Maarten");
        islandpage.selectIslandAndCheckIcon(3);
        Utils.buttonIsActive(islandpage.nextButton);
    }

    @Test(priority = 6)
    public void selectCurAndClickNext(){
        islandpage.selectIslandAndCheckIcon(2);
        Utils.clickOnElementAndCheckText(islandpage.nextButton, selectionpage.topText,"What kind of member are you?");
    }

    @AfterTest
    public void resetApp(){
        if(executionOS == ANDROID){
            Utils.resetApp();
        }
    }

}
