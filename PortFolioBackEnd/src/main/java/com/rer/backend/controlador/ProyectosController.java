package com.rer.backend.controlador;

import com.rer.backend.modelos.Proyectos;
import com.rer.backend.servicios.IProyectosService;
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
@RequestMapping("/proyecto")
public class ProyectosController {
     @Autowired
    private IProyectosService IProServ;
    
    @PostMapping("/agregardatosPro") 
    public void agregarDatosProy(@RequestBody Proyectos proy){
        IProServ.agregarDatosProy(proy);
    }  
    @GetMapping("/verdatosPro")
    @ResponseBody
    public List<Proyectos> verDatosProy(){
        return IProServ.verDatosProy();
    }
    @DeleteMapping("/deletePro/{id}")
     public void borrarDatosProy(@PathVariable long id){
        IProServ.borrarDatosProy(id);
     }    
    @PutMapping("/updatedatosPro")
    public void updateDatosProy(@RequestBody Proyectos proy) {
        IProServ.updateDatosProy(proy);
    }
}
