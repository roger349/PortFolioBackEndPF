package com.rer.backend.controlador;

import com.rer.backend.modelos.Tecnologias;
import com.rer.backend.servicios.ITecnologiasService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/tecnologia")
public class TecnologiasController {
     @Autowired
    private ITecnologiasService ITecServ;
    
    @PostMapping("/agregardatosTec") 
    public void agregarDatosTec(@RequestBody Tecnologias tec){
        ITecServ.agregarDatosTec(tec);
    }  
    @GetMapping("/verdatosTec")
    @ResponseBody
    public List<Tecnologias> verDatosTec(){
        return ITecServ.verDatosTec();
    }
    @DeleteMapping("/deleteTec/{id}")
     public void borrarDatosTec(@PathVariable long id){
        ITecServ.borrarDatosTec(id);
     }    
    @PutMapping("/updatedatosTec")
    public void updateDatosTec(@RequestBody Tecnologias tec) {
        ITecServ.updateDatosTec(tec);
    }
}
