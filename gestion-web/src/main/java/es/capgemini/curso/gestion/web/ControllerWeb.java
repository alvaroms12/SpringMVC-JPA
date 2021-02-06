package es.capgemini.curso.gestion.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import es.capgemini.curso.gestion.model.CategoriaDAO;



@Controller
public class ControllerWeb {

	@Autowired
	private CategoriaDAO categoria;
	

	/*
	 * Metodo get para que nos muestre todas las categorías, para ello hago retorno un ModelAndView
	 * cuyos valores son, la página a mostrar que es categoria.jsp, el repositorio que es categoria y
	 * posteriormente los datos filtrados, que serán todas las categorias en este caso 
	 */
	@GetMapping(path = { "/", "/categoria" })
	public ModelAndView index() {
		// , categoria.findAll()
		return new ModelAndView("categoria", "categoria", categoria.findAll());
	}

	/*
	 * Método Get para mostrar todos los productos de una categoría dada, para ello retorno un ModelAndView cuyos valores
	 * son la página a mostrar, que es producto.jsp, el repositorio producto, ya que junto al ultimo parámetro que nos devuelve los prodcutos
	 * cuya categoría es la id que le mandamos, pues podemos mostrar los datos de los productos
	 */
	@GetMapping(path = { "/mostrar" })
	public ModelAndView detallesCategoria(@RequestParam("idcategoria") int id) {
		return new ModelAndView("producto", "categoria", categoria.findById(id).get().getProductos());
	}

}
