package tests.properties;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

public class SystemPropertiesTests {

    @Test
    @Tag("property")
    void SystemPropertiesTest() {

        String browser = System.getProperty("browser", "chrome");
        String browserVersion = System.getProperty("browser_version", "100.0");
        String browserSize = System.getProperty("browser_size", "1920x1080");

        String browserConfig = String.format("Browser: %s, version: %s, window size: %s",
                browser, browserVersion, browserSize);

        // gradle properties_tests -Dbrowser=mozilla -Dbrowser_version=96.0 -Dbrowser_size=1600x1200
        System.out.println(browserConfig);
    }
}
