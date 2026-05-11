package com.example.crud_spring2931.controller;


import com.example.crud_spring2931.model.pessoa;
import com.example.crud_spring2931.service.pessoaService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/aluno")
@RequiredArgsConstructor
public class pessoaController {

    private final pessoaService service;

    //GET /aluno (listar todas)
    @GetMapping
    public List<pessoa>listar(){
        return service.listar();
    }

    //GET /aluno/{id} (busca por id)
    @GetMapping("/{id}")
    public ResponseEntity<pessoa> buscar(@PathVariable Long id){
        return ResponseEntity.ok(service.buscarPorId(id));

    }
    //Post /aluno/{id}
    @PostMapping
    public ResponseEntity<pessoa> salvar(@RequestBody pessoa Pessoa){
        return ResponseEntity.ok(service.salvar(Pessoa));
    }
    //PUT /aluno/{id} (Atualizar)
    @PutMapping("/{id}")
    public ResponseEntity<pessoa>atualizar(@PathVariable Long id, @RequestBody pessoa dados){
        return ResponseEntity.ok(service.atualizar(id, dados));
    }
    //delete /aluno/{id}
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> excluir(@PathVariable Long id){
        service.excluir(id);
        return ResponseEntity.noContent().build(); 
    }


}
