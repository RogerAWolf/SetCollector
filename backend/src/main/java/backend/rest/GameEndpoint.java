package backend.rest;

import backend.domain.Game;
import backend.persistence.GameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class GameEndpoint {

    @Autowired
    GameService gameService;

    @CrossOrigin
    @GetMapping("/game/showGameById/{gameid}")
    public Game returnGame(@PathVariable("gameid") int gameid){
        return gameService.findById(gameid);
    }



}
