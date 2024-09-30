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
public class monument {

    @Id
    @GeneratedValue
    private int id;

    private String nombrePais, nombreCiudad, nombreMonumento, descripcion;

    private String imagen;
}
