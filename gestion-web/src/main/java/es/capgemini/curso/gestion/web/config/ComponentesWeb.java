package es.capgemini.curso.gestion.web.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import org.springframework.web.servlet.view.JstlView;

@Configuration
@EnableWebMvc
@ComponentScan(basePackages = { "es.capgemini.curso.gestion.web" })
public class ComponentesWeb {

	@Bean
	public ViewResolver configurarViewResolver() {
		InternalResourceViewResolver resolver = new InternalResourceViewResolver();

		// Para usar instrucciones JSTL
		resolver.setViewClass(JstlView.class);
		resolver.setPrefix("WEB-INF/vistas/");
		resolver.setSuffix(".jsp");

		return resolver;
	}
}
