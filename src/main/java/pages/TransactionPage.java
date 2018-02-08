package pages;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class TransactionPage {

    AppiumDriver driver;
    public TransactionPage(AppiumDriver driver) {
        this.driver = driver;
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    @AndroidFindBy(id="net.funmiles.app.mobile:id/title")
    public MobileElement pageTitle;
    @AndroidFindBy(id="net.funmiles.app.mobile:id/month")
    public List<MobileElement> months;
    @AndroidFindBy(id="net.funmiles.app.mobile:id/backIcon")
    public MobileElement backIcon;
    @AndroidFindBy(id="net.funmiles.app.mobile:id/name")
    public List<MobileElement> transactionsNameList;
    @AndroidFindBy(id="net.funmiles.app.mobile:id/island")
    public List<MobileElement> transactionsIslandList;
    @AndroidFindBy(id="net.funmiles.app.mobile:id/miles")
    public List<MobileElement> transactionsMilesList;
    @AndroidFindBy(id="net.funmiles.app.mobile:id/date")
    public List<MobileElement> transactionsDateList;

}
