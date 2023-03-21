package backend.config.jwt;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@Getter
@Setter
public class JwtAuthenticationRequest implements Serializable {
    private String username;
    private String password;
}
