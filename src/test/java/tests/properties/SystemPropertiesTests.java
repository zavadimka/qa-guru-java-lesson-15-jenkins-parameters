package tests.properties;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static java.lang.String.*;

public class SystemPropertiesTests {

    @Test
    @Tag("property1")
    void SystemProperty1Test() {

        String browser = System.getProperty("browser", "chrome");
        String browserVersion = System.getProperty("browser_version", "100.0");
        String browserSize = System.getProperty("browser_size", "1920x1080");

        String browserConfig = format("Browser: %s, version: %s, window size: %s",
                browser, browserVersion, browserSize);

        // gradle properties_tests -Dbrowser=mozilla -Dbrowser_version=96.0 -Dbrowser_size=1600x1200
        System.out.println(browserConfig);
    }

    @Test
    @Tag("property2")
    void SystemProperty2Test() {

        String name = System.getProperty("name", "default student");
        String message = format("Hello, %s, how are you?", name);



        System.out.println(message);
    }

}
