package com.ceuci.feiraLivre.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ceuci.feiraLivre.models.CategoriaModel;

public interface CategoriaRepository extends JpaRepository<CategoriaModel, Long> {

}
