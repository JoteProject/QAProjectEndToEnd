package hooks;

import io.cucumber.core.api.Scenario;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import utils.ConfigReader;
import utils.WebdriverUtils;

public class Hooks {


    @Before
    public void setUp(Scenario currentScenario) {
        WebdriverUtils.getDriver().get(ConfigReader.getProperty("url"));


    }

    @After
    public void tearDown() {
        WebdriverUtils.driverKiller();
    }
}
