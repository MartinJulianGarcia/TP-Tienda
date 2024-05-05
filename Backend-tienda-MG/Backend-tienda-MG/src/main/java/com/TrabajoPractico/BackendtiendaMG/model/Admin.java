package com.TrabajoPractico.BackendtiendaMG.model;

import org.springframework.boot.autoconfigure.SpringBootApplication;

import jakarta.persistence.*;


public class Admin extends Usuario
{
    public Admin (Long id, String Nombreusuario, String contraseña, String mail)
    {
        super(id,Nombreusuario,contraseña,mail);
        this.id=id;
    }

    @Id
    Long id;

    public Long Returncodigo()
    {
        return id;
    }

    @Override
    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public Long getId() {
        return id;
    }
}


