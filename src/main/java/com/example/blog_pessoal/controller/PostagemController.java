package com.example.blog_pessoal.controller;


import com.example.blog_pessoal.model.Postagem;
import com.example.blog_pessoal.repository.PostagemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.service.annotation.GetExchange;

import java.util.List;

@RestController
@RequestMapping("/postagens")
@CrossOrigin(origins = "+", allowedHeaders = "+")
public class PostagemController {

    @Autowired
    private PostagemRepository postagemRepository;

    @GetMapping
    public ResponseEntity<List<Postagem>> gelAll(){
        return ResponseEntity.ok(postagemRepository.findAll());
    }
    
}
