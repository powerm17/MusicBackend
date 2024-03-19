package com.packt.musicdatabase.domain;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Music {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	private String songFile, title, artist, img;
	private int year;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "album")
	private Album album;

	public Music() {
	}

	public Music(String songFile, String title, String artist, String img, int year, Album album) {
		super();
		this.songFile = songFile;
		this.title = title;
		this.artist = artist;
		this.img = img;
		this.year = year;
		this.album = album;
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
	public Album getAlbum() {
		return album;
	}
	public void setAlbum(Album album) {
		this.album = album;
	}
}