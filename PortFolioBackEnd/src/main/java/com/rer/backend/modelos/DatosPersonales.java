package com.rer.backend.modelos;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="datos_personales")
public class DatosPersonales {
      @Id
      @Column(name = "id_datos_personales")
      @GeneratedValue(strategy = GenerationType.AUTO)
      private long id_datos_personales;
      
    
      @Column(name = "nombre", length = 45, nullable = false)
      private String nombre;
      @Column(name = "apellido", length = 45, nullable = false)
      private String apellido;
      @Column(name = "fecha_nacimiento ", length = 45, nullable = false)
      private String fecha_nacimiento;
      @Column(name = "estado_civil", length = 45, nullable = false)
      private String estado_civil;
      @Column(name = "correo_electronico", length = 45, nullable = false)
      private String correo_electronico;

      public DatosPersonales() {
      }
      public DatosPersonales(long id_datos_personales, String nombre,
                           String apellido, String fecha_nacimiento, 
                           String estado_civil, String correo_electronico) {
          
        this.id_datos_personales = id_datos_personales;
        this.nombre = nombre;
        this.apellido = apellido;
        this.fecha_nacimiento = fecha_nacimiento;
        this.estado_civil = estado_civil;
        this.correo_electronico = correo_electronico;
      }

    public long getId_datos_personales() {
        return id_datos_personales;
    }

    public void setId_datos_personales(long id_datos_personales) {
        this.id_datos_personales = id_datos_personales;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getFecha_nacimiento() {
        return fecha_nacimiento;
    }

    public void setFecha_nacimiento(String fecha_nacimiento) {
        this.fecha_nacimiento = fecha_nacimiento;
    }

    public String getEstado_civil() {
        return estado_civil;
    }

    public void setEstado_civil(String estado_civil) {
        this.estado_civil = estado_civil;
    }

    public String getCorreo_electronico() {
        return correo_electronico;
    }

    public void setCorreo_electronico(String correo_electronico) {
        this.correo_electronico = correo_electronico;
    }
      
}


