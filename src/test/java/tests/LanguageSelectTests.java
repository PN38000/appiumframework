package tests;

import framework.Utils;
import org.testng.annotations.*;

public class LanguageSelectTests extends BaseTestClass{


    @Test(priority = 1)
    public void selectEnglishLanguage() {
        Utils.buttonIsInactive(languagepage.nextButton);
        Utils.selectElement(0,languagepage.language,languagepage.selectedMarkAndroid);
        Utils.checkTextOfListElement(0, languagepage.language, "English");
        Utils.checkTextOfElement(languagepage.nextButton, "NEXT");
        Utils.buttonIsActive(languagepage.nextButton);
    }

    @Test(priority = 2)
    public void selectNLLanguage() {
        Utils.selectElement(1,languagepage.language,languagepage.selectedMarkAndroid);
        Utils.checkTextOfListElement(1, languagepage.language, "Nederlands");
        Utils.checkTextOfElement(languagepage.nextButton, "VOLGENDE");
        Utils.buttonIsActive(languagepage.nextButton);
    }

    @Test(priority = 3)
    public void selectEspanolLanguage() {
        Utils.selectElement(2,languagepage.language,languagepage.selectedMarkAndroid);
        Utils.checkTextOfListElement(2, languagepage.language, "Español");
        Utils.checkTextOfElement(languagepage.nextButton, "SIGUIENTE");
        Utils.buttonIsActive(languagepage.nextButton);
    }

    @Test(priority = 4)
    public void selectNlAndClickNext() {
        Utils.selectElement(1,languagepage.language,languagepage.selectedMarkAndroid);
        Utils.clickOnElementAndCheckText(languagepage.nextButton, islandpage.topText, "Kies uw land");
    }

    @Test(priority = 5)
    public void selectEsAndClickNext() {
      //  Utils.returnBackOpenApp();
        Utils.selectElement(2,languagepage.language,languagepage.selectedMarkAndroid);
        Utils.clickOnElementAndCheckText(languagepage.nextButton, islandpage.topText, "Seleccione su país");
    }

    @Test(priority = 6)
    public void selectEnAndClickNext() {
       // Utils.returnBackOpenApp();
        Utils.selectElement(0,languagepage.language,languagepage.selectedMarkAndroid);
        Utils.clickOnElementAndCheckText(languagepage.nextButton, islandpage.topText, "Please choose your country");
    }

    @AfterTest
    public void resetApp(){
        Utils.resetApp();
    }

}

