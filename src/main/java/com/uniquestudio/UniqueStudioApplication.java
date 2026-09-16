package com.uniquestudio;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//Main lass
@SpringBootApplication
public class UniqueStudioApplication {

	public static void main(String[] args) {
		SpringApplication.run(UniqueStudioApplication.class, args);
		System.out.println("Studio Application Started");
	}

}
