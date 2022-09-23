package com.sebas.CRUDspa.repository;

import com.sebas.CRUDspa.model.tipo_documento;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TDRepository extends JpaRepository<tipo_documento, Long> {

}
