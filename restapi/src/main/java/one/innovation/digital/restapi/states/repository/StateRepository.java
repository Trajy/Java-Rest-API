package one.innovation.digital.restapi.states.repository;

import one.innovation.digital.restapi.states.State;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StateRepository extends JpaRepository<State, Long> {

}
