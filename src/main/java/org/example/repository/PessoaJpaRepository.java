package org.example.repository;

import org.example.model.PessoaEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PessoaJpaRepository extends JpaRepository<PessoaEntity, Long> {
}
