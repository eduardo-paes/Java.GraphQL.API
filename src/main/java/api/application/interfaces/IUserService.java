package api.application.interfaces;

import api.domain.entities.User;

import java.util.Optional;
import java.util.UUID;

public interface IUserService {
    Iterable<User> getUsers();
    Optional<User> getUser(Long id);
    User add(String email, String password);
    User update(User user);
    void delete(UUID id);
}
