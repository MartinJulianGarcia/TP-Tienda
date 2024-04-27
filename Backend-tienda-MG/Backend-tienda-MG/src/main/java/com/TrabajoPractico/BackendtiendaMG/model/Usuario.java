package com.TrabajoPractico.BackendtiendaMG.model;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import jakarta.persistence.*;

@Entity
public abstract class Usuario
    {
        public Usuario (long id, String Nombreusuario, String contraseña, String mail)
        { this.id=id;
            this.Nombreusuario=Nombreusuario;
            this.contraseña=contraseña;
            this.mail=mail;
        }
        public Usuario ()
        {
        }
        @Id
        long id;
        String Nombreusuario;
        String contraseña;
        String mail;

        public String getNombreusuario() {
            return Nombreusuario;
        }

        public void setNombreusuario(String nombreusuario) {
            this.Nombreusuario=nombreusuario;
        }

        public void setId(long id) {
            this.id=id;
        }

        public long getId() {
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
