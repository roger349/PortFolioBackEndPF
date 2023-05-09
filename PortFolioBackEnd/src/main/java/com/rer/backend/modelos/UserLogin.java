package com.rer.backend.modelos;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="user_login")
public class UserLogin {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public int id_user_login;
    public String nombre_usuario;
    public String password_usuario;

    public UserLogin() {
    }
    public UserLogin(int id_user_login, String nombre_usuario, String password_usuario) {
        this.id_user_login = id_user_login;
        this.nombre_usuario = nombre_usuario;
        this.password_usuario = password_usuario;
    }

    public int getId_userLogin() {
        return id_user_login;
    }

    public void setId_userLogin(int id_user_login) {
        this.id_user_login = id_user_login;
    }

    public String getNombre_usuario() {
        return nombre_usuario;
    }

    public void setNombre_usuario(String nombre_usuario) {
        this.nombre_usuario = nombre_usuario;
    }

    public String getPassword_usuario() {
        return password_usuario;
    }

    public void setPassword_usuario(String password_usuario) {
        this.password_usuario = password_usuario;
    }
    
}
