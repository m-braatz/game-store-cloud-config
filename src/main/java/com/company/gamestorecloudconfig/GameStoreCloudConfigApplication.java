package com.company.gamestorecloudconfig;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class GameStoreCloudConfigApplication {

	public static void main(String[] args) {
		SpringApplication.run(GameStoreCloudConfigApplication.class, args);
	}

}
