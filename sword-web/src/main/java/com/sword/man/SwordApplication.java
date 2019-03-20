package com.sword.man;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import springfox.documentation.swagger2.annotations.EnableSwagger2;

@EnableSwagger2
@ComponentScan(basePackages = "com.sword")
@EnableTransactionManagement
@EnableScheduling
@SpringBootApplication
public class SwordApplication {

	public static void main(String[] args) {
		SpringApplication.run(SwordApplication.class, args);
	}

}
