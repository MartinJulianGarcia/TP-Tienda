package com.TrabajoPractico.BackendtiendaMG.repository;


import com.TrabajoPractico.BackendtiendaMG.model.Articulo;
import com.TrabajoPractico.BackendtiendaMG.model.Compra;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Compra_repositorio extends CrudRepository <Compra, Long>{
}
