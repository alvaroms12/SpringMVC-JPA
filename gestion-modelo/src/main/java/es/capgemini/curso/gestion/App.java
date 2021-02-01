package es.capgemini.curso.gestion;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import es.capgemini.curso.gestion.model.CategoriaDAO;
import es.capgemini.curso.gestion.model.ProductoDAO;
import es.capgemini.curso.gestion.model.config.DataBaseConfig;
import es.capgemini.curso.gestion.model.entities.Categoria;
import es.capgemini.curso.gestion.model.entities.Producto;

public class App {

	public static void main(String[] args) {
		// Cargar configuración de Spring para el contexto de ejecución
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(DataBaseConfig.class);

		// Recuperar instancia del repositorio
		CategoriaDAO repository = context.getBean(CategoriaDAO.class);
		
		Categoria cat1 = repository.findById(1).get();
		
		System.out.println(cat1);
		
		ProductoDAO pRepository = context.getBean(ProductoDAO.class);
		
		Producto prod1 = pRepository.findById(2).get();
		
		System.out.println("\n\n" + prod1);

		// Cerrar y liberar contexto
		context.close();

	}

}