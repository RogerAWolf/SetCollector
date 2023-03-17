package backend.persistence;

import backend.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    UserRepository ur;

    public User findById(long id){
        return ur.findById(id).get();
    };
}
