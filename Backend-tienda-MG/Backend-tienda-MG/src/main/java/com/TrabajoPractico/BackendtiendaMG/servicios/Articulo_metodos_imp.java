package com.TrabajoPractico.BackendtiendaMG.servicios;

import com.TrabajoPractico.BackendtiendaMG.repositorio.Articulo_repositorio;
import org.springframework.beans.factory.annotation.Autowired;

public class Articulo_metodos_imp implements Articulo_metodos {


    @Override
    public void CrearArticulo() {

    }

    @Autowired
   private Articulo_repositorio Articulo_repositorio;


    public void IngresarStock(){};

   public void SacasStock(){};

   public void ModificarUsuario(){};

   public void ModificarArticulo(){};

}
