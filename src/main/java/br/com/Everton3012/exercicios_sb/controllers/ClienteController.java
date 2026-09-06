package br.com.Everton3012.exercicios_sb.controllers;

import br.com.Everton3012.exercicios_sb.models.Cliente;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path="/clientes")
public class ClienteController {
    @GetMapping(path="/qualquer")
    public Cliente getCliente(){
        return new Cliente(1, "Everton", "123.456.789-00");
    }

    @GetMapping(path="/{id}")
    public  Cliente getClienteId(@PathVariable int id){
        return new Cliente(id, "Everton", "123.456.789-00");
    }

    @GetMapping
    public  Cliente getClienteId2(@RequestParam(name="id", defaultValue = "1") int id){
        return new Cliente(id, "David", "111.222.333-00");
    }
}
