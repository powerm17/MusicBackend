package com.packt.musicdatabase.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Music {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	private String songFile, title, artist, img;
	private int year;
	
	public Music() {}
	
	public Music(String songFile, String title,
			String artist, String img, int year) {
	super();
	this.songFile = songFile;
	this.title = title;
	this.artist = artist;
	this.img = img;
	this.year = year;
}

	public String getSongFile() {
		return songFile;
	}

	public void setSongFile(String songFile) {
		this.songFile = songFile;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getArtist() {
		return artist;
	}

	public void setArtist(String artist) {
		this.artist = artist;
	}

	public String getImg() {
		return img;
	}

	public void setImg(String img) {
		this.img = img;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}
}