package com.TrabajoPractico.BackendtiendaMG.repository;


import com.TrabajoPractico.BackendtiendaMG.model.Articulo;
import com.TrabajoPractico.BackendtiendaMG.model.Usuario;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Usuario_repositorio extends CrudRepository <Usuario, Long>{
}
