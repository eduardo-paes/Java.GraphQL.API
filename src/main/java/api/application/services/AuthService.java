package api.application.services;

import api.application.interfaces.IAuthService;
import api.application.security.TokenGenerator;
import api.domain.entities.Auth;
import api.domain.entities.User;
import api.domain.interfaces.IAuthRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class AuthService implements IAuthService {

    @Autowired
    private IAuthRepository authRepository;
    @Autowired
    private TokenGenerator tokenGenerator;
    @Autowired
    private PasswordEncoder encoder;

    @Override
    public Optional<User> findUserByEmail(String email) {
        return this.authRepository.findByEmail(email);
    }

    @Override
    public Auth login(String email, String password) {
        Optional<User> optionalUser = this.authRepository.findByEmail(email);
        if (optionalUser.isPresent()) {
            User user = optionalUser.get();
            if (encoder.matches(password, user.getPassword())) {
                String token = tokenGenerator.build(user.getEmail(), user.getRole());
                return new Auth(token, user.getId(), user.getEmail(), user.getRole());
            }
        }
        return null;
    }

    @Override
    public String validateToken(String token) {
        return null;
    }
}
