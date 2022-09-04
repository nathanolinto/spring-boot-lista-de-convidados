package br.com.portifolio.festas.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.portifolio.festas.dto.ConvidadoDTO;
import br.com.portifolio.festas.services.ConvidadoService;

@RestController
@RequestMapping("/convidado")
public class ConvidadoController {
    @Autowired
    private ConvidadoService convidadoService;

    @PostMapping
    public ConvidadoDTO create(@RequestBody ConvidadoDTO convidado){
        return convidadoService.create(convidado);
    }

    @GetMapping("/{id}")
    public String obterNomeConvidado(@PathVariable(name = "id") String id) {
        return convidadoService.getNomeById(id);
    }
}
