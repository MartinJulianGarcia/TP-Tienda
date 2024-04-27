package com.TrabajoPractico.BackendtiendaMG;

import com.TrabajoPractico.BackendtiendaMG.model.Articulo;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.TrabajoPractico.BackendtiendaMG.model.*;

import jakarta.persistence.*;

import java.util.ArrayList;

@SpringBootApplication
public class BackendTiendaMgApplication
{

	public static void main(String[] args)
	{

	//	SpringApplication.run(BackendTiendaMgApplication.class, args);

        System.out.printf("Bienvenido a la tienda! \n");
		System.out.printf(Articulo.retornarclase());

	   Articulo a1 =new Articulo();
		int a2=20;

		System.out.printf( "Quiero mostrar texto \n y variables %d",a2);


	}




}
