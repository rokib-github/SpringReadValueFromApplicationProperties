package com.rokib.readApplicationProperties.constants;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Getter
@Setter
@Component
@ConfigurationProperties(prefix = "app.constants")
public class PropertiesConstants {

    private String appId;
    private String appKey;
    private String clientId;
    private String clientKey;
}
