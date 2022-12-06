package com.emagomiladev.app;

import java.util.TimeZone;

import javax.annotation.PostConstruct;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ApiTurnosApplication {

	@PostConstruct
    void started() {
      TimeZone.setDefault(TimeZone.getTimeZone("UTC"));
      }

	public static void main(String[] args) {
		SpringApplication.run(ApiTurnosApplication.class, args);
	}

}
