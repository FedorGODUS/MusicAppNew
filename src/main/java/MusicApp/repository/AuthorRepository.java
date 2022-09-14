package MusicApp.repository;

import MusicApp.model.Author;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface AuthorRepository extends CrudRepository<Author, Long> {
    Optional<Author> findAuthorByName(String authorName);
}
