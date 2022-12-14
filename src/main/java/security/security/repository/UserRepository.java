package security.security.repository;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import security.security.model.User;

public interface UserRepository extends CrudRepository<User, Long>  {
    
    public Optional <User> findByUsername(String username);
}
