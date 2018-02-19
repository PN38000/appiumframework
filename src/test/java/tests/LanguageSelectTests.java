package tests;

import framework.Utils;
import org.testng.annotations.*;

import static framework.AppiumController.OS.ANDROID;
import static framework.AppiumController.OS.IOS;
import static framework.AppiumController.executionOS;

public class LanguageSelectTests extends BaseTestClass{


    @Test(priority = 1)
    public void selectEnglishLanguage() throws InterruptedException {
        languagepage.acceptAlertOnIOS();
        Utils.buttonIsInactive(languagepage.nextButton);
        languagepage.selectLanguageAndCheckIcon(0);
        Utils.checkTextOfListElement(0, languagepage.language, "English");
        Utils.checkTextOfElement(languagepage.nextButton, "NEXT");
        Utils.buttonIsActive(languagepage.nextButton);
    }

    @Test(priority = 2)
    public void selectNLLanguage() throws InterruptedException {
        languagepage.selectLanguageAndCheckIcon(1);
        Utils.checkTextOfListElement(1, languagepage.language, "Nederlands");
        if(executionOS == ANDROID){
            Utils.checkTextOfElement(languagepage.nextButton, "VOLGENDE");
        }
        Utils.buttonIsActive(languagepage.nextButton);
    }

    @Test(priority = 3)
    public void selectEspanolLanguage() throws InterruptedException {
        languagepage.selectLanguageAndCheckIcon(2);
        Utils.checkTextOfListElement(2, languagepage.language, "Español");
        if(executionOS == ANDROID){
            Utils.checkTextOfElement(languagepage.nextButton, "SIGUIENTE");
        }
        Utils.buttonIsActive(languagepage.nextButton);
    }

    @Test(priority = 4)
    public void selectNlAndClickNext() {
        languagepage.selectLanguageAndCheckIcon(1);
        Utils.clickOnElementAndCheckText(languagepage.nextButton, islandpage.topText, "Kies uw land");
    }

    @Test(priority = 5)
    public void selectEsAndClickNext() throws InterruptedException {
        islandpage.returnBackToLanguage();
        languagepage.selectLanguageAndCheckIcon(2);
        Utils.clickOnElementAndCheckText(languagepage.nextButton, islandpage.topText, "Seleccione su país");
    }

    @Test(priority = 6)
    public void selectEnAndClickNext() throws InterruptedException {
        islandpage.returnBackToLanguage();
        languagepage.selectLanguageAndCheckIcon(0);
        Utils.clickOnElementAndCheckText(languagepage.nextButton, islandpage.topText, "Please choose your country");
    }

    @AfterTest
    public void resetApp(){
        if(executionOS == ANDROID){
            Utils.resetApp();
        }
    }

}

