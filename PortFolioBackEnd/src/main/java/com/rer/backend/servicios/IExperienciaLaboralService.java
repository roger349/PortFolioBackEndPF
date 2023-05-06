package com.rer.backend.servicios;

import com.rer.backend.modelos.ExperienciaLaboral;
import java.util.List;

public interface IExperienciaLaboralService {
    
    public List<ExperienciaLaboral> verDatosEL();
     
    public void agregarDatosEL(ExperienciaLaboral exp);
  
    public void borrarDatosEL(long id);
       
    public void updateDatosEL(ExperienciaLaboral exp);
}
