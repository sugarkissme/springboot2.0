package com.springboot;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@MapperScan("com.springboot")
@EnableScheduling
public class SpingbootApplication {
	public static void main(String[] args) {
		SpringApplication.run(SpingbootApplication.class, args);
		System.out.println("我不好n");
		System.out.println("你好");
		System.out.println("hot_fix");
	}
}
