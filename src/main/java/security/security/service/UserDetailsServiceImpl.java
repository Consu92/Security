package security.security.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import security.security.model.Authority;
import security.security.repository.UserRepository;
import org.springframework.security.core.userdetails.User;

//"@Service", una de las anotaciones más habituales de Spring Framework . 
//Se usa para construir una clase de Servicio que habitualmente se conecta a varios repositorios
//y agrupa su funcionalidad.
@Service
//para indicar que una clase implementa una interfaz se utiliza la palabra reservada "implements".
//una clase puede implementar varios interfaces simultáneamente, pese a que, en Java,
//una clase sólo puede heredar de otra clase (herencia simple de implementación, múltiple de interfaces).
public class UserDetailsServiceImpl implements UserDetailsService {

    @Autowired
    UserRepository userRepository;

    //Cuando se hace sobreescritura de un método en Java, se usa la anotación @Override
    //que le indicará al compilador que se trata de un método que está en la clase principal
    //y se sobreescribirá en ese momento.
    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException{
        //Buscar el usuario con el repository y si no existe vamos a lanzar una exepcion
        //Nosotros generamos la exepcion (crear un error)
        //vamos a guardar en una variable el usuario buscado segun username, si no lo encuentra creamos un error el cual
        //al momento de generarse nos devolcerá el mensaje "no existe el usuario"
        security.security.model.User appUser = userRepository.findByUsername(username).orElseThrow(()-> new UsernameNotFoundException(("no existe el usuario")));

        //vamos a mappear nuestra lista de Authority con las propiedades de spring security

        List gantList = new ArrayList();

        for(Authority authority: appUser.getAuthority()){
            //ROL_USER, ROL_ADMIN, ROL_CLIENT
            GrantedAuthority grantedAuthority = new SimpleGrantedAuthority(authority.getAuthority()); 
            gantList.add(grantedAuthority);
            };

            //Vamos a crear el objeto UserDetails que va a ir en sesion y tambien nos lo va  a retornar

            UserDetails user=(UserDetails) new User(appUser.getUsername(), appUser.getPassword(), gantList);
            return user;
        }
    }
    

