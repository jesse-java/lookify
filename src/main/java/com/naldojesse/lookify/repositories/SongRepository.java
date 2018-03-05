package com.naldojesse.lookify.repositories;
import com.naldojesse.lookify.models.Song;
import org.springframework.data.domain.Slice;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface SongRepository extends CrudRepository<Song, Long>{
    List<Song> findAll();

    void deleteById(Long id);

    List<Song> findTop10ByOrderByRatingAsc();

    List<Song> findByArtist(String query);

}
