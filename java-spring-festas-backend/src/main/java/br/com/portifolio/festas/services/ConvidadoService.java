package br.com.portifolio.festas.services;

import java.util.Optional;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.portifolio.festas.entities.Convidado;
import br.com.portifolio.festas.repositories.ConvidadoRepository;

@Service
public class ConvidadoService {

    @Autowired
    private ConvidadoRepository convidadoRepository;
    
    public String getNomeById(String id) {
        Optional<Convidado> consulta = convidadoRepository.findById(UUID.fromString(id));
        if (consulta.isPresent()){
            Convidado convidado = consulta.get();
            return convidado.getNome();
        } 
        return null;
    }
}
