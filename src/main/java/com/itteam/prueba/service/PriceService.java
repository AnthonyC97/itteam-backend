package com.itteam.prueba.service;


import com.itteam.prueba.model.Price;
import com.itteam.prueba.repository.PriceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;

@Service
public class PriceService {


    @Autowired
    private PriceRepository priceRepository;


    public List<Price> findAll() {
        return priceRepository.findAll();
    }

}