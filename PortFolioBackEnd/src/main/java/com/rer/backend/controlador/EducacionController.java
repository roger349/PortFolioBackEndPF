package com.rer.backend.controlador;

import com.rer.backend.modelos.Educacion;
import com.rer.backend.repositorios.EducacionRepositorio;
import com.rer.backend.servicios.IEducacionService;
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
@RequestMapping("/educacion")
@CrossOrigin(origins = "http://localhost:4200")
public class EducacionController { 
    
    @Autowired
    private IEducacionService IEduServ;
    @Autowired
    private EducacionRepositorio ERepo;
    
    @PostMapping("/agregardatosEdu") 
    public void agregarDatosEdu(@RequestBody Educacion edu){
        IEduServ.agregarDatosEdu(edu);
    }  
    @GetMapping("/verdatosEdu")
    @ResponseBody
    public List<Educacion> verDatosEdu(){
        return IEduServ.verDatosEdu();
    }
    @DeleteMapping("/deletedatosEdu/{id}")
     public void deleteEdu(@PathVariable long id){
        IEduServ.borrarDatosEdu(id);
     }    
    @PutMapping("/updatedatosEdu/{id}")
    public ResponseEntity <Educacion> updatedatosEdu(@PathVariable("id") long id, @RequestBody Educacion edu) {
        Optional <Educacion> Educ = ERepo.findById(id);
        if(Educ.isPresent()){
            Educacion Educa = Educ.get();
               Educa.setTitulo(edu.getTitulo());
               Educa.setCondicion(edu.getCondicion());
               Educa.setInstitucion(edu.getInstitucion());
            return new ResponseEntity<>(ERepo.save(Educa),HttpStatus.OK);   
        }
        else{
        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
}
