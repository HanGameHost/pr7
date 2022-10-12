package ru.exemple.spring.repository;

import org.springframework.data.repository.CrudRepository;
import ru.exemple.spring.models.Floor;

public interface FloorRepository extends CrudRepository<Floor, Long> {
    Floor findByInfo(String info);
}
