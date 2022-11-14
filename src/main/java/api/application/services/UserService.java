package api.application.services;

import api.application.interfaces.IUserService;
import api.domain.entities.User;
import api.domain.interfaces.IUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;
import java.util.UUID;

@Service
public class UserService implements IUserService {
    @Autowired
    private IUserRepository userRepository;

    @Override
    public Iterable<User> GetUsers() {
        return userRepository.findAll();
    }

    @Override
    public Optional<User> GetUser(Long id) {
        return userRepository.findById(id);
    }

    @Override
    public User Add(String email, String password) {
        User user = new User(email, password);
        return userRepository.save(user);
    }

    @Override
    public User Update(User user) {
        return null;
    }

    @Override
    public void Delete(UUID id) {

    }
}
