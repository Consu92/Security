package security.security.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

//@Entity es una clase de Java ligera, cuyo estado es persistido de manera asociada a una tabla en una base de datos relacional.
//Las instancias de estas entidades corresponden a un registro (conjunto de datos representados en una fila) en la tabla.

//@Id, anotación que se define por lo general a nivel de clase, y es utiliza para indicarle a JPA que secuencia debe de utilizar
// para insertar en la base de datos.

@Entity(name="authority")
public class Authority {

    @Id
    @GeneratedValue 
    private Long id;
    private String authority;
    
    public Authority() {
    }

    public Authority(Long id, String authority) {
        this.id = id;
        this.authority = authority;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getAuthority() {
        return authority;
    }

    public void setAuthority(String authority) {
        this.authority = authority;
    }

    

    

  
}

