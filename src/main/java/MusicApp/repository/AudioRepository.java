package MusicApp.repository;

import MusicApp.model.Audio;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface AudioRepository extends CrudRepository<Audio, Long> {
    Optional<Audio> findAudioByTitle(String title);
}
