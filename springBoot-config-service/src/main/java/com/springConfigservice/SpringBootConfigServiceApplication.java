package com.springConfigservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@EnableConfigServer
@SpringBootApplication
public class SpringBootConfigServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootConfigServiceApplication.class, args); 
	}

}
