package pages;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.iOSFindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

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
    public List<MobileElement> islandIcon;

    @iOSFindBy(accessibility = "islandAruba")
    public MobileElement islandIconAruba;
    @iOSFindBy(accessibility = "islandBonaire")
    public MobileElement islandIconBonaire;
    @iOSFindBy(accessibility = "islandCuracao")
    public MobileElement islandIconCuracao;
    @iOSFindBy(accessibility = "islandStmaarten")
    public MobileElement islandIconStMartin;

    @AndroidFindBy(xpath="//android.support.v7.widget.RecyclerView//android.widget.TextView")
    @iOSFindBy(xpath = "//XCUIElementTypeTable//XCUIElementTypeStaticText")
    public List<MobileElement> island;

    @AndroidFindBy(xpath="//android.widget.LinearLayout/android.widget.ImageView[2]")
    public List<MobileElement> selectedMark;

    @iOSFindBy(accessibility="checkMark")
    public MobileElement selectMarkIos; //isEnabled

    @AndroidFindBy(id="net.funmiles.app.mobile:id/next")
    @iOSFindBy(className = "XCUIElementTypeButton")
    public MobileElement nextButton;

}
