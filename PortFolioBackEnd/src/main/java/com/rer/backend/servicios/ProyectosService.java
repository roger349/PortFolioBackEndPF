package com.rer.backend.servicios;

import com.rer.backend.modelos.Proyectos;
import com.rer.backend.repositorios.ProyectosRepositorio;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProyectosService implements IProyectosService {

    @Autowired
    public ProyectosRepositorio ProRep;
    
    @Override
    public List<Proyectos> verDatosProy() {
        return ProRep.findAll();
    }

    @Override
    public void agregarDatosProy(Proyectos proy) {
        ProRep.save(proy);
    }
    @Override
    public void borrarDatosProy(long id) {
        ProRep.deleteById(id);
    }
    @Override
    public void updateDatosProy(Proyectos proy) {
        ProRep.save(proy);
    }   
}
