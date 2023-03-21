package backend.rest;

import backend.domain.GameCollection;
import backend.domain.Game;
import backend.persistence.GameCollectionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class GameCollectionEndpoint {

    @Autowired
    GameCollectionService gameCollectionService;

    @PostMapping("gameCollection/saveGameToCollection/{collectionid}")
    public void saveGameToCollection(@PathVariable("collectionid") int collectionid, @RequestBody Game game){
        GameCollection gameCollection = gameCollectionService.findById(collectionid);
        gameCollectionService.saveGameToCollection(game, gameCollection);
    }


    @GetMapping("gameCollection/getCollection/{collectionid}")
    public GameCollection getCollection(@PathVariable("collectionid") int collectionid){
        return gameCollectionService.findById(collectionid);
    }
}
