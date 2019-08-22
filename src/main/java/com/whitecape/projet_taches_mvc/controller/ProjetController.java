package com.whitecape.projet_taches_mvc.controller;

import com.whitecape.projet_taches_mvc.entites.Projet;
import com.whitecape.projet_taches_mvc.repository.ProjetRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;



@Controller
@RequestMapping("projet")

public class ProjetController {
@Autowired
    private ProjetRepository projetRepository;
@GetMapping("index")

public String Home(Model model,
                   @RequestParam(name="page",defaultValue = "0")int p,
                   @RequestParam(name="size",defaultValue = "4")int s,
                   @RequestParam(name="motcle",defaultValue = "")String mc){
    Page<Projet> projetpage=
            projetRepository.chercher("%"+mc+"%",new PageRequest(p,s));
    model.addAttribute("listprojet",projetpage.getContent());
    int[] pages=new int[projetpage.getTotalPages()];
    model.addAttribute("pages",pages);
    model.addAttribute("size",s);
    model.addAttribute("pageCaurante",p);
    model.addAttribute("motcle",mc);
        return "home";
}

@GetMapping("/delete")
    public String delete( Long id, String motcle, int page,int size){
    projetRepository.deleteById(id);
    return "redirect:index?page="+page+"&size="+size+"&motcle="+motcle ;

}
}
