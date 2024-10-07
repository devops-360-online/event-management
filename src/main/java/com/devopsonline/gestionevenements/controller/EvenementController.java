package com.devopsonline.gestionevenements.controller;

import com.devopsonline.gestionevenements.model.Evenement;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class EvenementController {

    @GetMapping("/evenements")
    public List<Evenement> obtenirEvenements() {
        return Arrays.asList(
                new Evenement(1L, "Conférence DevOps", "2024-11-10"),
                new Evenement(2L, "Atelier Spring Boot", "2024-12-05")
        );
    }
}
