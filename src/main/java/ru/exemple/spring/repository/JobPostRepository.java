package ru.exemple.spring.repository;

import org.springframework.data.repository.CrudRepository;
import ru.exemple.spring.models.JobPost;

public interface JobPostRepository extends CrudRepository<JobPost, Long> {
    JobPost findByName(String name);
}
