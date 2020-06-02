package BDDCurrysProject.BaseClassPackage;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks {
    DriverFactoryClass driverFactoryClass = new DriverFactoryClass();

    @Before
    public void setup(){
        driverFactoryClass.openBrowser();
    }
    @After
    public void teardown(){
        driverFactoryClass.closeBrowser();
    }
}
