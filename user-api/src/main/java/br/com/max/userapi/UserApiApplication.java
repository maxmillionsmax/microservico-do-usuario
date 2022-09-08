package br.com.max.userapi;

import br.com.max.userapi.domain.User;
import br.com.max.userapi.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

import java.util.List;

@EnableEurekaClient
@SpringBootApplication
public class UserApiApplication implements CommandLineRunner {

	@Autowired
	private UserRepository userRepository;

	public static void main(String[] args) {
		SpringApplication.run(UserApiApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		userRepository.saveAll(List.of(new User(null,"Maximiliano_1","maximiliano@emial.com","123",20.0),
				new User(null,"Maximiliano_2","maximiliano@emial.com","123",1000.0)));

	}
}
