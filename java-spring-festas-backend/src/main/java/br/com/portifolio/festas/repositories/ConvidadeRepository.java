package br.com.portifolio.festas.repositories;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import br.com.portifolio.festas.entities.Convidado;

public interface ConvidadeRepository extends JpaRepository<Convidado, UUID> {
    
}
