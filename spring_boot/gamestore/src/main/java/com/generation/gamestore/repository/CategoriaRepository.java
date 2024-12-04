package com.generation.gamestore.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;

import com.generation.gamestore.model.Categoria;
import com.generation.gamestore.model.Produto;

public interface CategoriaRepository extends JpaRepository<Categoria, Long> {

	public List<Produto> findAllByDescricaoContainingIgnoreCase(@Param("descricao") String descricao);
	
}
