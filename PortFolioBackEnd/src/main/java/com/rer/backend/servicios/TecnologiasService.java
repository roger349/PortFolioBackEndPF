package com.rer.backend.servicios;


import com.rer.backend.modelos.Tecnologias;
import com.rer.backend.repositorios.TecnologiasRepositorio;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TecnologiasService implements ITecnologiasService {

    @Autowired
    public TecnologiasRepositorio TecRep;
    
    @Override
    public List<Tecnologias> verDatosTec() {
        return TecRep.findAll();
    }

    @Override
    public void agregarDatosTec(Tecnologias tec) {
        TecRep.save(tec); 
    }

    @Override
    public void borrarDatosTec(long id) {
        TecRep.deleteById(id);
    }

    @Override
    public void updateDatosTec(Tecnologias tec) {
        TecRep.save(tec);
    }  
}
