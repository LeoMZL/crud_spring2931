package com.example.crud_spring2931.service;

import com.example.crud_spring2931.model.aluno;
import com.example.crud_spring2931.repository.alunoRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class alunoService {

    private final alunoRepository repository;

    //read
    public List<aluno> listar() {
        return repository.findAll();
    }


//read buscar por ID

    public aluno buscarPorId(Long id) {

        return repository.findById(id)
                .orElseThrow(() -> new RuntimeException("Pessoa não encontrada." + id));
    }
    //create
    public aluno salvar(aluno Aluno){
        return repository.save(Aluno);
    }
    //update
    public aluno atualizar(Long id, aluno dados){
        aluno Aluno = buscarPorId(id);
        Aluno.setNome(dados.getNome());
        Aluno.setCurso(dados.getCurso());
        return repository.save(Aluno);
    }
    //delete
    public void excluir(Long id){
        repository.deleteById(id);
    }


}