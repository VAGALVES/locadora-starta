package br.com.startaideia.controller;

import br.com.startaideia.request.CriarLocadoraRequest;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/rent") //Este serviço está mapeado para esta url

public class RentController {

    @PostMapping
    public String criarLocadora(@RequestBody CriarLocadoraRequest request){
        return "sucesso";
    }
    
}

