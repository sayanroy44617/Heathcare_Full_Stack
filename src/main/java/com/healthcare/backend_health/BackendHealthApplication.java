package com.healthcare.backend_health;

import org.modelmapper.ModelMapper;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.password.PasswordEncoder;

import com.healthcare.backend_health.dao.UserRepository;
import com.healthcare.backend_health.entity.AuthUser;

@SpringBootApplication
public class BackendHealthApplication {

	public static void main(String[] args) {
		SpringApplication.run(BackendHealthApplication.class, args);
	}

	@Bean
	CommandLineRunner commandLineRunner(UserRepository users, PasswordEncoder encoder) {
		return args -> {
			users.save(new AuthUser(1, "user", encoder.encode("password"), "ss@mail.com"));
			users.save(new AuthUser(2, "admin", encoder.encode("password"), "yy@mail.com"));

		};
	}

	@Bean
	public ModelMapper modelMapper() {
		return new ModelMapper();
	}

}
