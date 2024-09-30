package com.triana.salesianos.dam.monumentosv1.repository;

import com.triana.salesianos.dam.monumentosv1.models.Monument;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface MonumentRepository  extends JpaRepository<Monument, Long> {

}
