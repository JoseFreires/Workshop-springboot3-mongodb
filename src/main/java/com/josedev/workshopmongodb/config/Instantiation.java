package com.josedev.workshopmongodb.config;

import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.TimeZone;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;

import com.josedev.workshopmongodb.domain.Post;
import com.josedev.workshopmongodb.domain.User;
import com.josedev.workshopmongodb.dto.AuthorDTO;
import com.josedev.workshopmongodb.dto.CommentDTO;
import com.josedev.workshopmongodb.repository.PostRepository;
import com.josedev.workshopmongodb.repository.UserRepository;

@Configuration
public class Instantiation implements CommandLineRunner{
	@Autowired
	private UserRepository userRepository;
	
	@Autowired
	private PostRepository postRepository;
	
	@Override
	public void run(String... args) throws Exception {
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		sdf.setTimeZone(TimeZone.getTimeZone("GMT"));
		
		userRepository.deleteAll();
		postRepository.deleteAll();
		
		
		User user1 = new User(null, "Alexandre Costa", "xandinhoS2@gmail.com"); 
		User user2 = new User(null, "Guilherme Santos", "gu1z0ET@gmail.com"); 
		User user3 = new User(null, "Dara Alice Venturini", "darinha@gmail.com"); 
		
		userRepository.saveAll(Arrays.asList(user1, user2, user3)); // Persistir os dados antes de criar os posts para evitar erro de id = null
		
		Post post1 = new Post(null, sdf.parse("05/10/1990"), "Olha esse ET!", "gente, eu estava saindo de casa e vi essa coisa que ctz q é um ET!", new AuthorDTO(user3));
		Post post2 = new Post(null, sdf.parse("06/10/1990"), "Desapareceu", "o et sumiu???????????", new AuthorDTO(user3));
		
		CommentDTO com1 = new CommentDTO("OLHA QUE MANEIROOOO!", sdf.parse("05/10/1990"), new AuthorDTO(user1));
		CommentDTO com2 = new CommentDTO("me manda o endereço!! quero gravar ele", sdf.parse("05/10/1990"), new AuthorDTO(user2));
		CommentDTO com3 = new CommentDTO("ESTOU A CAMINHO", sdf.parse("05/10/1990"), new AuthorDTO(user1));
		
		post1.getComments().addAll(Arrays.asList(com1, com2));
		post2.getComments().addAll(Arrays.asList(com3));
		
		postRepository.saveAll(Arrays.asList(post1, post2));
		
		
		user3.getPosts().addAll(Arrays.asList(post1, post2));
		userRepository.save(user3);
	}
	
}
