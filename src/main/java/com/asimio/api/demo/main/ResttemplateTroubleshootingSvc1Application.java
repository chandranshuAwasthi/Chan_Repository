package com.asimio.api.demo.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = { "com.asimio.api.demo.rest" })
public class ResttemplateTroubleshootingSvc1Application {

	public static void main(String[] args) {
		SpringApplication.run(ResttemplateTroubleshootingSvc1Application.class, args);
	}
}
