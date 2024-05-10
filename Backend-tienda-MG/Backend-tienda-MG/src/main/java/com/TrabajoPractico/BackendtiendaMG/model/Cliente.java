package com.TrabajoPractico.BackendtiendaMG.model;

import org.springframework.boot.autoconfigure.SpringBootApplication;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
public class Cliente extends Usuario
{
    public Cliente (Long id, String Nombreusuario, String contraseña, String mail)
    {
        super(id,Nombreusuario,contraseña,mail);

    }

    public Cliente ()
    {

    }





}
