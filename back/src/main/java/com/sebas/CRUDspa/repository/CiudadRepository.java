package com.sebas.CRUDspa.repository;

import com.sebas.CRUDspa.model.Ciudad;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CiudadRepository extends JpaRepository<Ciudad, Long> {

}
