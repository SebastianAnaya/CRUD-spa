package com.sebas.CRUDspa.rest;

import com.sebas.CRUDspa.model.Persona;
import com.sebas.CRUDspa.repository.PersonaRepository;
import com.sebas.CRUDspa.service.PersonaService;
import com.sebas.CRUDspa.service.TDService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping ("/personas/")
public class PersonaRest {
    @Autowired
    private PersonaService personaService;

    @Autowired
    private PersonaRepository personaRepository;

    @Autowired

    @CrossOrigin(origins = "http://localhost:4200")
    @GetMapping
    private ResponseEntity <List<Persona>> getAllPersonas (){
        return ResponseEntity.ok(personaService.findAll());
    }

    @CrossOrigin(origins = "http://localhost:4200")
    @PostMapping("/guardar")
    public Persona saveUsuario(@RequestBody Persona usuario) {

        return personaService.save(usuario);
    }
    @PostMapping
    private ResponseEntity<Persona> savePersona(@RequestBody Persona persona){
        try {
            Persona personaG =personaService.save(persona);
            return ResponseEntity.created(new URI("/personas/"+personaG.getId())).body(personaG);
        }
        catch (Exception e) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
        }
    }

    @CrossOrigin(origins = "http://localhost:4200")
    @DeleteMapping("/eliminar/{id}")
    public void deletePersona(@PathVariable ("id") int id){
        Persona person = new Persona();
         List<Persona> usuarios = personaService.findAll();
         for(int i = 0;i< usuarios.size();i++){
                       if (usuarios.get(i).getId() == id) {
                    person=usuarios.get(i);
                        }
         }


            personaRepository.delete(person);

    }

}
