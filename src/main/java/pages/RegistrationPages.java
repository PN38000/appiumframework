package pages;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.iOSFindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

import static framework.AppiumController.OS.ANDROID;
import static framework.AppiumController.OS.IOS;
import static framework.AppiumController.executionOS;
import static framework.Utils.returnBackAndroid;

public class RegistrationPages {

    AppiumDriver driver;
    public RegistrationPages(AppiumDriver driver) {
        this.driver = driver;
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    //titles of registration flows 2 and 3
    @AndroidFindBy(id="net.funmiles.app.mobile:id/title")
    @iOSFindBy(xpath = "//XCUIElementTypeOther[1]/XCUIElementTypeStaticText")
    public List<MobileElement> titlesFlows_2_3;

    @iOSFindBy(accessibility = "backButton")
    public MobileElement backIconIos;

    @AndroidFindBy(id="net.funmiles.app.mobile:id/tv_register_step2_title")
    @iOSFindBy(xpath = "//XCUIElementTypeOther[1]/XCUIElementTypeStaticText[1]")
    public MobileElement topTest1;

    public void returnBackToSelectionPage(){
        if(executionOS == ANDROID){
            returnBackAndroid();
        }else if (executionOS == IOS){
            backIconIos.click();
        }
    }



}
