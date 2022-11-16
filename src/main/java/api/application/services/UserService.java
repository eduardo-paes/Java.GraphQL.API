package api.application.services;

import api.application.interfaces.IUserService;
import api.domain.entities.User;
import api.domain.enums.ERole;
import api.domain.interfaces.IUserRepository;
import net.bytebuddy.utility.RandomString;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.Optional;
import java.util.UUID;
import java.util.stream.Stream;

@Service
public class UserService implements IUserService {
    @Autowired
    private IUserRepository userRepository;
    @Autowired
    private PasswordEncoder encoder;

    @Override
    public Iterable<User> getUsers() {
        return userRepository.findAll();
    }

    @Override
    public Optional<User> getUser(Long id) {
        return userRepository.findById(id);
    }

    @Override
    public User add(String email, String password) {
        User user = new User(email, encoder.encode(password));
        user.setUserAsAdmin();
        return userRepository.save(user);
    }

    @Override
    public User update(User user) {
        return null;
    }

    @Override
    public void delete(UUID id) {

    }

    public void mockInit(){
        Stream.of("test1@email.com", "test2@email.com", "test3@email.com").forEach(email -> {
            String password = RandomString.make();
            System.out.println(password);
            this.add(email, password);
        });
    }
}
