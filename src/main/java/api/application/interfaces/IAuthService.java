package api.application.interfaces;

import api.domain.entities.Auth;
import api.domain.entities.User;

import java.util.Optional;

public interface IAuthService {
    Optional<User> findUserByEmail(String email);

    Auth login(String email, String password);
    String validateToken(String token);
}
