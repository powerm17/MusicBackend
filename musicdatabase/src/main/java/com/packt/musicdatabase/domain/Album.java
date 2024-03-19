package com.packt.musicdatabase.domain;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonIgnore;



@Entity
public class Album {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long albumid;
	private String name;

	@OneToMany(cascade = CascadeType.ALL, mappedBy = "album")
	@JsonIgnore
	private List<Music> songs;

	public Album() {
	}

	public Album(String name) {
		super();
		this.setName(name);
	}

	public long getAlbumid() {
		return albumid;
	}

	public void setAlbumid(long albumid) {
		this.albumid = albumid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	public List<Music> getSongs() {
		return songs;
	}
	public void setSongs(List<Music> songs) {
		this.songs = songs;
	}

}