package com.packt.musicdatabase.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.packt.musicdatabase.domain.Music;
import com.packt.musicdatabase.domain.MusicRepository;

@RestController
public class MusicController {
	@Autowired
	private MusicRepository repository;
	
	@RequestMapping("/musics")
	public Iterable<Music> getMusics() {
		return repository.findAll();
	}

}
