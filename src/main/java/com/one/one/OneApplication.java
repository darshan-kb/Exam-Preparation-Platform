package com.one.one;

import com.one.one.config.BeanConfig;
import com.one.one.dao.UserRepository;
import com.one.one.entities.User;
import com.one.one.services.SpotService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.password.PasswordEncoder;

@SpringBootApplication
public class OneApplication {

	public static void main(String[] args) {
		SpringApplication.run(OneApplication.class, args);
	}

	@Bean
	CommandLineRunner commandLineRunner(UserRepository users, PasswordEncoder encoder){
//		ApplicationContext context =
//				new AnnotationConfigApplicationContext(BeanConfig.class);
//
//		SpotService ss = context.getBean(SpotService.class);
//		cart.check
		return args -> {};
	}
}
