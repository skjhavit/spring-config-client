package com.example.springconfigclient;

import com.example.bean.UserBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

@SpringBootApplication
public class SpringConfigClientApplication {

	public static void main(String[] args) {

		SpringApplication.run(SpringConfigClientApplication.class, args);
	}


}

@RefreshScope
@RestController
class MessageRestController {
	@Autowired
	private UserConfiguration userConfiguration;
	@GetMapping("/userData")
	public UserBean getUserData() {
		return new UserBean(userConfiguration.getName(), userConfiguration.getProfile(), userConfiguration.getMsg());
	}
}
