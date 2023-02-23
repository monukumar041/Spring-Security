package com.learn;

import com.learn.model.User;
import com.learn.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@SpringBootApplication
public class SpringSecurityApplication implements CommandLineRunner {

	@Autowired
	private UserRepository userRepository;

	@Autowired
	private BCryptPasswordEncoder bCryptPasswordEncoder;

	public static void main(String[] args) {
		SpringApplication.run(SpringSecurityApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		User user=new User();
		user.setUserName("john");
		user.setUserPassword(this.bCryptPasswordEncoder.encode("durgesh"));
		user.setEmail("durgest@gamil.com");
		user.setRole("ROLE_NORMAL");
		this.userRepository.save(user);

		User user1=new User();
		user1.setUserName("rohni");
		user1.setUserPassword(this.bCryptPasswordEncoder.encode("xyz"));
		user1.setEmail("rohni@gamil.com");
		user1.setRole("ROLE_ADMIN");
		this.userRepository.save(user1);
	}
}
