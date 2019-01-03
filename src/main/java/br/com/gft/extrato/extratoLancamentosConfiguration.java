package br.com.gft.extrato;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Configuration;

@SpringBootApplication
@Configuration
public class extratoLancamentosConfiguration {

	public static void main(String[] args) {
		SpringApplication.run(extratoLancamentosConfiguration.class, args);
	}	
}