package com.example.crud_spring2931.controller;


import com.example.crud_spring2931.model.aluno;
import com.example.crud_spring2931.service.alunoService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/aluno")
@RequiredArgsConstructor
public class alunoController {

    private final alunoService service;

    //GET /aluno (listar todas)
    @GetMapping
    public List<aluno>listar(){
        return service.listar();
    }

    //GET /aluno/{id} (busca por id)
    @GetMapping("/{id}")
    public ResponseEntity<aluno> buscar(@PathVariable Long id){
        return ResponseEntity.ok(service.buscarPorId(id));

    }
    //Post /aluno/{id}
    @PostMapping
    public ResponseEntity<aluno> salvar(@RequestBody aluno Aluno){
        return ResponseEntity.ok(service.salvar(Aluno));
    }
    //PUT /aluno/{id} (Atualizar)
    @PutMapping("/{id}")
    public ResponseEntity<aluno>atualizar(@PathVariable Long id, @RequestBody aluno dados){
        return ResponseEntity.ok(service.atualizar(id, dados));
    }
    //delete /aluno/{id}
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> excluir(@PathVariable Long id){
        service.excluir(id);
        return ResponseEntity.noContent().build(); 
    }


}
