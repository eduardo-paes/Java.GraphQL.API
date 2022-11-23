package api.presentation.controller;

import api.application.interfaces.IAuthService;
import api.domain.entities.Auth;
import api.domain.entities.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;

import java.util.Optional;

@Controller
public class AuthController {
    @Autowired
    private IAuthService authService;

    @QueryMapping(name="login")
    public Auth login(@Argument String email, @Argument String password) {
        return authService.login(email, password);
    }

    @QueryMapping(name="findUserByEmail")
    public Optional<User> findUserByEmail(@Argument String email) {
        return authService.findUserByEmail(email);
    }
}
