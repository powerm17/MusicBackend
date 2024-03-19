package com.packt.musicdatabase.domain;

import org.springframework.data.repository.CrudRepository;
import java.util.List;

import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface MusicRepository extends CrudRepository<Music, Long> {
	List<Music> findByTitle(@Param("title") String title);
	List<Music> findByArtist(@Param("artist") String artist);
}