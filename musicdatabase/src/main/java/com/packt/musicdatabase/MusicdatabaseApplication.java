package com.packt.musicdatabase;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.packt.musicdatabase.domain.Music;
import com.packt.musicdatabase.domain.MusicRepository;

@SpringBootApplication
public class MusicdatabaseApplication {
	@Autowired
	private MusicRepository repository;

	public static void main(String[] args) {
		SpringApplication.run(MusicdatabaseApplication.class, args);
	}

	@Bean
	CommandLineRunner runner() {
		return args -> {
			repository.save(new Music("https://www.google.com/url?sa=t&rct=j&q=&esrc=s&source=video&cd=&cad=rja&uact=8&ved=2ahUKEwiTwrTlnv-EAxXxC3kGHSbFBbsQtwJ6BAgNEAI&url=https%3A%2F%2Fwww.youtube.com%2Fwatch%3Fv%3D2XqpXmhM1Fc&usg=AOvVaw3XuF6JXScLFHP_oWU_hWAm&opi=89978449",
					"Don't Panic", "Coldplay",
					"https://m.media-amazon.com/images/I/61-m2ApVV4L._UF1000,1000_QL80_.jpg",
					2000));
			repository.save(new Music("https://www.google.com/url?sa=t&rct=j&q=&esrc=s&source=web&cd=&cad=rja&uact=8&ved=2ahUKEwi0nanmn_-EAxUGDHkGHRBuBNsQ78AJegQIExAB&url=https%3A%2F%2Fwww.youtube.com%2Fwatch%3Fv%3DfZcAQ0kuw1s&usg=AOvVaw2qIK4BSct2Dy02c39OSO1f&opi=89978449",
					"Rosemary", "Deftones",
					"https://i.ytimg.com/vi/6Ii8E21rbvQ/hqdefault.jpg",
					2012));
			repository.save(new Music("https://www.google.com/url?sa=t&rct=j&q=&esrc=s&source=video&cd=&cad=rja&uact=8&ved=2ahUKEwiTwrTlnv-EAxXxC3kGHSbFBbsQtwJ6BAgNEAI&url=https%3A%2F%2Fwww.youtube.com%2Fwatch%3Fv%3D2XqpXmhM1Fc&usg=AOvVaw3XuF6JXScLFHP_oWU_hWAm&opi=89978449",
					"Don't Panic", "Coldplay",
					"https://m.media-amazon.com/images/I/61-m2ApVV4L._UF1000,1000_QL80_.jpg",
					2000));
		};
	}
}
