package com.example.twitterMami.controller;

import com.example.twitterMami.entity.TwitEntity;
import com.example.twitterMami.repository.TwitRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TwittController {

    @Autowired
    private TwitRepository twitRepository;

    @GetMapping("/")
    public String showPage(Model model ){
        model.addAttribute("data", twitRepository.findAll());
        return "index";
    }

    @GetMapping("/add")
    public String addTwitt(TwitEntity twitEntity){
        twitRepository.save(twitEntity);
        return "redirect:/";
    }
}
