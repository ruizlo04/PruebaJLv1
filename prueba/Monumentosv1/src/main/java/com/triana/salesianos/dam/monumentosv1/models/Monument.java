package com.triana.salesianos.dam.monumentosv1.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Monument {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(nullable = false, length = 2)
    private String codigoPais;

    @Column(nullable = false)
    private String nombrePais;

    @Column(nullable = false)
    private String nombreCiudad;

    @Column(nullable = false)
    private String nombreMonumento;

    @Column(nullable = false, length = 2000)
    private String descripcion;

    @Column(nullable = false)
    private String imagen;

    @Column(nullable = false)
    private String urlFoto;

    @Column(nullable = false)
    private double longitud;

    @Column(nullable = false)
    private double latitud;
}
