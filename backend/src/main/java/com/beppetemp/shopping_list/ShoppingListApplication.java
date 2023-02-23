package com.beppetemp.shopping_list;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@SpringBootApplication
@EnableMongoRepositories
public class ShoppingListApplication {
	public static void main(String[] args) {
		SpringApplication.run(ShoppingListApplication.class, args);
	}
}
