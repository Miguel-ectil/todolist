package br.com.miguel.todolist.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/primeiraRota")
// http://localhost:8080/primeiraRota .....
public class PrimeiraController {
    /**
     * Método de acesso do HTTP
     * GET - Buscar uma informacão
     * POST - Adicionar um dado/info
     * PUT - Alterar um dado/info
     * DELETE - Para remover um dado
     * PATCH - Alterar apenas uma parte da info/dado
     */

    // Método (Funcionalidade) de uma classe
    @GetMapping("/pirmeiroMetodo")
    public String primeiraMensagem() {
        return "Funcionou!";
    }
}
