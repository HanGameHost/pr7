package ru.exemple.spring.repository;

import org.springframework.data.repository.CrudRepository;
import ru.exemple.spring.models.Person;

public interface PersonRepository extends CrudRepository<Person, Long> {
}
