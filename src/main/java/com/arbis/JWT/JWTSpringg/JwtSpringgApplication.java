package com.arbis.JWT.JWTSpringg;

import com.arbis.JWT.JWTSpringg.Service.UserService;
import com.arbis.JWT.JWTSpringg.domain.Role;
import com.arbis.JWT.JWTSpringg.domain.User;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.ArrayList;

@SpringBootApplication
public class JwtSpringgApplication {

	public static void main(String[] args) {
		SpringApplication.run(JwtSpringgApplication.class, args);


	}

	@Bean
	CommandLineRunner run(UserService userService){
		return args -> {
			userService.saveRole(new Role(null,"ROLE_USER"));
			userService.saveRole(new Role(null,"RROLE_MANAGER"));
			userService.saveRole(new Role(null,"ROLE_ADMIN"));
			userService.saveRole(new Role(null,"ROLE_SUPER_ADMIN"));

			userService.saveUser(new User(null,"Arbis Malasi",
					"arbiss1","arbiss1",new ArrayList<>()));

			userService.addRoleToUser("arbiss1","ROLE_ADMIN");
		};
	}
}
