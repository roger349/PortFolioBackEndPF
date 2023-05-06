package com.rer.backend.servicios;

import com.rer.backend.modelos.Educacion;
import com.rer.backend.repositorios.EducacionRepositorio;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EducacionService implements IEducacionService {
    @Autowired
    public EducacionRepositorio EduRepo;
    
    @Override
    public List<Educacion> verDatosEdu() {
        return EduRepo.findAll();
    }

    @Override
    public void agregarDatosEdu(Educacion edu) {
        EduRepo.save(edu);
    }

    @Override
    public void borrarDatosEdu(long id) {
        EduRepo.deleteById(id);
    }    
 
    @Override
    public void updateDatosEdu(Educacion edu) {
        EduRepo.save(edu);
    }   
}
