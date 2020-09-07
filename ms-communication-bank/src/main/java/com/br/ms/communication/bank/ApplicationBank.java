package com.br.ms.communication.bank;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

import co.elastic.apm.attach.ElasticApmAttacher;

@SpringBootApplication
@EntityScan
public class ApplicationBank {

	public static void main(String[] args) {
		ElasticApmAttacher.attach();
		SpringApplication.run(ApplicationBank.class, args);
	}	
	
}
