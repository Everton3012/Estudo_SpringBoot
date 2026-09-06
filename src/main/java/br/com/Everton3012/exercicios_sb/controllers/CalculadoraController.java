package br.com.Everton3012.exercicios_sb.controllers;

import br.com.Everton3012.exercicios_sb.models.Calculadora;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path="/calculadora")
public class CalculadoraController {
    @GetMapping(path="/subtrair")
    public int subtrair(int a, int b){
        return new Calculadora().subtrair(a, b);
    }

    @GetMapping(path="/somar/{a}/{b}")
    public int somar(@PathVariable int a,@PathVariable int b){
        return new Calculadora().somar(a,b);
    }

    @GetMapping(path="/multiplicar")
    public int multiplicar(int a,int b){
        return new Calculadora().multiplicar(a, b);
    }

    @GetMapping(path="/dividir/{a}/{b}")
    public double dividir(@PathVariable int a, @PathVariable int b){
        return new Calculadora().dividir(a, b);
    }
}

