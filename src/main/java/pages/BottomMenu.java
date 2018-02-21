package pages;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.iOSFindBy;
import org.openqa.selenium.support.PageFactory;

public class BottomMenu {

    AppiumDriver driver;
    public BottomMenu(AppiumDriver driver) {
        this.driver = driver;
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }
// change in app!!!!

    @AndroidFindBy(id = "net.funmiles.app.mobile:id/menu_discover")
    @iOSFindBy(accessibility = "discoverMenuIcon")
    public MobileElement discoverMenuIcon;

    @AndroidFindBy(id = "net.funmiles.app.mobile:id/menu_partners")
    @iOSFindBy(accessibility = "partnersMenuIcon")
    public MobileElement partnersMenuIcon;

    @AndroidFindBy(id = "net.funmiles.app.mobile:id/menu_offers")
    @iOSFindBy(accessibility = "offersMenuIcon")
    public MobileElement offersMenuIcon;

    @AndroidFindBy(id = "net.funmiles.app.mobile:id/menu_profile")
    @iOSFindBy(accessibility = "profileMenuIcon")
    public MobileElement profileMenuIcon;

    @AndroidFindBy(id = "net.funmiles.app.mobile:id/menu_more")
    @iOSFindBy(accessibility = "moreMenuIcon")
    public MobileElement moreMenuIcon;

    @AndroidFindBy(id = "net.funmiles.app.mobile:id/menu_inbox")
    @iOSFindBy(accessibility = "inboxMenuICon")
    public MobileElement inboxMenuICon;

    @AndroidFindBy(id = "net.funmiles.app.mobile:id/menu_settings")
    @iOSFindBy(accessibility = "settingsMenuIcon")
    public MobileElement settingsMenuIcon;

    @AndroidFindBy(id = "net.funmiles.app.mobile:id/menu_aboutUs")
    @iOSFindBy(accessibility = "aboutMenuIcon")
    public MobileElement aboutMenuIcon;

    @AndroidFindBy(id = "net.funmiles.app.mobile:id/menu_faq")
    @iOSFindBy(accessibility = "faqMenuIcon")
    public MobileElement faqMenuIcon;

    @AndroidFindBy(id = "net.funmiles.app.mobile:id/menu_contact")
    @iOSFindBy(accessibility = "contactMenuIcon")
    public MobileElement contactMenuIcon;

    @AndroidFindBy(id = "net.funmiles.app.mobile:id/menu_termsAndConditions")
    @iOSFindBy(accessibility = "termsConditionsmenuIcon")
    public MobileElement termsConditionsmenuIcon;

    public void goToMoreMenuPage(MobileElement moremenuitem){
        moreMenuIcon.click();
        moremenuitem.click();
    }
}
