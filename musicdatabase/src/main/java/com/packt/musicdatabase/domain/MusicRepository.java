package com.packt.musicdatabase.domain;

import org.springframework.data.repository.CrudRepository;

public interface MusicRepository extends CrudRepository<Music, Long> {
}