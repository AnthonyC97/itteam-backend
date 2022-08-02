package com.itteam.prueba.controller;

import com.itteam.prueba.model.Price;
import com.itteam.prueba.service.PriceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/prices")
public class PriceController {

    @Autowired
    private PriceService priceService;

    @GetMapping
    private ResponseEntity<List<Price>> getAllPrice (){
        return ResponseEntity.ok(priceService.findAll());
    }

}
