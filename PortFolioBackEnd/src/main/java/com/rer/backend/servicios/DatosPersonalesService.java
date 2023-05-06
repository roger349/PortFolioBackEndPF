package com.rer.backend.servicios;

import com.rer.backend.modelos.DatosPersonales;
import com.rer.backend.repositorios.DatosPersonalesRepositorio;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DatosPersonalesService implements IDatosPersonalesService {
    @Autowired
    public DatosPersonalesRepositorio DatosPerRep;
    @Override
    public List<DatosPersonales> verDatosPersona() {
        return DatosPerRep.findAll();
    }
    @Override
    public void agregarDatosPersona(DatosPersonales per) {
        DatosPerRep.save(per);
    }
    @Override
    public void borrarDatosPersona(long id) {
        DatosPerRep.deleteById(id);
    }    
    @Override
    public void updateDatosPersona(DatosPersonales per){
        DatosPerRep.save(per);
    }   
}
 