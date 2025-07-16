package com.josedev.workshopmongodb.config;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;

import com.josedev.workshopmongodb.domain.User;
import com.josedev.workshopmongodb.repository.UserRepository;

@Configuration
public class Instantiation implements CommandLineRunner{
	@Autowired
	private UserRepository userRepository;
	
	@Override
	public void run(String... args) throws Exception {
		userRepository.deleteAll();
		
		User user1 = new User(null, "Alexandre Costa", "xandinhoS2@gmail.com"); 
		User user2 = new User(null, "Guilherme Santos", "gu1z0ET@gmail.com"); 
		User user3 = new User(null, "Dara Alice Venturini", "darinha@gmail.com"); 
		
		userRepository.saveAll(Arrays.asList(user1, user2, user3));
		
	}
	
}
