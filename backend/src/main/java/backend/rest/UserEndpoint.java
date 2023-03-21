package backend.rest;

import backend.domain.Game;
import backend.domain.GameCollection;
import backend.domain.User;
import backend.persistence.GameCollectionService;
import backend.persistence.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCrypt;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserEndpoint {

    @Autowired
    UserService userService;

    @Autowired
    GameCollectionService gameCollectionService;

    @PostMapping("user/createNewUser")
    public void createNewUser(@RequestBody User user){
        User newUser = new User();
        String hashedPW = BCrypt.hashpw(user.getInput(), BCrypt.gensalt());
        newUser.setPassword(hashedPW);
        newUser.setUsername(user.getUsername());
        GameCollection gameCollection = new GameCollection();
        gameCollectionService.saveGameCollection(gameCollection);
        newUser.setGameCollection(gameCollection);
        userService.saveUser(newUser);
    }

    @PostMapping("user/checkUserCredentials")
    public boolean checkUserCredentials(@RequestBody User user){
        User currentUser = userService.findByUsername(user.getUsername());
        if(BCrypt.checkpw(user.getInput(), currentUser.getPassword())){
            return true;
        } else {
            return false;
        }
    }
}

