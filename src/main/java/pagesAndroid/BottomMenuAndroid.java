package pagesAndroid;

import framework.BasePageAndroid;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class BottomMenuAndroid extends BasePageAndroid {

    @AndroidFindBy(id = "net.funmiles.app.mobile:id/menu_discover")
    public MobileElement discoverMenuIcon;
    @AndroidFindBy(id = "net.funmiles.app.mobile:id/menu_partners")
    public MobileElement partnersMenuIcon;
    @AndroidFindBy(id = "net.funmiles.app.mobile:id/menu_offers")
    public MobileElement offersMenuIcon;
    @AndroidFindBy(id = "net.funmiles.app.mobile:id/menu_profile")
    public MobileElement profileMenuIcon;
    @AndroidFindBy(id = "net.funmiles.app.mobile:id/menu_more")
    public MobileElement moreMenuIcon;
    @AndroidFindBy(id = "net.funmiles.app.mobile:id/menu_inbox")
    public MobileElement inboxMenuICon;
    @AndroidFindBy(id = "net.funmiles.app.mobile:id/menu_settings")
    public MobileElement settingsMenuIcon;
    @AndroidFindBy(id = "net.funmiles.app.mobile:id/menu_aboutUs")
    public MobileElement aboutMenuIcon;
    @AndroidFindBy(id = "net.funmiles.app.mobile:id/menu_faq")
    public MobileElement faqMenuIcon;
    @AndroidFindBy(id = "net.funmiles.app.mobile:id/menu_contact")
    public MobileElement contactMenuIcon;
    @AndroidFindBy(id = "net.funmiles.app.mobile:id/menu_termsAndConditions")
    public MobileElement termsConditionsmenuIcon;

    public void goToMoreMenuPage(MobileElement moremenuitem){
        moreMenuIcon.click();
        moremenuitem.click();
    }
}
