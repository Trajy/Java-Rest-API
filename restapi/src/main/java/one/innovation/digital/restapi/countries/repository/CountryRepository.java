package one.innovation.digital.restapi.countries.repository;

import one.innovation.digital.restapi.countries.Country;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CountryRepository extends JpaRepository<Country, Long> {
}
