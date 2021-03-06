package com.naldojesse.lookify.controllers;


import com.naldojesse.lookify.models.Song;
import com.naldojesse.lookify.services.SongService;
import org.springframework.data.domain.Slice;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;
import java.util.Optional;

@Controller
public class Songs {
    private final SongService songService;
    public Songs(SongService songService) {
        this.songService = songService;
    }

    @RequestMapping("/dashboard")
    public String dashboard(Model model) {
        List<Song> songs = songService.allSongs();
        model.addAttribute("songs", songs);
        return "dashboard.jsp";
    }

    @RequestMapping("/songs/new")
    public String newSong(@ModelAttribute("song") Song song) {
        return "new_song.jsp";
    }

    @PostMapping("/songs/new")
    public String createSong(@Valid @ModelAttribute("song") Song song, BindingResult result) {
        if (result.hasErrors()) {
            return "new_song.jsp";
        } else {
            songService.addSong(song);
            return "redirect:/dashboard";
        }
    }

    @RequestMapping("/songs/{index}")
    public String findSongByIndex(Model model, @PathVariable("index") Long index) {
        Optional<Song> song = songService.findSongById(index);
        if (song.isPresent()) {
            model.addAttribute("song", song.get());
        } else {
            return "redirect:/dashboard";
        }
        return "view_song.jsp";
    }

    @RequestMapping("/songs/delete/{id}")
    public String deleteSong(@PathVariable("id") Long id) {
        songService.destroySong(id);
        return "redirect:/dashboard";
    }

    @RequestMapping("/search/topTen")
    public String topTen(Model model) {
        songService.getTopTen();
        List<Song> songs =  songService.getTopTen();
        System.out.println(songs);
        model.addAttribute("songs", songs);
        return "topten.jsp";
    }

    @RequestMapping("/search")
    public String searchArtists(Model model, @RequestParam("query") String query) {
        List<Song> songs = songService.getSongsByArtist(query);
        model.addAttribute("songs", songs);
        return "search_result.jsp";
    }
}
