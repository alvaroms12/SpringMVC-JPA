package es.capgemini.curso.gestion.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ControllerWeb {

	/*@Autowired
	private CategoriaDAO categoria;
	
	@Autowired
	private ProductoDAO producto;*/
	
	@GetMapping(path = {"/"})
	public ModelAndView index() {
		return new ModelAndView("index");
	}
	
	/*@PostMapping("/categoria")
	public ModelAndView procesarCategoria(@RequestParam("idCategoria") int id) {
		return new ModelAndView("list-productos", "categoria", categoria.findById(id));
	}
	
	@GetMapping("/productos")
	public ModelAndView mostrarProductos(@RequestParam("idCategoria") int id) {
		return new ModelAndView("list-productos", "producto", producto.findById(id).get());
	}*/
} 
