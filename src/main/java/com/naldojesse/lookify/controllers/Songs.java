package com.naldojesse.lookify.controllers;


import com.naldojesse.lookify.models.Song;
import com.naldojesse.lookify.services.SongService;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.Valid;

@Controller
public class Songs {
    private final SongService songService;
    public Songs(SongService songService) {
        this.songService = songService;
    }

    @RequestMapping("/dashboard")
    public String dashboard() {
        return "dashboard.jsp";
    }

    @RequestMapping("/songs/new")
    public String newSong() {
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
}