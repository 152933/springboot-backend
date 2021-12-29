package com.sb.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.sb.demo.model.User;
import com.sb.demo.repository.UserRepository;

@SpringBootApplication
public class SpringbootDemoApplication implements CommandLineRunner {

	@Autowired
	UserRepository userRepository;
	
	public static void main(String[] args) {
		SpringApplication.run(SpringbootDemoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		userRepository.save(new User("Suresh","Akula","suresh@gmail.com"));
		userRepository.save(new User("kumar","java","kumar@gmail.com"));
		userRepository.save(new User("jayanth","geetesh","jayanth@gmail.com"));
		
	}

}
