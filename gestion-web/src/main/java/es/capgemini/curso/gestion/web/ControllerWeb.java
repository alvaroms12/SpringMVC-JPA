package es.capgemini.curso.gestion.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import es.capgemini.curso.gestion.model.CategoriaDAO;
import es.capgemini.curso.gestion.model.ProductoDAO;



@Controller
public class ControllerWeb {

	@Autowired
	private CategoriaDAO categoria;

	@Autowired
	private ProductoDAO producto;

	@GetMapping(path = { "/", "/categoria" })
	public ModelAndView index() {
		// , categoria.findAll()
		return new ModelAndView("categoria", "categoria", categoria.findAll());
	}

	@GetMapping(path = { "/mostrar" })
	public ModelAndView detallesCategoria(@RequestParam("idcategoria") int id) {
		return new ModelAndView("producto", "categoria", categoria.findById(id).get().getProductos());
	}

}
