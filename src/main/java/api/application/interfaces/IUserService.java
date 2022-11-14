package api.application.interfaces;

import api.domain.entities.User;

import java.util.Optional;
import java.util.UUID;

public interface IUserService {
    Iterable<User> GetUsers();
    Optional<User> GetUser(Long id);
    User Add(String email, String password);
    User Update(User user);
    void Delete(UUID id);
}
