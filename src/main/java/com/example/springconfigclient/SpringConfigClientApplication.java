package com.example.springconfigclient;

import com.example.bean.UserBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class SpringConfigClientApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringConfigClientApplication.class, args);
	}

}

@RestController
class MessageRestController {
	@Autowired
	private UserConfiguration userConfiguration;

	@GetMapping("/userData")
	public UserBean getUserData() {
		System.out.println();
		return new UserBean(userConfiguration.getName(), userConfiguration.getProfile(), userConfiguration.getMsg());
	}
}
