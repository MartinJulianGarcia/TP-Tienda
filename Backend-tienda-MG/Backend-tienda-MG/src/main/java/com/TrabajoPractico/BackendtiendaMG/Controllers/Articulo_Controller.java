package com.TrabajoPractico.BackendtiendaMG.Controllers;


import com.TrabajoPractico.BackendtiendaMG.model.Articulo;
import com.TrabajoPractico.BackendtiendaMG.servicios.Articulo_metodos;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.ArrayList;
import java.util.List;


import org.springframework.web.bind.annotation.*;       // NO ME FUNCIONA PERO TENGO LA DEPENDENCIA



@RestController
@RequestMapping(value = "/api/Articulo")
@CrossOrigin(origins = "*", methods = {RequestMethod.GET, RequestMethod.POST, RequestMethod.PUT, RequestMethod.DELETE})
public class Articulo_Controller {


    @Autowired
    private Articulo_metodos articuloMetodos;

    @GetMapping(value = "/{nombre}")
    public Articulo getArticuloBynombre(@PathVariable String nombre) {
        return articuloMetodos.getArticuloBynombre(nombre);
    }

    @GetMapping(value = "/{tipo}")
    public List<Articulo> getArticuloBytipo(@PathVariable String tipo) {

        return articuloMetodos.getArticuloBytipo(tipo);
    }


}
