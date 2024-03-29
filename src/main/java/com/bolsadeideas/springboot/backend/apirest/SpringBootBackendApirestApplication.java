package com.bolsadeideas.springboot.backend.apirest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;



@SpringBootApplication
public class SpringBootBackendApirestApplication implements CommandLineRunner {

	
	
	@Autowired
	BCryptPasswordEncoder passwordEncoder;
	
	

	public static void main(String[] args) {
		SpringApplication.run(SpringBootBackendApirestApplication.class, args);
	}

	@Override
	public void run(String... arg0) throws Exception {
		
		String password = "12345";
				for(int i=0; i<2 ; i++) {
					String bycrytPassword = passwordEncoder.encode(password);
					System.out.println(bycrytPassword);
				
				
				}
			
		
	}
}
