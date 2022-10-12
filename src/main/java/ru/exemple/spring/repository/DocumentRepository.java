package ru.exemple.spring.repository;

import org.springframework.data.repository.CrudRepository;
import ru.exemple.spring.models.Documents;

public interface DocumentRepository extends CrudRepository<Documents, Long> {
    Documents findBySNILS(String snils);
}
