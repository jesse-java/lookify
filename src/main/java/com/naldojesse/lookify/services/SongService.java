package com.naldojesse.lookify.services;

import com.naldojesse.lookify.models.Song;
import com.naldojesse.lookify.repositories.SongRespository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SongService {
    private SongRespository songRespository;
    public SongService (SongRespository songRespository) {
        this.songRespository = songRespository;
    }

    public List<Song> allSongs() {
        return songRespository.findAll();
    }

    public void addSong(Song song) {
        songRespository.save(song);
    }

}
