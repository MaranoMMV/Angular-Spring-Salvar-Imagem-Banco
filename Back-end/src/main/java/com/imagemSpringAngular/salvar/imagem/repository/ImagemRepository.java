package com.imagemSpringAngular.salvar.imagem.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.imagemSpringAngular.salvar.imagem.entity.Imagem;

public interface ImagemRepository extends JpaRepository<Imagem, Long> {
	Optional<Imagem> findByName(String name);
}