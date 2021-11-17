package com.DealsAndCoupons.service.D.Cservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class D_CApplication {

	public static void main(String[] args) {
		SpringApplication.run(D_CApplication.class, args);
	}

}
