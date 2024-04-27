package com.TrabajoPractico.BackendtiendaMG.repository;


import com.TrabajoPractico.BackendtiendaMG.model.Articulo;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface Articulo_repositorio extends CrudRepository <Articulo, Long> {

    @Override
    Optional findById(Long id);

    List<Articulo> findByTemporada (String temporada);



}
