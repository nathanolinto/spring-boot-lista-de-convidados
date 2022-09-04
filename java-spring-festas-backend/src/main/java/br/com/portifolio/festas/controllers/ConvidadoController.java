package br.com.portifolio.festas.controllers;

import java.util.Optional;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.portifolio.festas.entities.Convidado;
import br.com.portifolio.festas.repositories.ConvidadoRepository;
import br.com.portifolio.festas.services.ConvidadoService;

@RestController
@RequestMapping("/convidado")
public class ConvidadoController {
    @Autowired
    private ConvidadoService convidadoService;

    @GetMapping("/{id}")
    public String obterNomeConvidado( @PathVariable(name = "id") String id) {
        return convidadoService.getNomeById(id);
    }
}
