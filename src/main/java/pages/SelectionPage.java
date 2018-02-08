package pages;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.iOSFindBy;
import org.openqa.selenium.support.PageFactory;

public class SelectionPage {

    AppiumDriver driver;
    public SelectionPage(AppiumDriver driver) {
        this.driver = driver;
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    @AndroidFindBy(xpath="//*[@text='Step 1']")
    @iOSFindBy(accessibility = "Step 1")
    public MobileElement stepText;

    @AndroidFindBy(id="net.funmiles.app.mobile:id/header")
    @iOSFindBy(xpath = "//XCUIElementTypeOther[1]/XCUIElementTypeStaticText[1]")
    public MobileElement topText;

    @AndroidFindBy(id="net.funmiles.app.mobile:id/newMemberTitle")
    @iOSFindBy(xpath = "//XCUIElementTypeCell[1]/XCUIElementTypeStaticText")
    public MobileElement newMemberOption;

    @AndroidFindBy(id="net.funmiles.app.mobile:id/catdMember")
    @iOSFindBy(xpath = "//XCUIElementTypeCell[2]/XCUIElementTypeStaticText")
    public MobileElement memberOption;

    @AndroidFindBy(id="net.funmiles.app.mobile:id/cardButton")
    @iOSFindBy(xpath = "//XCUIElementTypeOther[3]/XCUIElementTypeButton[1]")
    public MobileElement cardUnregisteredOption;

    @AndroidFindBy(id="net.funmiles.app.mobile:id/onlineButton")
    @iOSFindBy(xpath = "//XCUIElementTypeOther[3]/XCUIElementTypeButton[2]")
    public MobileElement cardRegisteredOption;

    @AndroidFindBy(id="net.funmiles.app.mobile:id/loginTitle")
    @iOSFindBy(xpath = "//XCUIElementTypeOther[1]/XCUIElementTypeStaticText[2]")
    public MobileElement bottomText;

    @AndroidFindBy(id="net.funmiles.app.mobile:id/loginButton")
    @iOSFindBy(xpath = "//XCUIElementTypeOther[1]/XCUIElementTypeButton")
    public MobileElement loginButton;

}
