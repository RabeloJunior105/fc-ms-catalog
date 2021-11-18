package com.codeflix.mscatalog;

import com.codeflix.mscatalog.domain.entity.Category;
import com.codeflix.mscatalog.domain.entity.Genre;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class MsCatalogApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(MsCatalogApplication.class, args);
	}
	@Override
	public void run(String... args) throws Exception {
	}

}
