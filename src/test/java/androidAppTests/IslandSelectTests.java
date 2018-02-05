package androidAppTests;

import framework.BaseTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pagesAndroid.*;
import framework.Utils;


public class IslandSelectTests extends BaseTest {

    LanguagePageAndroid languagepage;
    IslandPageAndroid islandpage;
    SelectionPageAndroid selectionpage;


    @BeforeTest
    public void beforemethod() {
        languagepage = new LanguagePageAndroid();
        islandpage = new IslandPageAndroid();
        selectionpage = new SelectionPageAndroid();
    }

    @Test(priority = 1)
    public void goToIslandScreen() {
        Utils.selectElement(0,languagepage.language,languagepage.selectedMark);
        Utils.clickOnElementAndCheckText(languagepage.nextButton, islandpage.topText, "Please choose your country");

    }

    @Test(priority = 2, dependsOnMethods = "goToIslandScreen")
    public void selectArubaIsland(){
        Utils.buttonIsInactive(islandpage.nextButton);
        Utils.checkTextOfListElement(0,islandpage.island, "Aruba");
        Utils.listElementDisplayed(0,islandpage.islandIcon);
        Utils.selectElement(0,islandpage.island,islandpage.selectedMark);
        Utils.buttonIsActive(islandpage.nextButton);
    }

    @Test(priority = 3)
    public void selectBonaireIsland(){
        Utils.checkTextOfListElement(1,islandpage.island, "Bonaire");
        Utils.listElementDisplayed(1,islandpage.islandIcon);
        Utils.selectElement(1,islandpage.island,islandpage.selectedMark);
        Utils.buttonIsActive(islandpage.nextButton);
    }

    @Test(priority = 4)
    public void selectCuracaoIsland(){
        Utils.checkTextOfListElement(2,islandpage.island, "Curaçao");
        Utils.listElementDisplayed(2,islandpage.islandIcon);
        Utils.selectElement(2,islandpage.island,islandpage.selectedMark);
        Utils.buttonIsActive(islandpage.nextButton);
    }

    @Test(priority = 5)
    public void selectStMartenIsland(){
        Utils.checkTextOfListElement(3,islandpage.island, "St. Maarten");
        Utils.listElementDisplayed(3,islandpage.islandIcon);
        Utils.selectElement(3,islandpage.island,islandpage.selectedMark);
        Utils.buttonIsActive(islandpage.nextButton);
    }

    @Test(priority = 6)
    public void selectCurAndClickNext(){
        Utils.selectElement(2,islandpage.island,islandpage.selectedMark);
        Utils.clickOnElementAndCheckText(islandpage.nextButton, selectionpage.topText,"What kind of member are you?");
    }

    @AfterTest
    public void resetApp(){
        Utils.resetApp();
    }

}
