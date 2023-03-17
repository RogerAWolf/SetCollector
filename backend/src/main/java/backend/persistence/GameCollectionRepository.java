package backend.persistence;

import backend.domain.GameCollection;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;

@Component
public interface GameCollectionRepository extends CrudRepository<GameCollection, Long> {

}
