package api.domain.account;

import api.domain.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IAuthenticateRepository extends JpaRepository<User, Long> {
    String Login(String email, String password);
    boolean RegisterUser(String email, String password);
    boolean GenerateToken(String token);
    boolean ValidateToken(String token);
    boolean RefreshToken(String token);
    void Logout();
}
