package framework;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidKeyCode;
import org.testng.Assert;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class Utils extends AppiumBaseClass {

    static AppiumDriver driver = driver();

    public static void checkTextOfElement(MobileElement element, String expectedText){
        String elementText = element.getText();
        Assert.assertTrue(elementText.equals(expectedText), "true");
    }

    public static void buttonIsInactive(MobileElement button) throws InterruptedException {
        Thread.sleep(500);
        Assert.assertFalse(button.isEnabled(),"false");
    }

    public static void selectElement(int i, List<MobileElement> element, List<MobileElement> selectedMark){
        element.get(i).click();
        Assert.assertTrue(selectedMark.get(i).isSelected(),"true");
    }

    public static void clickOnElementAndCheckText(MobileElement clickOn, MobileElement elementDisplayed, String someText) throws InterruptedException {
        clickOn.click();
        Thread.sleep(1000);
        Assert.assertTrue(elementDisplayed.getText().equals(someText), "true");
    }

    public static void clickOnElement(MobileElement clickOn){
            clickOn.click();
    }

    public static void clickOnElementOfList(int i, List<MobileElement> clickOn){
        clickOn.get(i).click();
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


    public static void returnBackAndroid(){
        ((AndroidDriver)driver).pressKeyCode(AndroidKeyCode.BACK);
    }

    public static void isSelected(MobileElement element){

        Assert.assertTrue(element.isSelected(), "true");
    }

    public static void resetApp(){
        driver.resetApp();
    }


}
