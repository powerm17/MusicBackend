package com.packt.musicdatabase;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.packt.musicdatabase.domain.Album;
import com.packt.musicdatabase.domain.AlbumRepository;
import com.packt.musicdatabase.domain.Music;
import com.packt.musicdatabase.domain.MusicRepository;
import com.packt.musicdatabase.domain.User;
import com.packt.musicdatabase.domain.UserRepository;

@SpringBootApplication
public class MusicdatabaseApplication {
	@Autowired 
	private MusicRepository repository;

	@Autowired
	private AlbumRepository arepository;
	
	@Autowired 
	private UserRepository urepository;


	public static void main(String[] args) {
		SpringApplication.run(MusicdatabaseApplication.class, args);
	}
	@Bean
	CommandLineRunner runner() {
		return args -> {
			Album album1 = new Album("Parachutes");
			Album album2 = new Album("Koi No Yokan");
			arepository.save(album1);
			arepository.save(album2);

			
			repository.save(new Music("https://www.google.com/url?sa=t&rct=j&q=&esrc=s&source=video&cd=&cad=rja&uact=8&ved=2ahUKEwiTwrTlnv-EAxXxC3kGHSbFBbsQtwJ6BAgNEAI&url=https%3A%2F%2Fwww.youtube.com%2Fwatch%3Fv%3D2XqpXmhM1Fc&usg=AOvVaw3XuF6JXScLFHP_oWU_hWAm&opi=89978449",
					"Don't Panic", "Coldplay", "https://m.media-amazon.com/images/I/61-m2ApVV4L._UF1000,1000_QL80_.jpg",
					2000, album1));
			
			repository.save(new Music("https://www.google.com/url?sa=t&rct=j&q=&esrc=s&source=web&cd=&cad=rja&uact=8&ved=2ahUKEwi0nanmn_-EAxUGDHkGHRBuBNsQ78AJegQIExAB&url=https%3A%2F%2Fwww.youtube.com%2Fwatch%3Fv%3DfZcAQ0kuw1s&usg=AOvVaw2qIK4BSct2Dy02c39OSO1f&opi=89978449",
					"Rosemary", "Deftones", "https://i.ytimg.com/vi/6Ii8E21rbvQ/hqdefault.jpg", 
					2012, album2));
			
			repository.save(new Music("https://www.google.com/url?sa=t&rct=j&q=&esrc=s&source=video&cd=&cad=rja&uact=8&ved=2ahUKEwiTwrTlnv-EAxXxC3kGHSbFBbsQtwJ6BAgNEAI&url=https%3A%2F%2Fwww.youtube.com%2Fwatch%3Fv%3D2XqpXmhM1Fc&usg=AOvVaw3XuF6JXScLFHP_oWU_hWAm&opi=89978449",
					"Sparks", "Coldplay", "https://m.media-amazon.com/images/I/61-m2ApVV4L._UF1000,1000_QL80_.jpg",
					2000, album1));
			
			// username: user password: user      
			urepository.save(new User("user",
			"$2a$10$x/ApNAgivZGFl0yQjhQ4K./oW8CM4rmWruhG1PSV/XZ0VnDHtuX.i",
			"USER"));
			
			// username: admin password: admin 
			urepository.save(new User("admin",
					"$2a$10$USSRQEf28hnYIYD8OkxRIOwt7X.35U2bqxbVuXPcddpgMGYTBljHS",
					"ADMIN"));
			    
			};  
		} 
}

