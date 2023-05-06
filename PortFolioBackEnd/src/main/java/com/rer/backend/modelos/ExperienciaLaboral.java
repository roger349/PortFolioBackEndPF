package com.rer.backend.modelos;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name ="experiencia_laboral")

public class ExperienciaLaboral {
    @Id
    @Column(name ="id_experiencia")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id_experiencia;
            
    @Column(name = "nombre_empresa", nullable=false)
    private String nombre_empresa;
    @Column(name = "fecha_inicio", nullable=false )
    private String fecha_inicio;
    @Column(name = "fecha_fin", nullable=false)
    private String fecha_fin;
    @Column(name = "descripcion_puesto" ,nullable=false)
    private String descripcion_puesto;

    public ExperienciaLaboral() {
    }
    public ExperienciaLaboral(long id_experiencia, String nombre_empresa, 
                              String fecha_inicio, String fecha_fin, 
                              String descripcion_puesto) {
        this.id_experiencia = id_experiencia;
        this.nombre_empresa = nombre_empresa;
        this.fecha_inicio = fecha_inicio;
        this.fecha_fin = fecha_fin;
        this.descripcion_puesto = descripcion_puesto;
    }

    public long getId_experiencia() {
        return id_experiencia;
    }

    public void setId_experiencia(long id_experiencia) {
        this.id_experiencia = id_experiencia;
    }

    public String getNombre_empresa() {
        return nombre_empresa;
    }

    public void setNombre_empresa(String nombre_empresa) {
        this.nombre_empresa = nombre_empresa;
    }

    public String getFecha_inicio() {
        return fecha_inicio;
    }

    public void setFecha_inicio(String fecha_inicio) {
        this.fecha_inicio = fecha_inicio;
    }

    public String getFecha_fin() {
        return fecha_fin;
    }

    public void setFecha_fin(String nombre_fin) {
        this.fecha_fin = nombre_fin;
    }

    public String getDescripcion_puesto() {
        return descripcion_puesto;
    }

    public void setDescripcion_puesto(String descripcion_puesto) {
        this.descripcion_puesto = descripcion_puesto;
    }
    
}

