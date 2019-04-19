package com.example.twitterMami.controller;

import com.example.twitterMami.entity.TwitEntity;
import com.example.twitterMami.repository.TwitRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Optional;

@Controller
public class TwittController {

    @Autowired
    private TwitRepository twitRepository;

    @GetMapping("/")
    public String showPage(Model model ){
        model.addAttribute("data", twitRepository.findAll());
        return "index";
    }

    @PostMapping("/save")
    public String save(TwitEntity twitEntity){
        twitRepository.save(twitEntity);
        return "redirect:/";
    }

    @PutMapping("/delete")
    public String deleteTwitt(Integer id){
        twitRepository.deleteById(id);
        return "redirect:/";
    }

    @GetMapping("/findById")
    @ResponseBody
    public Optional<TwitEntity> findOne(Integer id){
        return twitRepository.findById(id);

    }
}
