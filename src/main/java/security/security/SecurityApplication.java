package security.security;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//"SpringBoot" sigue siendo Spring tradicional pero gracias a sus sistemas de automatización, puede autoconfigurarse.
@SpringBootApplication
public class SecurityApplication {

	public static void main(String[] args) {
		SpringApplication.run(SecurityApplication.class, args);
	}

}


// *@SpringBootApplication es una anotación que ejecuta tres anotaciones de autoconfiguración con sus valores por defecto:
// @EnableAutoConfiguration, @ComponentScan y @Configuration (Hay que aclarar que la autoconfiguración de las anotaciones se pueden modificar.)
//@Configuration indica que una clase declara uno o más métodos @Bean y puede ser procesada por el
//contenedor Spring para generar definiciones de beans y solicitudes de servicio para esos beans en tiempo de ejecución.
