package com.triana.salesianos.dam.monumentosv1.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
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
    @GeneratedValue
    private long id;

    private String nombrePais, nombreCiudad, nombreMonumento, descripcion;
    private String imagen, urlFoto;
    private double longitud, latitud;
}
