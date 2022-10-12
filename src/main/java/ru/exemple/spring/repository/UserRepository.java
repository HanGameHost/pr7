package ru.exemple.spring.repository;


import org.springframework.data.repository.CrudRepository;
import ru.exemple.spring.models.User;

public interface UserRepository extends CrudRepository<User, Long> {

    User findByUsername(String username);
}
