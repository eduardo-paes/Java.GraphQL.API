package api.presentation.controller;

import api.application.interfaces.IUserService;
import api.domain.entities.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.security.access.annotation.Secured;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;

import java.util.Optional;
import java.util.UUID;

@Controller
@Secured("IS_AUTHENTICATED_FULLY")
public class UserController {
    @Autowired
    private IUserService userService;

    @QueryMapping(name="user")
    public Optional<User> find(@Argument Long id) {
        return userService.getUser(id);
    }

    @QueryMapping(name="users")
    public Iterable<User> findAll(@Argument UUID id){
        return userService.getUsers();
    }

    @MutationMapping(name = "addUser")
    public User create(@Argument String email, @Argument String password){
        return userService.add(email, password);
    }

}
