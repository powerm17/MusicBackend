package com.packt.musicdatabase.domain;

import org.springframework.data.repository.CrudRepository;

public interface AlbumRepository extends CrudRepository<Album, Long>
{
}
