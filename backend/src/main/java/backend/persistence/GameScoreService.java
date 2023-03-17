package backend.persistence;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GameScoreService {

    @Autowired
    GameScoreRepository gsr;
}
