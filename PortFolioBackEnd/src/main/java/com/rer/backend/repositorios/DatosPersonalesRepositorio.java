package com.rer.backend.repositorios;

import com.rer.backend.modelos.DatosPersonales;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DatosPersonalesRepositorio extends JpaRepository<DatosPersonales, Long> {   
}
