package br.com.portifolio.festas.services;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.portifolio.festas.dto.ConvidadoDTO;
import br.com.portifolio.festas.entities.Convidado;
import br.com.portifolio.festas.repositories.ConvidadoRepository;

@Service
public class ConvidadoService {

    @Autowired
    private ConvidadoRepository convidadoRepository;
    
    public ConvidadoDTO createOrUpdate(ConvidadoDTO convidado) {
        List<Convidado> consulta = convidadoRepository.findByNome(convidado.getNome());
        if (!consulta.isEmpty()){
            return null;
        }
        Convidado entity = new Convidado();
        entity.setId(convidado.getId());
        entity.setNome(convidado.getNome());
        entity = convidadoRepository.save(entity);
        convidado.setId(entity.getId());
        return convidado;
    }

    public List<Convidado> list() {
        return convidadoRepository.findAll();
    }
}
