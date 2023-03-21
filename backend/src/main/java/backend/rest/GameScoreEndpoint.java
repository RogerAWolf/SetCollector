package backend.rest;

import backend.persistence.GameScoreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GameScoreEndpoint {

    @Autowired
    GameScoreService gameScoreService;
}
