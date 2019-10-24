package com.revature.charityappgatewayms;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@SpringBootApplication
@EnableZuulProxy
public class CharityappGatewayMsApplication {

	public static void main(String[] args) {
		SpringApplication.run(CharityappGatewayMsApplication.class, args);
	}

}
