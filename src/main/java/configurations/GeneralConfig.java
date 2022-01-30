package configurations;

import org.aeonbits.owner.Config;

/**
 * Интерфейс содержащий главные настройки фраймворка.
 */
@Config.Sources("file:src/main/resources/properties/GeneralConfig.properties")
public interface GeneralConfig extends Config {
    @DefaultValue("prod")
    String env();

    @Key("prod.hostname")
    String hostname();

    @Key("prod.standardUser")
    String standardUser();

    @Key("prod.lockedOutUser")
    String lockedOutUser();

    @Key("prod.problemUser")
    String problemUser();

    @Key("prod.performanceGlitchUser")
    String performanceGlitchUser();

    @Key("prod.password")
    String password();

    @DefaultValue("chrome")
    String browser();

    String pathChrome();
}
