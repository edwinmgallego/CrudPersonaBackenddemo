package com.example.CrudPersonaBackenddemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication

@EnableConfigurationProperties
@EntityScan(basePackages = {"model"})
public class CrudPersonaBackenddemoApplication {
private static ConfigurableApplicationContext applicationContext;
	public static void main(String[] args) {
		CrudPersonaBackenddemoApplication.applicationContext  =		SpringApplication.run(CrudPersonaBackenddemoApplication.class, args);
	}

}
