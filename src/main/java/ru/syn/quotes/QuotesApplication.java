package ru.syn.quotes;

import jakarta.persistence.*;
import org.hibernate.annotations.GenericGenerator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


import org.springframework.data.annotation.Id;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import ru.syn.quotes.services.QuoteService;

import java.util.Map;
import java.util.UUID;

@SpringBootApplication



public class QuotesApplication implements CommandLineRunner {





	@Autowired
	QuoteService service;


	public static void main(String[] args) {
		SpringApplication.run(QuotesApplication.class, args);
	}


	@Override
	public void run(String... args) throws Exception {


	}
}

