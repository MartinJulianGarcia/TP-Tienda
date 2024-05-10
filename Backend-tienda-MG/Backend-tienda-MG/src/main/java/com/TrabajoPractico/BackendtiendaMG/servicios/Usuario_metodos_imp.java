package com.TrabajoPractico.BackendtiendaMG.servicios;

import com.TrabajoPractico.BackendtiendaMG.repositorio.Articulo_repositorio;
import com.TrabajoPractico.BackendtiendaMG.repositorio.Usuario_repositorio;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.ArrayList;
import java.util.List;

public class Usuario_metodos_imp implements Usuario_metodos{

    @Override
    public void CrearUsuario() {

    }
    @Autowired
    private Usuario_repositorio Usuario_repositorio;

    public void ModificarUsuario(){};

}
