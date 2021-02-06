package es.capgemini.curso.gestion.model;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import es.capgemini.curso.gestion.model.entities.Producto;

@Repository
public interface ProductoDAO extends JpaRepository<Producto, Integer>{

}
