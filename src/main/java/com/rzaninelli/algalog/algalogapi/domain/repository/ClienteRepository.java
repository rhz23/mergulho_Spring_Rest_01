package com.rzaninelli.algalog.algalogapi.domain.repository;

import com.rzaninelli.algalog.algalogapi.domain.model.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface ClienteRepository extends JpaRepository<Cliente, Long> {

    //pesquisa absoluta
    List<Cliente> findByNome(String nome);
    //pesquisa com like%
    List<Cliente> findByNomeContaining(String nome);

    Optional<Cliente> findByEmail(String email);
}
