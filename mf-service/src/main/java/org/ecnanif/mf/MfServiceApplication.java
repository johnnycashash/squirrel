package org.ecnanif.mf;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class MfServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(MfServiceApplication.class, args);
	}

}

