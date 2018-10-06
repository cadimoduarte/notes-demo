package com.zup.study.notesdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class NotesDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(NotesDemoApplication.class, args);
	}
}
