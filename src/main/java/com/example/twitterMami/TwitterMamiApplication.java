package com.example.twitterMami;

import com.example.twitterMami.entity.TwitEntity;
import com.example.twitterMami.repository.TwitRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TwitterMamiApplication  {
	@Autowired
	private TwitRepository twitRepository;

	public static void main(String[] args) {
		SpringApplication.run(TwitterMamiApplication.class, args);
	}
}