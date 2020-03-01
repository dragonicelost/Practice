package com.example.practice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.practice.service.serviceclass;

@SpringBootApplication
public class PracticeApplication implements CommandLineRunner{

	@Autowired
	serviceclass sc;
	
	public static void main(String[] args) {
		SpringApplication.run(PracticeApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		getall();
		
	}

	public void getall()
	{
		System.out.println(sc.getall());
	}
}
