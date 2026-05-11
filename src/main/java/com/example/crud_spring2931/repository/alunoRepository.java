package com.example.crud_spring2931.repository;

import com.example.crud_spring2931.model.aluno;
import org.springframework.data.jpa.repository.JpaRepository;

public interface alunoRepository extends JpaRepository<aluno, Long> {
    //Jpa gera automaticamente
    //save(), findAll()
    //delete by Id


}
