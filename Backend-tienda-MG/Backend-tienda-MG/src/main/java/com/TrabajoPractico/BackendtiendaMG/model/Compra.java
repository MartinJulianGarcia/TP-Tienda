package com.TrabajoPractico.BackendtiendaMG.model;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import jakarta.persistence.*;
import java.util.Date;

@Entity
public class Compra
{
    public Compra (int Ncompra, Date fecha, int importe,  String mediodepago, long id)
    {
        this.Ncompra=Ncompra;
        this.fecha=fecha;
        this.importe=importe;
        this.mediodepago=mediodepago;
        this.id=id;
    }

    public Compra(){}
    @Id
    long id;
    int Ncompra;
    Date fecha;
    int importe;
    String mediodepago;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public int getImporte() {
        return importe;
    }

    public void setImporte(int importe) {
        this.importe = importe;
    }

    public int getNcompra() {
        return Ncompra;
    }

    public void setNcompra(int ncompra) {
        Ncompra = ncompra;
    }

    public String getMediodepago() {
        return mediodepago;
    }

    public void setMediodepago(String mediodepago) {
        this.mediodepago = mediodepago;
    }


}
