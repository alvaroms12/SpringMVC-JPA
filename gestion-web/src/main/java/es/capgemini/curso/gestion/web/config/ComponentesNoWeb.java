package es.capgemini.curso.gestion.web.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = {"es.capgemini.curso.gestion.model"})
public class ComponentesNoWeb {

}
