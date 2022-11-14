package api.domain.entities;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Setter
@Getter
@Entity
@Table(name = "USER_TB")
public class User {
    @Id
    @GeneratedValue
    private Long id;
    private String email;
    private String password;

    private User() {}

    public User(String email, String password) {
        this.email = email;
        this.password = password;
    }
}
