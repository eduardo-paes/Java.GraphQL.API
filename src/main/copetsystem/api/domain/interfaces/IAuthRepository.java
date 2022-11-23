package api.domain.interfaces;

import api.domain.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface IAuthRepository extends JpaRepository<User, Long> {
    public Optional<User> findByEmail(String email);
}