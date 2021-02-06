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
		
		// Mostrar el total de categorías
		Long cat2 = repository.count();
		System.out.println("Total de categorias: " + cat2);
		// Mostrar datos de una categoría
		System.out.println(cat1);
		
		ProductoDAO pRepository = context.getBean(ProductoDAO.class);
		
		Producto prod1 = pRepository.findById(2).get();
		
		// Mostrar un producto
		System.out.println("\nProducto1:\n" + prod1);
		
		Categoria cat3 = repository.findById(2).get();
		// Mostrar todos los productos de una categoría dada
		for (int i = 0; i < cat3.getProductos().size(); i++) {
			System.out.println("Id producto: " + cat3.getProductos().get(i).getIdproducto() + " nombre producto: " + cat3.getProductos().get(i).getNombre() +
					" precio producto: " + cat3.getProductos().get(i).getPrecio() + " unidades producto: " + cat3.getProductos().get(i).getUnidades());
		}

		// Cerrar y liberar contexto
		context.close();

	}

}
