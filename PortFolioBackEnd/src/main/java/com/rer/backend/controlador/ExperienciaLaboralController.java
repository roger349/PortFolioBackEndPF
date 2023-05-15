package com.rer.backend.controlador;

import com.rer.backend.modelos.ExperienciaLaboral;
import com.rer.backend.repositorios.ExperienciaLaboralRepositorio;
import com.rer.backend.servicios.IExperienciaLaboralService;
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
@RequestMapping("/experiencia")
@CrossOrigin(origins = "http://localhost:4200")
public class ExperienciaLaboralController {
    @Autowired
    private IExperienciaLaboralService IExpLServ;
    @Autowired
    private ExperienciaLaboralRepositorio ExpLRepo;
    
    @PostMapping("/agregardatosExp") 
    public void agregarDatosEL(@RequestBody ExperienciaLaboral exp){
       IExpLServ.agregarDatosEL(exp);
       
    }  
    @GetMapping("/verdatosExp")
    @ResponseBody
    public List<ExperienciaLaboral> verDatosEL(){
        return IExpLServ.verDatosEL();
    }
    @DeleteMapping("/deleteExperiencia/{id}")
     public void borrarDatosEL(@PathVariable long id){
        IExpLServ.borrarDatosEL(id);
     }    
    @PutMapping("/updatedatosExp/{id}")
    public ResponseEntity <ExperienciaLaboral> updateDatosEL(@PathVariable("id") long id, @RequestBody ExperienciaLaboral exp) {
        Optional <ExperienciaLaboral> ExpL = ExpLRepo.findById(id);
        if(ExpL.isPresent()){
            ExperienciaLaboral ExpLa = ExpL.get();
               ExpLa.setNombre_empresa(exp.getNombre_empresa());
               ExpLa.setFecha_inicio(exp.getFecha_inicio());
               ExpLa.setFecha_fin(exp.getFecha_fin());
               ExpLa.setDescripcion_puesto(exp.getDescripcion_puesto());
            return new ResponseEntity<>(ExpLRepo.save(ExpLa),HttpStatus.OK);   
        }
        else{
        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }     
}
