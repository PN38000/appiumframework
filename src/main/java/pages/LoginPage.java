package pages;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.iOSFindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class LoginPage {

    AppiumDriver driver;
    public LoginPage(AppiumDriver driver) {
        this.driver = driver;
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    @AndroidFindBy(xpath="//android.widget.FrameLayout[2]//android.widget.TextView")
    @iOSFindBy()
    public MobileElement usernameTitle;

    @AndroidFindBy(xpath="//android.widget.FrameLayout[2]//android.widget.EditText")
    @iOSFindBy()
    public MobileElement usernameInput;

    @AndroidFindBy(xpath="//android.widget.FrameLayout[2]//android.widget.ImageView")
    @iOSFindBy()
    public MobileElement checkedMarkUsername;

    @AndroidFindBy(xpath="//android.widget.FrameLayout[3]//android.widget.TextView")
    @iOSFindBy()
    public MobileElement passwordTitle;

    @AndroidFindBy(xpath="//android.widget.FrameLayout[3]//android.widget.EditText")
    @iOSFindBy()
    public MobileElement passwordInput;

    @AndroidFindBy(xpath="//android.widget.FrameLayout[3]//android.widget.ImageView")
    @iOSFindBy()
    public MobileElement checkedMarkPassword;

    @AndroidFindBy(id="net.funmiles.app.mobile:id/loginButton")
    @iOSFindBy()
    public MobileElement loginButton;

    @AndroidFindBy(id="net.funmiles.app.mobile:id/forgotPassword")
    @iOSFindBy(xpath = "//XCUIElementTypeButton[2]")
    public MobileElement forgotLink;

    @AndroidFindBy(id="net.funmiles.app.mobile:id/register")
    @iOSFindBy(xpath = "//XCUIElementTypeButton[3]")
    public MobileElement registerLink;

    @AndroidFindBy(id="net.funmiles.app.mobile:id/errorMessage")
    @iOSFindBy()
    public MobileElement errorMessage;

    @AndroidFindBy(id="com.android.browser:id/url")
    @iOSFindBy()
    public MobileElement forgotPageUrl;

    public void loginMethod(String usernameValue, String passwordValue){
        usernameInput.clear();
        usernameInput.sendKeys(usernameValue);
        passwordInput.clear();
        passwordInput.sendKeys(passwordValue);
        Assert.assertTrue(checkedMarkUsername.isEnabled(), "true");
        Assert.assertTrue(checkedMarkPassword.isEnabled(), "true");
        loginButton.click();
    }
}
