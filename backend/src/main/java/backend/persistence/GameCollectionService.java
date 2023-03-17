package backend.persistence;

import backend.domain.GameCollection;
import backend.domain.Game;
import backend.domain.GameScore;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GameCollectionService {

    @Autowired
    GameCollectionRepository gcr;

    @Autowired
    GameRepository gr;

    @Autowired
    GameScoreRepository gsr;

    public GameCollection findById(long collectionid){
        return gcr.findById(collectionid).get();
    }


    public void saveGameToCollection(Game game, GameCollection gameCollection){
        for(GameScore gameScore : game.getGameScoreList()){
            gsr.save(gameScore);
        }
        gr.save(game);
        gameCollection.getGameList().add(game);
        gcr.save(gameCollection);
    }

}
