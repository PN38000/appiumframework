package framework;

import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.PageFactory;

import java.net.MalformedURLException;

import static framework.СapabilitiesIOS.capatibilities;

public class BasePageIos {

    public static IOSDriver driver;

    static {
        try {
            driver = capatibilities();
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
    }

    public BasePageIos() {
        this.driver = driver;
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);

    }

}
