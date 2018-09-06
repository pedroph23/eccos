package com.example.eccos;

import com.example.eccos.data.DataConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class EccosApplication {

	public static void main(String[] args) {
		SpringApplication.run(EccosApplication.class, args);
		new DataConfiguration();
	}
}
