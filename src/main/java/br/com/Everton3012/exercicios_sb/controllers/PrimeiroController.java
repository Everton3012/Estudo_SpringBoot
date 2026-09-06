package br.com.Everton3012.exercicios_sb.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PrimeiroController {

    @RequestMapping(method = RequestMethod.GET, path = "/ola-mundo")
    public String olaMundo() {
        return "Olá, mundo!";
    }
}
