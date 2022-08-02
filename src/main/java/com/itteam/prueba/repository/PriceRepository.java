package com.itteam.prueba.repository;

import com.itteam.prueba.model.Price;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PriceRepository extends JpaRepository <Price, Long> {
}
