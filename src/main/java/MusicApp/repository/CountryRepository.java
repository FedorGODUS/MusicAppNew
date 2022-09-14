package MusicApp.repository;

import MusicApp.model.Country;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface CountryRepository extends CrudRepository<Country, Long> {
    Optional<Country> findCountryByCountryName(String countryName);
}
