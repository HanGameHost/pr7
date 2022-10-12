package ru.exemple.spring.repository;

import org.springframework.data.repository.CrudRepository;
import ru.exemple.spring.models.Keyboard;

import java.util.List;

public interface KeyBoardRepository extends CrudRepository<Keyboard, Long> {

    List<Keyboard> findByFormPer(Integer formPer);

    List<Keyboard> findByNameContaining(String name);

}
