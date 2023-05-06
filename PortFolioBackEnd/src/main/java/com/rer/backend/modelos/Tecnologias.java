package com.rer.backend.modelos;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="tecnologias")
public class Tecnologias {
    @Id
    @Column(name="id_tecnologias")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id_tecnologia;
      
    @Column(name = "nombre_tecnologia", nullable = false)
    private String nombre_tecnologia;
    @Column(name = "porcentaje_tecnologia",nullable = false)
    private int porcentaje_tecnologia;

    public Tecnologias() {
    }
    public Tecnologias(long id_tecnologia, String nombre_tecnologia, int porcentaje_tecnologia) {
        this.id_tecnologia = id_tecnologia;
        this.nombre_tecnologia = nombre_tecnologia;
        this.porcentaje_tecnologia = porcentaje_tecnologia;
    }

    public long getId_tecnologia() {
        return id_tecnologia;
    }

    public void setId_tecnologia(long id_tecnologia) {
        this.id_tecnologia = id_tecnologia;
    }

    public String getNombre_tecnologia() {
        return nombre_tecnologia;
    }

    public void setNombre_tecnologia(String nombre_tecnologia) {
        this.nombre_tecnologia = nombre_tecnologia;
    }

    public int getPorcentaje_tecnologia() {
        return porcentaje_tecnologia;
    }

    public void setPorcentaje_tecnologia(int porcentaje_tecnologia) {
        this.porcentaje_tecnologia = porcentaje_tecnologia;
    }
    
}
