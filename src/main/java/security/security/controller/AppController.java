package security.security.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

//@Controller, componente es el que responde a la interacción (eventos)
//que hace el usuario en la interfaz y realiza las peticiones al modelo para pasar estos a la vista.

//@GetMapping permite simplificar el manejo de los diferentes métodos de Spring MVC y los @RequestMappings
//que a veces se hacen un poco pesados. A partir de ahora nosotros podemos usar estas anotaciones y simplificar el código.

@Controller
public class AppController {
    
    @GetMapping({"/","login"}) 
    public String index(){
        //el retorno se debe llamar Igual que nuestro html
        return "index";
    }

    @GetMapping({"/menu"}) 
    public String menu(){
        return "menu";
    }


    @GetMapping({"/user"}) 
    public String user(){
        return "user";
    }

    @GetMapping({"/admin"}) 
    public String admin(){
        return "admin";
    }

    
}
