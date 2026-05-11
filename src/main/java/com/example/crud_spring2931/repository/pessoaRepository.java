package com.example.crud_spring2931.repository;

import com.example.crud_spring2931.model.pessoa;
import org.springframework.data.jpa.repository.JpaRepository;

public interface pessoaRepository extends JpaRepository<pessoa, Long> {
    //Jpa gera automaticamente
    //save(), findAll()
    //delete by Id


}
