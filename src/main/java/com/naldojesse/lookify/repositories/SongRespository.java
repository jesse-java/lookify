package com.naldojesse.lookify.repositories;
import com.naldojesse.lookify.models.Song;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface SongRespository extends CrudRepository<Song, Long>{
    List<Song> findAll();

    void deleteById(Long id);

}
