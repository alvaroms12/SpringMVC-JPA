package es.capgemini.curso.gestion.web.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
// Hay que especificar donde tiene que ir a buscar el repositorio, para usarlo posteriormente
@ComponentScan(basePackages = {"es.capgemini.curso.gestion.model"})
public class ComponentesNoWeb {

}
