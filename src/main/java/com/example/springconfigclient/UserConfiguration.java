package com.example.springconfigclient;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Data
@Component
@ConfigurationProperties
public class UserConfiguration {
    private String msg;
    private String name;
    private String profile;

    @Override
    public String toString() {
        return "UserConfiguration{" +
                "msg='" + msg + '\'' +
                ", name='" + name + '\'' +
                ", profile='" + profile + '\'' +
                '}';
    }
}
