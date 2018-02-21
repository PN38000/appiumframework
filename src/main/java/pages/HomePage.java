package pages;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.iOSFindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import java.util.List;

public class HomePage {

    AppiumDriver driver;
    public HomePage(AppiumDriver driver) {
        this.driver = driver;
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    @AndroidFindBy(id="com.android.packageinstaller:id/permission_message")
    public MobileElement locationPermissionMessage;
    @AndroidFindBy(id="com.android.packageinstaller:id/permission_allow_button")
    public MobileElement allowLocationPermission;
    @AndroidFindBy(id="com.android.packageinstaller:id/permission_deny_button")
    public MobileElement denyLocationPermission;

    @AndroidFindBy(id="net.funmiles.app.mobile:id/personalImageStub")
    public MobileElement imageSelector;
    @AndroidFindBy(id="com.android.packageinstaller:id/permission_allow_button")
    public MobileElement allowAccessToCamera;
    @AndroidFindBy(xpath="//*[@text='Camera']")
    public MobileElement imageSelectCamera;
    @AndroidFindBy(id="com.android.camera:id/shutter_button")
    public MobileElement cameraShutterButton;
    @AndroidFindBy(id="com.android.camera:id/btn_done")
    public MobileElement cameraDoneButton;
    @AndroidFindBy(id="net.funmiles.app.mobile:id/crop_image_menu_crop")
    public MobileElement cameraCropButton;
    @AndroidFindBy(id="net.funmiles.app.mobile:id/personalImage")
    public MobileElement addedProfileImage;


    @AndroidFindBy(id="net.funmiles.app.mobile:id/name")
    @iOSFindBy(accessibility = "userFullName")
    public MobileElement userFullName;

    @AndroidFindBy(id="net.funmiles.app.mobile:id/tv_home_my_card")
    @iOSFindBy(accessibility = "myDigitalCardText")
    public MobileElement myDigitalCardText;

    @AndroidFindBy(id="net.funmiles.app.mobile:id/funMilesCount")
    @iOSFindBy(accessibility = "numberOfFunMiles")
    public MobileElement numberOfFunMiles;


    @AndroidFindBy(id="net.funmiles.app.mobile:id/transactionsHistoryTitle")
    @iOSFindBy(accessibility = "transactionTitle")
    public MobileElement transactionTitle;

    @AndroidFindBy(id="net.funmiles.app.mobile:id/totalTransactions")
    @iOSFindBy(accessibility = "tansactionSubTitle")
    public MobileElement tansactionSubTitle;

    @AndroidFindBy(id="net.funmiles.app.mobile:id/transactionPeriod")
    @iOSFindBy(accessibility = "transactionPeriod")
    public MobileElement transactionPeriod;

    @AndroidFindBy(id="net.funmiles.app.mobile:id/transactionsCount")
    @iOSFindBy(accessibility = "numberOfTransactions")
    public MobileElement numberOfTransactions;

    @AndroidFindBy(id="net.funmiles.app.mobile:id/viewHistory")
    @iOSFindBy(accessibility = "viewTransactionsLink")
    public MobileElement viewTransactionsLink;

// FINISH WITH IOS ID - SHOULD BE ADDED TO THE APP
    @AndroidFindBy(id="net.funmiles.app.mobile:id/offers")
    @iOSFindBy(accessibility = "lastOffersTitle")
    public MobileElement lastOffersTitle;

    @AndroidFindBy(id="net.funmiles.app.mobile:id/image")
    @iOSFindBy(accessibility = "offerImage")
    public List<MobileElement> offerImage;

    @AndroidFindBy(id="net.funmiles.app.mobile:id/share")
    @iOSFindBy(accessibility = "offerShareIcon")
    public List<MobileElement> offerShareIcon;

    @AndroidFindBy(id="net.funmiles.app.mobile:id/favourite")
    @iOSFindBy(accessibility = "offerFavoriteIcon")
    public List<MobileElement> offerFavoriteIcon;

    @AndroidFindBy(id="net.funmiles.app.mobile:id/miles")
    @iOSFindBy(accessibility = "offerMiles")
    public List<MobileElement> offerMiles;

    @AndroidFindBy(id="net.funmiles.app.mobile:id/milesAndMoney")
    @iOSFindBy(accessibility = "offerMilesAndMoney")
    public List<MobileElement> offerMilesAndMoney;

    @AndroidFindBy(id="net.funmiles.app.mobile:id/expireDate")
    @iOSFindBy(accessibility = "offerExpirationDate")
    public List<MobileElement> offerExpirationDate;

    @AndroidFindBy(id="net.funmiles.app.mobile:id/title")
    @iOSFindBy(accessibility = "offerTitle")
    public List<MobileElement> offerTitle;

    public void addProfilePhoto(){
        imageSelector.click();
        allowAccessToCamera.click();
        imageSelectCamera.click();
        cameraShutterButton.click();
        cameraDoneButton.click();
        cameraCropButton.click();
        Assert.assertTrue(addedProfileImage.isDisplayed(), "true");
    }

}
