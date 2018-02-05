package pagesAndroid;

import framework.BasePage;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.PageFactory;

import java.net.MalformedURLException;
import java.util.List;

public class SelectionPageAndroid extends BasePage {

    @AndroidFindBy(xpath="//*[@text='Step 1']")
    public MobileElement stepText;
    @AndroidFindBy(id="net.funmiles.app.mobile:id/header")
    public MobileElement topText;
    @AndroidFindBy(id="net.funmiles.app.mobile:id/newMemberTitle")
    public MobileElement newMemberOption;
    @AndroidFindBy(id="net.funmiles.app.mobile:id/catdMember")
    public MobileElement memberOption;
    @AndroidFindBy(id="net.funmiles.app.mobile:id/cardButton")
    public MobileElement cardUnregisteredOption;
    @AndroidFindBy(id="net.funmiles.app.mobile:id/onlineButton")
    public MobileElement cardRegisteredOption;
    @AndroidFindBy(id="net.funmiles.app.mobile:id/loginTitle")
    public MobileElement bottomText;
    @AndroidFindBy(id="net.funmiles.app.mobile:id/loginButton")
    public MobileElement loginButton;

}
