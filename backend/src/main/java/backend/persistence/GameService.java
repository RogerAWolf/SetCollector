package backend.persistence;

import backend.domain.Game;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GameService {

    @Autowired
    GameRepository gr;

    public Game findById(long id){
        return gr.findById(id).get();
    }
}
