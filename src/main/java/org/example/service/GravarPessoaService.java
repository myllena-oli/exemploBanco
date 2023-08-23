package org.example.service;

import org.example.model.Pessoa;
import org.example.model.PessoaEntity;
import org.example.repository.PessoaJpaRepository;
import org.springframework.stereotype.Service;

@Service
public class GravarPessoaService {
    private PessoaJpaRepository pessoaJpaRepository;

    public GravarPessoaService(PessoaJpaRepository pessoaJpaRepository) {
        this.pessoaJpaRepository = pessoaJpaRepository;
    }

    public Long gravarPessoa(Pessoa pessoa) {
        PessoaEntity pessoaEntity = new PessoaEntity(pessoa.getNome(), pessoa.getEmail(), pessoa.getCpf());
        pessoaJpaRepository.save(pessoaEntity);
        return pessoaEntity.getId();
    }
}
