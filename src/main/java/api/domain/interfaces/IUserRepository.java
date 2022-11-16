package api.domain.interfaces;

import api.domain.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

public interface IUserRepository extends JpaRepository<User, Long> {
}
