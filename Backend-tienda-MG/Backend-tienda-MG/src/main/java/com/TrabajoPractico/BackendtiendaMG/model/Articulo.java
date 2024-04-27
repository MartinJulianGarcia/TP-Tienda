package com.TrabajoPractico.BackendtiendaMG.model;    // esto hace que todas mis clases se importen juntas

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import jakarta.persistence.*;

import java.util.ArrayList;



@Entity
public class Articulo
{
    public Articulo (int idart, String Nombre,int stock, int precio, String temporada)
    {
        this.idart=idart;
        this.Nombreusuario=Nombre;
        this.stock=stock;
        this.temporada=temporada;
        this.precio=precio;

    }
    public Articulo ()
    {
    }

    @Id
    int idart;
    String Nombreusuario;
    int stock;
    int precio;
    String temporada;

    public int getIdart() {
        return idart;
    }

    public void setIdart(int idart) {
        this.idart = idart;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public String getNombreusuario() {
        return Nombreusuario;
    }

    public void setNombreusuario(String nombreusuario) {
        Nombreusuario = nombreusuario;
    }

    public String getTemporada() {
        return temporada;
    }

    public void setTemporada(String temporada) {
        this.temporada = temporada;
    }

    public static String retornarclase ()
        {
            return "Esta es la clase Articulo";

        }

}
