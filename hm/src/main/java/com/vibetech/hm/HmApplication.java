package com.vibetech.hm;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class HmApplication {

	public static void main(String[] args) {
		SpringApplication.run(HmApplication.class, args);
	}

	

}
