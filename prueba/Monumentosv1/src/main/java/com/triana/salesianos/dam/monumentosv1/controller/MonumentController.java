package com.triana.salesianos.dam.monumentosv1.controller;

import com.triana.salesianos.dam.monumentosv1.models.Monument;
import com.triana.salesianos.dam.monumentosv1.repository.MonumentRepository;
import com.triana.salesianos.dam.monumentosv1.service.MonumentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/monuments")
public class MonumentController {

    @Autowired
    private MonumentService monumentService;

    @GetMapping
    public ResponseEntity<List<Monument>> listarMonumentos() {
        return new ResponseEntity<>(monumentService.findAll(), HttpStatus.OK);
    }

    @GetMapping
    public ResponseEntity<Monument> obtenerMonumento(@PathVariable long id) {
        Monument monumento = monumentService.findById(id);
        return monumento != null ? new ResponseEntity<>(monumento, HttpStatus.OK)
                : new ResponseEntity<>(HttpStatus.CREATED);
    }

    @GetMapping ("/crearMonumento")
    public ResponseEntity<Monument> crearMonumento(@RequestBody Monument monumento) {
           monumento = monumentService.save(monumento);
           return new ResponseEntity<>(monumento, HttpStatus.CREATED);
    }

    @DeleteMapping("/{id}}")
    public ResponseEntity<Void> eliminarMonument(@PathVariable long id) {
        monumentService.deleteById(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }


}
