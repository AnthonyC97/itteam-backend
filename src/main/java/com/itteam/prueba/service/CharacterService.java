package com.itteam.prueba.service;


import com.itteam.prueba.model.Character;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



import java.util.ArrayList;
import java.util.List;

@Service
public class CharacterService {

    @Autowired
    private CharacterService characterService ;

    public List<Character> findAll() {
        return characterService.findAll();
    }

    public List<Character> findByIdOffer() {
        return characterService.findAll();
    }
    public List<Character> findAllByCharacter (Long id){
        List<Character> characterRespuesta= new ArrayList<>(); // una nueva lista de characters
        List<Character> character= characterService.findAll();
        for (int i=0; i<character.size(); i++) {
            if (character.get(i).getOffer().getId()==id) {
                characterRespuesta.add(character.get(i)); // recorro el id
            }
        }
        return characterRespuesta;
    }
}