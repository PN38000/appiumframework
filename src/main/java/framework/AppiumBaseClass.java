package framework;

import io.appium.java_client.AppiumDriver;

public abstract class AppiumBaseClass extends RunAppium {

    protected static AppiumDriver driver() {
        return AppiumController.instance.driver;
    }
}
