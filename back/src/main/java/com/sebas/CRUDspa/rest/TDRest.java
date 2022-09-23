package com.sebas.CRUDspa.rest;
import com.sebas.CRUDspa.model.tipo_documento;
import com.sebas.CRUDspa.service.TDService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping ("/documentos")
public class TDRest {

    @Autowired
    private TDService tdService;

    @GetMapping
    private ResponseEntity<List<tipo_documento>> getAllTD(){
       return ResponseEntity.ok(tdService.findAll());
    }
}
