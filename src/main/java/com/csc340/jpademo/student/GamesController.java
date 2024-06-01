package com.csc340.jpademo.student;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/games")
public class GamesController {

    @Autowired
    GamesService gamesService;

    @GetMapping("/all")
    public String getAllGames(Model model) {
        model.addAttribute("gameList", gamesService.getAllGames());
        return "game-list";
    }
}