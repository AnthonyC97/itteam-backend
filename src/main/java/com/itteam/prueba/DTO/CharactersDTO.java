package com.itteam.prueba.DTO;

import com.itteam.prueba.model.Offer;
import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
@Data
public class CharactersDTO {


        private Long id;
        private String name;
        private String description;

        private String offer;

    }
