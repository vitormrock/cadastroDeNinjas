package dev.java10x.cadastroDeNinjas;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController //Diz que a classe será um Controller RESt
@RequestMapping // Pode definir um caminho base para as rotas
public class Controller {

    @GetMapping ("/boasvindas") // Define uma rota para requisições GET
    public String boasVindas(){
        return "Essa é minha primeira aplicação caralho!!!";
    }

}
