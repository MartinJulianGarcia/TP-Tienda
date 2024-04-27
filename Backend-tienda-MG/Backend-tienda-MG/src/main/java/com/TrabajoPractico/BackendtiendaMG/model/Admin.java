package com.TrabajoPractico.BackendtiendaMG.model;

import org.springframework.boot.autoconfigure.SpringBootApplication;

import jakarta.persistence.*;


public class Admin extends Usuario
{
    public Admin (long id, String Nombreusuario, String contraseña, String mail)
    {
        super(id,Nombreusuario,contraseña,mail);
        this.id=id;
    }

    @Id
    long id;

    public long Returncodigo()
    {
        return id;
    }

    @Override
    public void setId(long id) {
        this.id = id;
    }

    @Override
    public long getId() {
        return id;
    }
}


