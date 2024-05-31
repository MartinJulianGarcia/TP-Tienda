package com.TrabajoPractico.BackendtiendaMG.servicios;
import com.TrabajoPractico.BackendtiendaMG.repositorio.Articulo_repositorio;
import com.TrabajoPractico.BackendtiendaMG.repositorio.Articulo_repositorio;
import com.TrabajoPractico.BackendtiendaMG.repositorio.Usuario_repositorio;
import org.springframework.beans.factory.annotation.Autowired;
import com.TrabajoPractico.BackendtiendaMG.model.*;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class Usuario_metodos_imp implements Usuario_metodos{

    @Override
    public Usuario CrearUsuario(Usuario u) {
        Usuario_repositorio.save(u);
        return u;
    }


    @Autowired
    private Usuario_repositorio Usuario_repositorio;

    public void ModificarUsuario(){};

}
