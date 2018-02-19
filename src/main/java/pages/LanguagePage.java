package pages;

import framework.Utils;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.iOSFindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import java.util.List;

import static framework.AppiumController.OS.ANDROID;
import static framework.AppiumController.OS.IOS;
import static framework.AppiumController.executionOS;

public class LanguagePage {

    AppiumDriver driver;
    public LanguagePage(AppiumDriver driver) {
        this.driver = driver;
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    @AndroidFindBy(xpath="//*[@text='Let’s get started!']")
    @iOSFindBy(xpath="//*[@text='Let’s get started!']")
    public MobileElement topText1;

    @AndroidFindBy(xpath="//*[@text='Please choose your language']")
    @iOSFindBy(xpath="//*[@text='Please choose your language']")
    public MobileElement topText2;

    @AndroidFindBy(xpath="//android.widget.RelativeLayout/android.widget.TextView")
    @iOSFindBy(xpath="//XCUIElementTypeTable//XCUIElementTypeStaticText")
    public List<MobileElement> language;

    @AndroidFindBy(xpath="//android.widget.ImageView")
    public List<MobileElement> selectedMarkAndroid;

    @iOSFindBy(accessibility="checkMark")
    public MobileElement selectMarkIos; //isEnabled

    @AndroidFindBy(id="net.funmiles.app.mobile:id/next")
    @iOSFindBy(className="XCUIElementTypeButton")  //isEnabled
    public MobileElement nextButton;

    public void acceptAlertOnIOS() throws InterruptedException{
        if(executionOS == IOS){
            driver.switchTo().alert().accept();
            Thread.sleep(1000);
            driver.switchTo().alert().accept();
            Thread.sleep(500);
        }
    }

    public void selectLanguageAndCheckIcon(int i)  {
        if(executionOS == IOS){
            Utils.clickOnElementOfList(i,language);
            Assert.assertTrue(selectMarkIos.isEnabled(),"true");

        }else if(executionOS == ANDROID){
            Utils.clickOnElementOfList(i,language);
            Assert.assertTrue(selectedMarkAndroid.get(i).isSelected(),"true");
        }
    }

}
