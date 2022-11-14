package api.presentation.controller;

import api.application.interfaces.IUserService;
import api.domain.entities.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

import java.util.Optional;
import java.util.UUID;

@Controller
public class UserController {
    @Autowired
    private IUserService userService;

    @QueryMapping(name="user")
    public Optional<User> Get(@Argument Long id) {
        return userService.GetUser(id);
    }

    @QueryMapping(name="users")
    public Iterable<User> GetAll(@Argument UUID id){
        return userService.GetUsers();
    }

    @MutationMapping(name = "addUser")
    public User Add(@Argument String email, @Argument String password){
        return userService.Add(email, password);
    }

}
