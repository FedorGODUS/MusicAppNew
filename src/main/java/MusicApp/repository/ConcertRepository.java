package MusicApp.repository;

import MusicApp.model.Concert;
import org.springframework.data.repository.CrudRepository;

public interface ConcertRepository extends CrudRepository<Concert, Long> {
}
