package backend.persistence;

import backend.domain.GameScore;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;

@Component
public interface GameScoreRepository extends CrudRepository<GameScore, Long> {

}
