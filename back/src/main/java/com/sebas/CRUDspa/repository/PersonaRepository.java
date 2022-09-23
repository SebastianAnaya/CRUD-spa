package com.sebas.CRUDspa.repository;

import com.sebas.CRUDspa.model.Persona;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonaRepository extends JpaRepository<Persona, Long> {

}
