package com.whitecape.projet_taches_mvc.controller;

import com.whitecape.projet_taches_mvc.entites.Taches;
import com.whitecape.projet_taches_mvc.repository.TachesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
@RequestMapping("taches")
public class TacheController {
    @Autowired
    private TachesRepository tachesRepository;
    @GetMapping("index")
    public String home(Model model,
                       @RequestParam(name = "page",defaultValue = "0")int p,
                       @RequestParam(name = "size",defaultValue = "2")int s ,
                       @RequestParam(name="motcle",defaultValue = "")String mc){

        Page<Taches> pagetaches=
                tachesRepository.chercher("%"+mc+"%",new PageRequest(p,s));

        model.addAttribute("listtaches",pagetaches.getContent());
        int[] tache= new int[pagetaches.getTotalPages()];
        model.addAttribute("pages",tache);
        model.addAttribute("size",s);
        model.addAttribute("pageCaurante",p);
        model.addAttribute("motcle",mc);

        return "tache";
    }

}
