package com.rer.backend.modelos;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="proyectos")
public class Proyectos {
    @Id
    @Column(name="id_proyecto")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id_proyecto;
      
    @Column(name = "tipo_proyecto", length = 45, nullable = false)
    private String tipo_proyecto;
    @Column(name = "descripcion_proyecto", length = 200, nullable = false)
    private String descripcion_proyecto;

    public Proyectos() {
    }
    public Proyectos(long id_proyecto, String tipo_proyecto, String descripcion_proyecto) {
        this.id_proyecto = id_proyecto;
        this.tipo_proyecto = tipo_proyecto;
        this.descripcion_proyecto = descripcion_proyecto;
    }

    public long getId_proyecto() {
        return id_proyecto;
    }

    public void setId_proyecto(long id_proyecto) {
        this.id_proyecto = id_proyecto;
    }

    public String getTipo_proyecto() {
        return tipo_proyecto;
    }

    public void setTipo_proyecto(String tipo_proyecto) {
        this.tipo_proyecto = tipo_proyecto;
    }

    public String getDescripcion_proyecto() {
        return descripcion_proyecto;
    }

    public void setDescripcion_proyecto(String descripcion_proyecto) {
        this.descripcion_proyecto = descripcion_proyecto;
    }
    
}
