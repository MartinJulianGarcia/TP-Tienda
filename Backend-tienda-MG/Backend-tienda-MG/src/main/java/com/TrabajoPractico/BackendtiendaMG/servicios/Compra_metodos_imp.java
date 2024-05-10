package com.TrabajoPractico.BackendtiendaMG.servicios;

import com.TrabajoPractico.BackendtiendaMG.model.Articulo;
import com.TrabajoPractico.BackendtiendaMG.model.Compra;
import com.TrabajoPractico.BackendtiendaMG.repositorio.Articulo_repositorio;
import com.TrabajoPractico.BackendtiendaMG.repositorio.Compra_repositorio;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.ArrayList;
import java.util.List;

public class Compra_metodos_imp implements Compra_metodos {

    @Autowired
    private Compra_repositorio Compra_repositorio;

    public Compra CrearCompra(Compra c) {

        this.Compra_repositorio.save(c);
        return c;

    }

   // public boolean eliminarcompra(compra c);


}
