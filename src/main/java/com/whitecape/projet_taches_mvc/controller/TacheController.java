package com.whitecape.projet_taches_mvc.controller;

import com.whitecape.projet_taches_mvc.entites.Taches;
import com.whitecape.projet_taches_mvc.repository.TachesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("taches")
public class TacheController {
    @Autowired
    private TachesRepository tachesRepository;
    @GetMapping("index")
    public String home(Model model){

        List<Taches>taches= tachesRepository.findAll();
        model.addAttribute("listtaches",taches.getContains());
        return "tache";
    }

}
