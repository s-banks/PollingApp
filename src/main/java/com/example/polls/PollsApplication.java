package com.example.polls;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication
@EntityScan(basePackageClasses = {
		PollsApplication.class
})
public class PollsApplication {

	public static void main(String[] args) {
		SpringApplication.run(PollsApplication.class, args);
	}

}
