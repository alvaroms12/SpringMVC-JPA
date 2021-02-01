package es.capgemini.curso.gestion.model;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import es.capgemini.curso.gestion.model.entities.Categoria;

@Repository
public interface CategoriaDAO extends JpaRepository<Categoria, Integer>{
	
	
	
	
}
