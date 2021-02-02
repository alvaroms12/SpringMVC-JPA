package es.capgemini.curso.gestion.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
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

	@GetMapping(path = { "/categoria/{idCategoria}" })
	public ModelAndView detallesCategoria(@PathVariable("idCategoria") int idCategoria) {
		ModelAndView mv = new ModelAndView();

		mv.addObject("categoria", categoria.findById(idCategoria).get().getProductos());
		mv.setViewName("categoria");

		return mv;
	}

	/*
	 * @PostMapping("/categoria") public ModelAndView
	 * procesarCategoria(@RequestParam("idCategoria") int id) { return new
	 * ModelAndView("list-productos", "categoria", categoria.findById(id)); }
	 * deducir conclusiones y problemas
	 * @GetMapping("/productos") public ModelAndView
	 * mostrarProductos(@RequestParam("idCategoria") int id) { return new
	 * ModelAndView("list-productos", "producto", producto.findById(id).get()); }
	 */
}
