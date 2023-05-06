package com.rer.backend.repositorios;

import com.rer.backend.modelos.JornadaLaboral;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface JornadaLaboralRepositorio extends JpaRepository<JornadaLaboral, Long>{
}
