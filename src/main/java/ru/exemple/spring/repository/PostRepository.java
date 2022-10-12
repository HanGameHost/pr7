package ru.exemple.spring.repository;

import org.springframework.data.repository.CrudRepository;
import ru.exemple.spring.models.Post;

import java.util.List;

public interface PostRepository extends CrudRepository<Post, Long> {

    List<Post> findByTitleContains(String title);

}
