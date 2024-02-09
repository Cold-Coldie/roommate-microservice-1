package com.coldie.roommateapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class RoommateApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(RoommateApiApplication.class, args);
	}

}
