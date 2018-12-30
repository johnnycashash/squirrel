package org.ecnanif.feeder;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.scheduling.annotation.EnableScheduling;

import java.io.IOException;
import java.text.ParseException;

@EnableScheduling
@EnableEurekaClient
@SpringBootApplication
public class MfFeederServiceApplication {

	public static void main(String[] args) throws IOException, ParseException {
		//ConfigurableApplicationContext run =
				SpringApplication.run(MfFeederServiceApplication.class, args);
		//run.getBean(DBFeederScheduledAndControlledEvent.class).loadDB();
	}

}

