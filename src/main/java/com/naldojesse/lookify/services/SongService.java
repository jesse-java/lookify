package com.naldojesse.lookify.services;

import com.naldojesse.lookify.models.Song;
import com.naldojesse.lookify.repositories.SongRepository;
import org.springframework.data.domain.Slice;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class SongService {
    private SongRepository songRepository;
    public SongService (SongRepository songRepository) {
        this.songRepository = songRepository;
    }

    public List<Song> allSongs() {
        return songRepository.findAll();
    }

    public void addSong(Song song) {
        songRepository.save(song);
    }

    public Optional<Song> findSongById(Long id) {
        return songRepository.findById(id);
    }

    public void destroySong(Long id) {
        songRepository.deleteById(id);
    }


    public List<Song> getTopTen() {
        return songRepository.findTop10ByOrderByRatingAsc();
    }

    public List<Song> getSongsByArtist(String query) {
        return songRepository.findByArtist(query);
    }
}
