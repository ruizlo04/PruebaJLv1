package com.triana.salesianos.dam.monumentosv1;

import com.triana.salesianos.dam.monumentosv1.models.Monument;
import com.triana.salesianos.dam.monumentosv1.repository.MonumentRepository;
import jakarta.annotation.PostConstruct;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@RequiredArgsConstructor
@Component
public class InitData {

    private final MonumentRepository monumentRepository;

    @PostConstruct
    public void init() {
        Monument monument1 = new Monument();
    }
}
