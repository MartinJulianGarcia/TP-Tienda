package com.TrabajoPractico.BackendtiendaMG.model;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
public abstract class Usuario
    {
        public Usuario (Long id, String Nombreusuario, String contraseña, String mail)
        { this.id=id;
            this.Nombreusuario=Nombreusuario;
            this.contraseña=contraseña;
            this.mail=mail;
            miscompras=new ArrayList<Compra>();
        }
        public Usuario ()
        {
        }
        @Id
        Long id;


        String Nombreusuario;
        String contraseña;
        String mail;

       @OneToMany(mappedBy = "usuario")
        List<Compra> miscompras;

       @OneToOne
       @JoinColumn( name = "id_direccion")
       Direccion direccion;

        @OneToOne
        @JoinColumn(name = "id_tarjeta")
       Tarjeta tarjeta;

        public String getNombreusuario() {
            return Nombreusuario;
        }

        public void setNombreusuario(String nombreusuario) {
            this.Nombreusuario=nombreusuario;
        }

        public void setId(Long id) {
            this.id=id;
        }

        public Long getId() {
            return id;
        }

        public void setContraseña(String contraseña) {
            this.contraseña = contraseña;
        }

        public String getContraseña() {
            return contraseña;
        }

        public void setMail(String mail) {
            this.mail = mail;
        }

        public String getMail() {
            return mail;
        }
    }
