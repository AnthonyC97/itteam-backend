package com.itteam.prueba.service;

import com.itteam.prueba.DTO.CharactersDTO;
import com.itteam.prueba.DTO.OfferDTO;
import com.itteam.prueba.DTO.PriceDTO;
import com.itteam.prueba.model.Character;
import com.itteam.prueba.model.Offer;
import com.itteam.prueba.model.Price;
import com.itteam.prueba.repository.CharacterRepository;
import com.itteam.prueba.repository.OfferRepository;
import com.itteam.prueba.repository.PriceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class OfferService {
    @Autowired
    private PriceRepository priceRepository;
    @Autowired
    private  CharacterRepository characterRepository;
    @Autowired
    private OfferRepository offerRepository;

    public List<OfferDTO> findAll() {
        List<OfferDTO> Loffers = new ArrayList<>();
        List<Offer> offers = offerRepository.findAll();
        for(Offer offer: offers){
            List<CharactersDTO> characters = new  ArrayList<>();
            OfferDTO offerDTO = new OfferDTO();
            offerDTO.setId(offer.getId());
            offerDTO.setName(offer.getName());
            offerDTO.setName(offer.getName());
            List<Character> charactersEntity = offer.getCharacteristics();
            for(Character character: charactersEntity){
                CharactersDTO  chdto =  new CharactersDTO();
                chdto.setName(character.getName());
                chdto.setDescription(character.getDescription());
                chdto.setId(character.getId());
                chdto.setOffer(offer.getName());
                characters.add(chdto);
            }
            Price priceEntity = offer.getPrice();
            PriceDTO pdto = new PriceDTO();
            pdto.setPrecio(priceEntity.getPrecio());
           offerDTO.setPrice(pdto);
            offerDTO.setCharacteristics(characters);
            Loffers.add(offerDTO);

        }

        return Loffers;
    }

    public List<Offer> findAll(Sort sort) {
        return offerRepository.findAll(sort);
    }


    public Page<Offer> findAll(Pageable pageable) {
        return offerRepository.findAll(pageable);
    }

    public <S extends Offer> S save(S entity) {
        return offerRepository.save(entity);
    }

    public Optional<Offer> findById(Long id) {
        return offerRepository.findById(id);
    }


    public Boolean deleteById(Long id) {
        if (offerRepository.existsById(id)) {
            offerRepository.deleteById(id);
            return true;
        }
        return false;
    }

    public void delete(Offer entity) {
        offerRepository.delete(entity);
    }


}