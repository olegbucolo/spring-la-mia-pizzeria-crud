package org.exercises.java.spring_la_mia_pizzeria_crud.controllers;

import org.exercises.java.spring_la_mia_pizzeria_crud.repositories.PizzaRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/pizzas")
public class PizzaController {
    
    private final PizzaRepository pr;

    public PizzaController(PizzaRepository pr){
        this.pr = pr;
    }

    @GetMapping
    public String pizzas(Model model){
        model.addAttribute("pizzas", pr.findAll());
        return "pizzas";
    }
}
