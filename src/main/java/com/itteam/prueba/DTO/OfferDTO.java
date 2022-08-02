package com.itteam.prueba.DTO;

import com.itteam.prueba.model.Character;
import com.itteam.prueba.model.Price;
import lombok.Data;

import javax.persistence.*;
import java.util.List;
@Data
public class OfferDTO {


    private Long id;
    private String name;


    private PriceDTO price;
    private List<CharactersDTO> characteristics;


}
