package com.example.blog_pessoal.repository;

import com.example.blog_pessoal.model.Postagem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PostagemRepository extends JpaRepository <Postagem, Long>  {
}
