package com.fmgarcia.taurus.config.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@EnableConfigServer
@SpringBootApplication
public class MsTaurusConfigServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(MsTaurusConfigServerApplication.class, args);
	}

}
