package security.security.util;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

//Un generador aleatorio de contraseña es un programa o un dispositivo hardware que toma
//entrada de un generador numerico aleatorio o pseudo-aleatorio y automáticamente genera una contraseña.
public class Passgenerator {

    public static void main(String ...args) {
        BCryptPasswordEncoder bCryptPasswordEncoder = new BCryptPasswordEncoder(4);
        //El String que mandamos al metodo encode es el password que queremos encriptar.
	System.out.println(bCryptPasswordEncoder.encode("1234"));

   } 

}

