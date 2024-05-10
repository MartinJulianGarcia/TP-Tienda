package com.TrabajoPractico.BackendtiendaMG.Controllers;

import com.TrabajoPractico.BackendtiendaMG.model.Articulo;
import com.TrabajoPractico.BackendtiendaMG.servicios.Articulo_metodos;
import com.TrabajoPractico.BackendtiendaMG.servicios.Compra_metodos;
import org.springframework.beans.factory.annotation.Autowired;


 import org.springframework.web.bind.annotation.*;   //     NO ME FUNCIONA PERO TENGO LA DEPENDENCIA


@RestController
@RequestMapping(value = "/api/Compra")
@CrossOrigin(origins = "*", methods = {RequestMethod.GET, RequestMethod.POST, RequestMethod.PUT, RequestMethod.DELETE})
public class Compra_Controller {

    @Autowired
    private Compra_metodos compraMetodos;

}
