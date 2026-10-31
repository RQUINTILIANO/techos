package br.com.bugnacio.techos.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

 
import java.util.List;
 

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
 
// @Controller: bean do Spring, a recepcao dos pedidos de clientes.
@Controller
// @RequestMapping na classe: o comeco do endereco para TODOS os metodos daqui.
@RequestMapping("/equipamentos")
public class EquipamentosController {
 
    // @GetMapping vazio = o proprio "/clientes".
    // Endereco completo: http://localhost:8080/clientes
    @GetMapping
    public String listar(Model model) {
 
        // A tela clientes/lista espera uma lista chamada "clientes".
        // Ainda nao temos banco, entao mandamos uma lista VAZIA (List.of()).
        // A tela mostra o "estado vazio". Na aula 5 essa lista vem do banco.
        model.addAttribute("equipamentos", List.of());
 
        // SEM @ResponseBody: o texto devolvido e o nome da tela.
        // Abre: src/main/resources/templates/clientes/lista.html
        return "equipamentos/lista";
    }
}