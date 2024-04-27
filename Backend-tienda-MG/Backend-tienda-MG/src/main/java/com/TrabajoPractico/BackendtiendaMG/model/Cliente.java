package com.TrabajoPractico.BackendtiendaMG.model;

import org.springframework.boot.autoconfigure.SpringBootApplication;

import jakarta.persistence.*;
public class Cliente extends Usuario
{
    public Cliente (long id, String Nombreusuario, String contraseña, String mail)
    {
        super(id,Nombreusuario,contraseña,mail);
    }

    public Cliente ()
    {

    }





}
