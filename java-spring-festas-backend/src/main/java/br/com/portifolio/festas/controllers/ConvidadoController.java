package br.com.portifolio.festas.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.portifolio.festas.dto.ConvidadoDTO;
import br.com.portifolio.festas.entities.Convidado;
import br.com.portifolio.festas.services.ConvidadoService;

@RestController
@RequestMapping("/convidados")
public class ConvidadoController {
    @Autowired
    private ConvidadoService convidadoService;


    @GetMapping
    public ResponseEntity<List<Convidado>> listConvidados() {
        return new ResponseEntity<List<Convidado>>(convidadoService.list(), HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<ConvidadoDTO> create(@RequestBody ConvidadoDTO convidado){
        return new ResponseEntity<ConvidadoDTO>(convidadoService.create(convidado), HttpStatus.OK);
    }

}
