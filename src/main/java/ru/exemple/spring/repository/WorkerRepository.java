package ru.exemple.spring.repository;

import org.springframework.data.repository.CrudRepository;
import ru.exemple.spring.models.Worker;

public interface WorkerRepository extends CrudRepository<Worker, Long> {
    Worker findByFirstname(String firstname);
}
