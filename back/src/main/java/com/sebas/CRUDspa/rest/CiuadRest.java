package com.sebas.CRUDspa.rest;

import com.sebas.CRUDspa.model.Ciudad;
import com.sebas.CRUDspa.service.CiudadService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/ciudades")
public class CiuadRest {
    @Autowired
    private CiudadService ciudadService;
    
    @CrossOrigin(origins = "http://localhost:4200")
    @GetMapping
    private ResponseEntity<List<Ciudad>> getAllCiudades(){
        return ResponseEntity.ok(ciudadService.findAll());
    }

    @CrossOrigin(origins = "http://localhost:4200")
    @PostMapping("/guardar")
    public Ciudad saveCiudad(@RequestBody Ciudad ciudad) {

        return ciudadService.save(ciudad);
    }
}
