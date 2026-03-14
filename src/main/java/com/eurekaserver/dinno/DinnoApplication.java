package com.eurekaserver.dinno;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class DinnoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DinnoApplication.class, args);
	}

}
