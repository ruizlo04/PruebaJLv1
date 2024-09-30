package com.triana.salesianos.dam.monumentosv1.service;

import com.triana.salesianos.dam.monumentosv1.models.Monument;
import com.triana.salesianos.dam.monumentosv1.repository.MonumentRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class MonumentService{

    //Atributos
    private final MonumentRepository repository;


    //Métodos

    public List<Monument> findAll() {

        return repository.findAll();
    }


    public Optional<Monument> findById(Long id) {

        return repository.findById(id);
    }

    public Monument save(Monument monumento) {

        return repository.save(monumento);
    }

    public Monument edit(Monument monumento) {

        return repository.save(monumento);
    }

    public void deleteById(Long id) {

        repository.deleteById(id);
    }
}
