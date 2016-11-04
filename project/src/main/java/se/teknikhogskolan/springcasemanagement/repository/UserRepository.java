package se.teknikhogskolan.springcasemanagement.repository;

import java.util.Collection;
import java.util.List;

import org.springframework.data.repository.CrudRepository;

import se.teknikhogskolan.springcasemanagement.model.User;

public interface UserRepository extends CrudRepository<User, Long> {
	
	Collection<User> findByTeamId(Long teamId);

    User findByUserNumber(Long userNumber);
    
    List<User> findByFirstNameContainingAndLastNameContainingAndUsernameContaining(String firstName, String lastName,
            String username);

}
