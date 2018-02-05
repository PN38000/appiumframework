package iOSAppTests;

import framework.BaseTest;
import framework.Utils;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pagesAndroid.IslandPageAndroid;
import pagesAndroid.LanguagePageAndroid;
import pagesIOS.LanguagePageIos;

public class LanguageSelectTests extends BaseTest {

    LanguagePageIos languagepage;

    @BeforeTest
    public void beforemethod() throws InterruptedException {
        languagepage = new LanguagePageIos();
        languagepage.allowPermission();
    }

    @Test(priority = 1)
    public void selectEnglishLanguage(){

        Utils.clickOnElementList(2,languagepage.language);
        Utils.clickOnElement(languagepage.nextButton);
    }

}

