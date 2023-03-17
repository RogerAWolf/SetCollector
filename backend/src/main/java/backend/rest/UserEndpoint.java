package backend.rest;

import backend.persistence.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserEndpoint {

    @Autowired
    UserService us;
}
