package com.rer.backend.servicios;

import com.rer.backend.modelos.Proyectos;
import java.util.List;

public interface IProyectosService {
    
    public List<Proyectos> verDatosProy();
     
    public void agregarDatosProy(Proyectos proy);
  
    public void borrarDatosProy(long id);
     
    public void updateDatosProy(Proyectos proy);    
}
