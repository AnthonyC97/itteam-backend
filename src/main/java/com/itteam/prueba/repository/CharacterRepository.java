package com.itteam.prueba.repository;

import com.itteam.prueba.model.Character;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CharacterRepository extends JpaRepository <Character, Long> {
}
