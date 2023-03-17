package backend.persistence;

import backend.domain.Game;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;

@Component
public interface GameRepository extends CrudRepository<Game, Long> {

}
