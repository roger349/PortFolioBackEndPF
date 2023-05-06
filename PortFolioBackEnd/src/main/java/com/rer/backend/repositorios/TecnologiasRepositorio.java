package com.rer.backend.repositorios;

import com.rer.backend.modelos.Tecnologias;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TecnologiasRepositorio extends JpaRepository<Tecnologias, Long> {    
}
