package br.com.Everton3012.exercicios_sb.controllers;

import br.com.Everton3012.exercicios_sb.models.Cliente;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path="/clientes")
public class ClienteController {
    @GetMapping(path="/qualquer")
    public Cliente getCliente(){
        return new Cliente(1, "Everton", "123.456.789-00");
    }
}
