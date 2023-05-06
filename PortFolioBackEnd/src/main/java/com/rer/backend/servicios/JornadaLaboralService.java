package com.rer.backend.servicios;

import com.rer.backend.modelos.JornadaLaboral;
import com.rer.backend.repositorios.JornadaLaboralRepositorio;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class JornadaLaboralService implements IJornadaLaboralService {

    @Autowired
    public JornadaLaboralRepositorio JorLabRep;
    
    @Override
    public List<JornadaLaboral> verDatosJL() {
        return JorLabRep.findAll();
    }

    @Override
    public void agregarDatosJL(JornadaLaboral jl) {
        JorLabRep.save(jl);
    }

    @Override
    public void borrarDatosJL(long id) {
        JorLabRep.deleteById(id);
    }

    @Override
    public void updateDatosJL(JornadaLaboral jl) {
        JorLabRep.save(jl);
    }
}
