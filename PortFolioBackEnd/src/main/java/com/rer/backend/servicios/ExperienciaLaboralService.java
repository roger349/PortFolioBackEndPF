package com.rer.backend.servicios;

import com.rer.backend.modelos.ExperienciaLaboral;
import com.rer.backend.repositorios.ExperienciaLaboralRepositorio;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ExperienciaLaboralService implements IExperienciaLaboralService {
    
    @Autowired
    public ExperienciaLaboralRepositorio ExpLabRep;
   
    @Override
    public List<ExperienciaLaboral> verDatosEL() {
        return ExpLabRep.findAll();
    }
    @Override
    public void agregarDatosEL(ExperienciaLaboral exp) {
        ExpLabRep.save(exp);
    }
    
    @Override
    public void borrarDatosEL(long id) {
        ExpLabRep.deleteById(id);
    }

    @Override
    public void updateDatosEL(ExperienciaLaboral exp) {
        ExpLabRep.save(exp);
    }  
}
