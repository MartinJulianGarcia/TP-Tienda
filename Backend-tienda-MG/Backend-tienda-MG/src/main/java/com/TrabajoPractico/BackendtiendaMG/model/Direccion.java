package com.TrabajoPractico.BackendtiendaMG.model;
import jakarta.persistence.*;
import java.util.Date;

public class Direccion
{
    public Direccion (String calle, String ciudad, String provincia, int cp)
    {
        this.calle=calle;
        this.ciudad=ciudad;
        this.provincia=provincia;
        this.cp=cp;

    }

    String calle;
     String ciudad;
     String provincia;
     int cp;

}