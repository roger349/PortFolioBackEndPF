package com.rer.backend.servicios;

import com.rer.backend.modelos.Tecnologias;
import java.util.List;

public interface ITecnologiasService {
    
    public List<Tecnologias> verDatosTec();
     
    public void agregarDatosTec(Tecnologias tec);
  
    public void borrarDatosTec(long id);
    
    public void updateDatosTec(Tecnologias tec);
}
