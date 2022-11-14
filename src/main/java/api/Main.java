package api;

import api.application.services.UserService;
import api.domain.entities.User;
import net.bytebuddy.utility.RandomString;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.List;
import java.util.stream.Stream;

@SpringBootApplication
public class Main {
    public static void main(String[] args) {
        SpringApplication.run(Main.class, args);
    }

    @Bean
    ApplicationRunner applicationRunner(UserService userService){
        return args -> {
            Stream.of("test1@email.com", "test2@email.com", "test3@email.com").forEach(email -> {
                userService.Add(email, RandomString.hashOf(16));
            });
        };
    }
}