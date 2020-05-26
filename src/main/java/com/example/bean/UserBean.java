package com.example.bean;

import lombok.NoArgsConstructor;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;
import lombok.Data;

@Data
@NoArgsConstructor
public class UserBean {
private String msg;
private String name;
private String profile;

    public UserBean(String name, String profile, String msg) {
        this.name = name;
        this.profile = profile;
        this.msg = msg;
    }
}
