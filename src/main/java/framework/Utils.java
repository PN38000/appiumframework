package framework;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidKeyCode;
import org.testng.Assert;
import java.util.List;
import java.util.concurrent.TimeUnit;

import static framework.BasePage.driver;


public class Utils {

    public static void checkTextOfElement(MobileElement element, String expectedText){
        String elementText = element.getText();
        Assert.assertTrue(elementText.equals(expectedText), "true");
    }

    public static void buttonIsInactive(MobileElement button){
        Assert.assertFalse(button.isEnabled(),"false");
    }

    public static void selectElement(int i, List<MobileElement> element, List<MobileElement> selectedMark){
        element.get(i).click();
        Assert.assertTrue(selectedMark.get(i).isSelected(),"true");
    }

    public static void clickOnElementAndCheckText(MobileElement clickOn, MobileElement elementDisplayed, String someText){
        clickOn.click();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        Assert.assertTrue(elementDisplayed.getText().equals(someText), "true");
    }

    public static void clickOnElement(MobileElement clickOn){
            clickOn.click();

    }
    public static void checkTextOfListElement(int i, List<MobileElement> element, String expectedText){
        String elementText = element.get(i).getText();
        Assert.assertTrue(elementText.equals(expectedText), "true");
    }


    public static void buttonIsActive(MobileElement button){
        Assert.assertTrue(button.isEnabled(),"true");
    }


    public static void listElementDisplayed(int i, List<MobileElement> element){
        Assert.assertTrue(element.get(i).isDisplayed(), "true");
    }

    public static void elementDisplayed(MobileElement element){
        Assert.assertTrue(element.isDisplayed(), "true");
    }

    public static void returnBackOpenApp(){
        driver.pressKeyCode(AndroidKeyCode.BACK);
        driver.launchApp();
    }

    public static void returnBack(){
        driver.pressKeyCode(AndroidKeyCode.BACK);
    }

    public static void isSelected(MobileElement element){

        Assert.assertTrue(element.isSelected(), "true");
    }

    public static void resetApp(){
        driver.resetApp();
    }


}