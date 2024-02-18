package tests.properties;

import config.CredentialsConfig;
import config.DriverConfig;
import config.EnvironmentConfig;
import org.aeonbits.owner.ConfigFactory;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static java.lang.String.format;

public class OwnerTests {

    @Test
    @Tag("owner1")
    void owner1Test() {
        CredentialsConfig credentials = ConfigFactory.create(CredentialsConfig.class);

        String user = credentials.user();
        String password = credentials.password();

        System.out.printf("Login with username %s and password %s", user, password);
    }

    @Test
    @Tag("owner2")
    void owner2Test() {

        DriverConfig config = ConfigFactory.create(DriverConfig.class);
        String browserName = config.browserName();
        String browserVersion = config.browserVersion();
        String browserSize = config.browserSize();

        String browserConfig = format("Browser: %s, version: %s, window size: %s",
                browserName, browserVersion, browserSize);

        System.out.println(browserConfig);
    }

    @Test
    @Tag("OwnerEnvironment")
    void owner3Test() {
        String environment = System.getProperty("environment", "stage");
        System.setProperty("environment", environment);
        EnvironmentConfig config = ConfigFactory.create(EnvironmentConfig.class);

        String webUrl = config.webUrl();
        String apiUrl = config.apiUrl();
        String apiPort = config.apiPort();

        String envConfig = format("Test env: %s\nwebUrl: %s\napiUrl: %s\napiPort: %s",
                environment, webUrl, apiUrl, apiPort);

        System.out.println(envConfig);
    }
}
