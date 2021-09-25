package Hooks;

import io.cucumber.java.Scenario;
import org.junit.Before;
import utils.Logger;

public class hooks {

    private static final String BASE_URL = " https://www.epam.com/careers";

    @Before
    public static void openBrowser(Scenario scenario) {
        Logger.info("===============================================");
        Logger.info("===============================================");
        Logger.info(String.format("Start scenario '%s'", scenario.getName()));
        Logger.info("===============================================");
        Logger.info("===============================================");

        Logger.info(String.format("Open: %s", BASE_URL));
    }

}
