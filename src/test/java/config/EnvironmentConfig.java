package config;

import org.aeonbits.owner.Config;

import static org.aeonbits.owner.Config.*;


@LoadPolicy(Config.LoadType.MERGE)
@Sources({
        "system:properties",
        "classpath:config/local:properties",    //ТРЕБУЕТСЯ ЕЩЁ СОЗДАТЬ local.properties
        "classpath:config/${environment}.properties"
})

// Другой вариант записи
//@Sources("classpath:config/${environment}.properties")
public interface EnvironmentConfig extends Config {
    @Key("web.url")
    String webUrl();

    @Key("api.url")
    String apiUrl();

    @Key("api.port")
    String apiPort();
}

