package com.rer.backend.repositorios;

import com.rer.backend.modelos.Educacion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EducacionRepositorio extends JpaRepository<Educacion, Long> {    
}
