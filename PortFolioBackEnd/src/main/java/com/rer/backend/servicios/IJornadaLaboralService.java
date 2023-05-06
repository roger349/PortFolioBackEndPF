package com.rer.backend.servicios;

import com.rer.backend.modelos.JornadaLaboral;
import java.util.List;

public interface IJornadaLaboralService {
    
    public List<JornadaLaboral> verDatosJL();
     
    public void agregarDatosJL(JornadaLaboral jl);
  
    public void borrarDatosJL(long id);
     
    public void updateDatosJL(JornadaLaboral jl);
}
