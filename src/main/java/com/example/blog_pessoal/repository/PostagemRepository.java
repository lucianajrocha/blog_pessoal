package com.example.blog_pessoal.repository;

import com.example.blog_pessoal.model.Postagem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import java.util.List;

public interface PostagemRepository extends JpaRepository <Postagem, Long>  {

    List<Postagem>findAllByTituloContainingIgnoreCase(@Param("titulo")String titulo);
// SELECT * FROM tb_postagens where titulo like %titulo%;
}
