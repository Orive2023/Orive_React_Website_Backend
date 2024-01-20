package com.orive.Orive_Website_Apigateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
@EnableDiscoveryClient
@SpringBootApplication
public class OriveWebsiteApigatewayApplication {

	public static void main(String[] args) {
		SpringApplication.run(OriveWebsiteApigatewayApplication.class, args);
	}

}
