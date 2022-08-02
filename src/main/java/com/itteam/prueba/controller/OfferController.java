package com.itteam.prueba.controller;

import com.itteam.prueba.DTO.OfferDTO;
import com.itteam.prueba.model.Offer;
import com.itteam.prueba.service.OfferService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;
import java.util.List;

@RestController
@RequestMapping ("/offers")
public class OfferController {

    @Autowired
    private OfferService offerService;

    @GetMapping
    private ResponseEntity<List<OfferDTO>> getAllOffer (){
        return ResponseEntity.ok(offerService.findAll()); // va listar todas las ofertas
    }

    @PostMapping
    private ResponseEntity<Offer> saveOffers (@RequestBody Offer offer){
        try {
            Offer offerGuardada = offerService.save(offer);
            return ResponseEntity.created(new URI("/offers/"+offerGuardada.getId())).body(offerGuardada);
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).build(); // aca se crean y se guardan las ofertas
        }
    }
    @DeleteMapping (value = "delete/{id}")
    private ResponseEntity<Boolean> deleteOffer (@PathVariable ("id") Long id){
        return ResponseEntity.ok(offerService.deleteById(id));
    }

}
