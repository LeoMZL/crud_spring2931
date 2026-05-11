package com.example.crud_spring2931.service;

import com.example.crud_spring2931.model.pessoa;
import com.example.crud_spring2931.repository.pessoaRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class pessoaService {

    private final pessoaRepository repository;

    //read
    public List<pessoa> listar() {
        return repository.findAll();
    }


//read buscar por ID

    public pessoa buscarPorId(Long id) {

        return repository.findById(id)
                .orElseThrow(() -> new RuntimeException("Pessoa não encontrada."));
    }
    //create
    public pessoa salvar(pessoa Pessoa){
        return repository.save(Pessoa);
    }
    //update
    public pessoa atualizar(Long id, pessoa dados){
        pessoa Pessoa = buscarPorId(id);
        Pessoa.setNome(dados.getNome());
        Pessoa.setIdade(dados.getIdade());
        return repository.save(Pessoa);
    }
    //delete
    public void excluir(Long id){
        repository.deleteById(id);
    }


}