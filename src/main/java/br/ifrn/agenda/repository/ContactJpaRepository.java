package br.ifrn.agenda.repository;

import br.ifrn.agenda.repository.entity.ContactEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ContactJpaRepository extends JpaRepository<ContactEntity, Long> {

    boolean existsByNome(String nome);

    boolean existsByEmail(String email);

    boolean existsByTelefone(String telefone);
}
