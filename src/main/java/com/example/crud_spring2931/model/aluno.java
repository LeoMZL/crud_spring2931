package com.example.crud_spring2931.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "aluno")
@Data
@AllArgsConstructor
@NoArgsConstructor

public class aluno {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String curso;
    //Lombok gera tudo automaticamente
    //getId, getNome, getIdade
    //setId, setNome, setIdade

}
