package com.TrabajoPractico.BackendtiendaMG.servicios;

import com.TrabajoPractico.BackendtiendaMG.model.Articulo;

import java.util.ArrayList;
import java.util.List;

public interface Articulo_metodos {

    public Articulo CrearArticulo(Articulo a);

    public boolean eliminarart(Articulo a);

    public void IngresarStock(Articulo a);

    public void SacarStock();

    public void ModificarUsuario();

    public void ModificarArticulo();

    Articulo getArticuloBynombre (String nombre);

    List<Articulo> getArticuloBytipo (String tipo);



}

