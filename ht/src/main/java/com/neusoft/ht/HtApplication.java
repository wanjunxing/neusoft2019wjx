package com.neusoft.ht;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.neusoft.ht.*.mapper")
public class HtApplication {

	public static void main(String[] args) {
		SpringApplication.run(HtApplication.class, args);
	}

}
