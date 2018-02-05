package pagesAndroid;

import framework.BasePageAndroid;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.testng.Assert;

public class LoginPageAndroid extends BasePageAndroid {

    @AndroidFindBy(xpath="//android.widget.FrameLayout[2]//android.widget.TextView")
    public MobileElement usernameTitle;
    @AndroidFindBy(xpath="//android.widget.FrameLayout[2]//android.widget.EditText")
    public MobileElement usernameInput;
    @AndroidFindBy(xpath="//android.widget.FrameLayout[2]//android.widget.ImageView")
    public MobileElement checkedMarkUsername;
    @AndroidFindBy(xpath="//android.widget.FrameLayout[3]//android.widget.TextView")
    public MobileElement passwordTitle;
    @AndroidFindBy(xpath="//android.widget.FrameLayout[3]//android.widget.EditText")
    public MobileElement passwordInput;
    @AndroidFindBy(xpath="//android.widget.FrameLayout[3]//android.widget.ImageView")
    public MobileElement checkedMarkPassword;
    @AndroidFindBy(id="net.funmiles.app.mobile:id/loginButton")
    public MobileElement loginButton;
    @AndroidFindBy(id="net.funmiles.app.mobile:id/forgotPassword")
    public MobileElement forgotLink;
    @AndroidFindBy(id="net.funmiles.app.mobile:id/register")
    public MobileElement registerLink;
    @AndroidFindBy(id="net.funmiles.app.mobile:id/errorMessage")
    public MobileElement errorMessage;
    @AndroidFindBy(id="com.android.browser:id/url")
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
