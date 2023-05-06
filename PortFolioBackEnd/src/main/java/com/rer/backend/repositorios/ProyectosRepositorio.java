package com.rer.backend.repositorios;

import com.rer.backend.modelos.Proyectos;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProyectosRepositorio extends JpaRepository<Proyectos, Long> {
}
