package com.rer.backend.controlador;

import com.rer.backend.modelos.Proyectos;
import com.rer.backend.repositorios.ProyectosRepositorio;
import com.rer.backend.servicios.IProyectosService;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
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
@CrossOrigin(origins = "http://localhost:4200")
public class ProyectosController {
    @Autowired
    private IProyectosService IProServ;
    @Autowired
    private ProyectosRepositorio PRepo;
    
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
    @PutMapping("/updatedatosPro/{id}")
    public ResponseEntity <Proyectos> updatedatosPro(@PathVariable("id") long id, @RequestBody Proyectos pro) {
      Optional <Proyectos> proy = PRepo.findById(id);
        if(proy.isPresent()){
            Proyectos proye = proy.get();
            proye.setTipo_proyecto(pro.getTipo_proyecto());
            proye.setDescripcion_proyecto(pro.getDescripcion_proyecto());
        return new ResponseEntity<>(PRepo.save(proye),HttpStatus.OK);   
        }
        else{
        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
}
