package ru.exemple.spring.repository;

import org.springframework.data.repository.CrudRepository;
import ru.exemple.spring.models.Building;

public interface BuildingRepository extends CrudRepository<Building, Long> {

}
