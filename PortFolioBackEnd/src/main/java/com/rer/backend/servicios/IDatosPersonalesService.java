package com.rer.backend.servicios;


import com.rer.backend.modelos.DatosPersonales;
import java.util.List;

public interface IDatosPersonalesService {
    
    public List<DatosPersonales> verDatosPersona();
     
    public void agregarDatosPersona(DatosPersonales per);
  
    public void borrarDatosPersona(long id);
    
    public void updateDatosPersona(DatosPersonales per);
}
