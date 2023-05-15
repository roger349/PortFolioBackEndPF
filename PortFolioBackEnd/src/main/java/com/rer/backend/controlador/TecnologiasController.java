package com.rer.backend.controlador;

import com.rer.backend.modelos.Tecnologias;
import com.rer.backend.repositorios.TecnologiasRepositorio;
import com.rer.backend.servicios.ITecnologiasService;
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
@RequestMapping("/tecnologia")
@CrossOrigin(origins = "http://localhost:4200")
public class TecnologiasController {
    @Autowired
    private ITecnologiasService ITecServ;
    @Autowired
    private TecnologiasRepositorio TRepo;
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
    @PutMapping("/updatedatosTec/{id}")
    public ResponseEntity <Tecnologias> updatedatosTec(@PathVariable("id") long id, @RequestBody Tecnologias tec) {
        Optional <Tecnologias> tecno = TRepo.findById(id);
        if(tecno.isPresent()){
            Tecnologias tecn = tecno.get();
               tecn.setNombre_tecnologia(tec.getNombre_tecnologia());
               tecn.setPorcentaje_tecnologia(tec.getPorcentaje_tecnologia());
            return new ResponseEntity<>(TRepo.save(tecn),HttpStatus.OK);   
        }
        else{
        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
}
