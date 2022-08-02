package com.itteam.prueba.controller;


import com.itteam.prueba.model.Character;
import com.itteam.prueba.service.CharacterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping ("/characters")
public class CharacterController {

    @Autowired
    private CharacterService characterService;

    @GetMapping("{id}")
    private ResponseEntity<List<Character>> getAllCharacterByOffer (@PathVariable("id") Long idOffer){
        return ResponseEntity.ok(characterService.findAllByCharacter(idOffer)); // busca las caracteristicas de la oferta por Id

    }


}