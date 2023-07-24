package com.tide.ami;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class TideAmiApplication {

	public static void main(String[] args) {
		SpringApplication.run(TideAmiApplication.class, args);
	}

}
