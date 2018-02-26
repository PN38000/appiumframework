package tests;

import framework.AppiumBaseClass;
import framework.AppiumController;
import models.User;
import org.testng.annotations.BeforeSuite;
import pages.*;

import java.net.MalformedURLException;

import static models.UserBuilder.userWithTransactions;

public class BaseTestClass extends AppiumBaseClass {

    User user;

    @BeforeSuite
    public void BaseTestClass() throws MalformedURLException {
        AppiumController.instance.start();
        user = userWithTransactions();
    }
}
