package ru.exemple.spring.repository;

import org.springframework.data.repository.CrudRepository;
import ru.exemple.spring.models.Computer;

import java.util.List;

public interface CompRepository extends CrudRepository<Computer, Long> {
    List<Computer> findByCpuContains(String cpu);
    List<Computer> findByGpu(String gpu);
}
