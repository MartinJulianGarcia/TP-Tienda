package com.TrabajoPractico.BackendtiendaMG.servicios;

import com.TrabajoPractico.BackendtiendaMG.repositorio.Articulo_repositorio;
import com.TrabajoPractico.BackendtiendaMG.repositorio.Compra_repositorio;
import org.springframework.beans.factory.annotation.Autowired;

public class Compra_metodos_imp implements Compra_metodos {

    @Override
    public void CrearCompra() {

    }

   @Autowired
   private Compra_repositorio Compra_repositorio;
}
