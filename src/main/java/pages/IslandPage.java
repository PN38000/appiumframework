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
import static framework.Utils.returnBackAndroid;

public class IslandPage {

    AppiumDriver driver;
    public IslandPage(AppiumDriver driver) {
        this.driver = driver;
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    @iOSFindBy(accessibility = "Back")
    public MobileElement backIconIos;

    @AndroidFindBy(xpath="//android.view.ViewGroup/android.widget.TextView[1]")
    @iOSFindBy(xpath = "//XCUIElementTypeOther/XCUIElementTypeStaticText")
    public MobileElement topText;

    @AndroidFindBy(xpath="//android.widget.LinearLayout/android.widget.ImageView[1]")
    @iOSFindBy(accessibility = "islandIcon")
    public List<MobileElement> islandIcon;

    @AndroidFindBy(xpath="//android.support.v7.widget.RecyclerView//android.widget.TextView")
    @iOSFindBy(xpath = "//XCUIElementTypeTable//XCUIElementTypeStaticText")
    public List<MobileElement> island;

    @AndroidFindBy(xpath="//android.widget.LinearLayout/android.widget.ImageView[2]")
    @iOSFindBy(accessibility="selectedMark")
    public List<MobileElement> selectedMark;


    @AndroidFindBy(id="net.funmiles.app.mobile:id/next")
    @iOSFindBy(accessibility = "nextButton")
    public MobileElement nextButton;

    public void returnBackToLanguage(){
        if(executionOS == ANDROID){
            returnBackAndroid();
            driver.launchApp();
        }else if (executionOS == IOS){
            backIconIos.click();
        }
    }

    public void selectIslandAndCheckIcon(int i)  {
        if(executionOS == IOS){
            Utils.clickOnElementOfList(i, island);
            Assert.assertTrue(selectedMark.get(0).isEnabled(),"true");
            Assert.assertTrue(islandIcon.get(i).isEnabled(),"true");

        }else if(executionOS == ANDROID){
            Utils.clickOnElementOfList(i,island);
            Assert.assertTrue(selectedMark.get(i).isSelected(),"true");
            Assert.assertTrue(islandIcon.get(i).isDisplayed(),"true");
        }
    }

}
