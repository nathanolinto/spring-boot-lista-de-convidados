package br.com.portifolio.festas.repositories;

import java.util.List;
import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import br.com.portifolio.festas.entities.Convidado;

public interface ConvidadoRepository extends JpaRepository<Convidado, UUID> {
    List<Convidado> findByNome(String nome);
}
