package com.example.zuulClient.zuulms;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class ZuulMsApplication {

	public static void main(String[] args) {
		SpringApplication.run(ZuulMsApplication.class, args);
	}

}
