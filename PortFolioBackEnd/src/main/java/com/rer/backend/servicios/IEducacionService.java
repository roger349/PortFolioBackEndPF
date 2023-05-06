package com.rer.backend.servicios;


import com.rer.backend.modelos.Educacion;
import java.util.List;

public interface IEducacionService {
    
    public List<Educacion> verDatosEdu();
     
    public void agregarDatosEdu(Educacion edu);
  
    public void borrarDatosEdu(long id);
     
    public void updateDatosEdu(Educacion edu);
}
