package com.example.wyh;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@Slf4j
@SpringBootApplication(scanBasePackages = "com.example.wyh")
public class WyhApplication {

	@Value("${spring.profiles.active}")
	private String appInfo;

	public static void main(String[] args) {
		SpringApplication.run(WyhApplication.class, args);
	}

}
