package config;

import org.aeonbits.owner.Config;

public interface WebDriverConfig extends Config {
    @Key("baseUrl")
    @DefaultValue("https://client-app.remedylogic.com/")
    String getBaseUrl();

    @Key("browser")
    @DefaultValue("CHROME")
    String getBrowser();

    @Key("browserVersion")
    String getBrowserVersion();

    @Key("remoteWebDriver")
    @DefaultValue("true")
    Boolean getRemoteWebDriver();

    @Key("remoteUrl")
    String gerRemoteUrl();
}
